function Comic(values) {
  this.title = values.title;
  this.volume = values.volume;
  this.issue = values.issue;
  this.pages = values.pages;
  this.hash = values.hash;

  this.currentPage = 0;
}

Comic.prototype.getHash = function () {
  return this.hash;
};

Comic.prototype.page = function () {
  return this.pages[this.currentPage];
};

Comic.prototype.next = function () {
  if (this.currentPage < (this.pages.length - 1)) {
    this.currentPage++;
  }
};

Comic.prototype.previous = function () {
  if (this.currentPage > 0) {
    this.currentPage--;
  }
};

Comic.prototype.flipTo = function (newPage) {
  if (newPage >= 0 && newPage < this.pages.length) {
    this.currentPage = newPage;
  }
};

// The page is basically a control that sits atop the comic and the DOM
// pieces that are used to display a page from within the comic. We
// create one and can initialize it to display a particular comic.
function Page() {
  this.currentComic = null;
}

Page.prototype.image = $("#page img");
Page.prototype.max_height = 1468;
Page.prototype.max_width = 960;

Page.prototype.init = function(comic) {
  this.currentComic = comic;
  
  // Display the cover page.
  this.displayPage();
};

Page.prototype.load = function(hash, afterLoad) {
  // Check to make sure we haven't already loaded that particular comic. If we
  // have then there's no point in doing anything.
  if (!this.isCurrentComic(hash)) {
    // Get the comic's info from the server.
    netcomixServer.getComic(hash, function (comic) {
      page.init(new Comic(comic));
      
      afterLoad();
    });
  } else {
    afterLoad();
  }
};

Page.prototype.isCurrentComic = function(hash) {
  if (this.currentComic != null) {
    return (this.currentComic.getHash() === hash);
  } else {
    return false;
  }
};

Page.prototype.resize = function(tempImage) {
  var height = tempImage.height;
  var width = tempImage.width;
  var ratio = height / width;

  // If height or width are too large, they need to be scaled down
  // Multiply height and width by the same value to keep ratio constant
  if (height > this.max_height) {
    ratio = this.max_height / height;
    height = height * ratio;
    width = width * ratio;
  }

  if (width > this.max_width) {
    ratio = this.max_width / width;
    height = height * ratio;
    width = width * ratio;
  }

  // Set the source of the image and then change its size to scale it.
  // Browser scaling isn't perfect, but these days most browsers call functions 
  // that use graphics hardware to do high quality scaling quickly.
  this.image.attr("src", this.currentComic.page());

  this.image.attr("width", width);
  this.image.attr("height", height);
};

Page.prototype.displayPage = function () {
  if (this.currentComic != null) {
    // Create a temporary image to load into to find the
    // size of the image prior to scaling and displaying.
    var tempImage = new Image();
    var page = this;

    tempImage.name = this.currentComic.page();
    tempImage.onload = function () {
      window.scrollTo(0, 0);

      // When this function is called, "this" points to something other
      // than the page, that's why I copied it to the page variable above.
      page.resize(tempImage);
    };
    tempImage.src = this.currentComic.page();
  }
};

Page.prototype.flipTo = function (newPage, updateHistory) {
  if (this.currentComic != null) {
    this.currentComic.flipTo(newPage);

    // This function is sometimes invoked in response to user interaction (that
    // is, I want to go to page 25) and sometimes in response to history changes
    // within the browser, if due to the latter, we don't want to update the
    // history in response to our page change.
    if (updateHistory) {
      $.bbq.pushState({
        comic: this.currentComic.hash, 
        displayPage: this.currentComic.currentPage
      }, 2);
    }

    this.displayPage();
  }
};

// User interface function to flip to the next page.
Page.prototype.nextPage = function () {
  if (this.currentComic != null) {
    this.currentComic.next();
    
    // This function is invoked only in response to user interaction, not
    // history events, so it's OK for us to manipulate the history at this 
    // point.
    $.bbq.pushState({
      comic: this.currentComic.hash, 
      displayPage: this.currentComic.currentPage
    }, 2);

    this.displayPage();
  }
};

// User interface function to flip to the previous page.
Page.prototype.previousPage = function () {
  if (this.currentComic != null) {
    this.currentComic.previous();

    // This function is invoked only in response to user interaction, not
    // history events, so it's OK for us to manipulate the history at this 
    // point.
    $.bbq.pushState({
      comic: this.currentComic.hash, 
      displayPage: this.currentComic.currentPage
    }, 2);

    this.displayPage();
  }
};

var page = new Page();

// Hide the reading interface and show the browsing interface.
function browse() {
  // Initialize the browsing interface with an list of comics from which to
  // pick.
  netcomixServer.getNewsstand(function (comics) {
    var list = $("#browse ul");
    var items = "";

    comics.forEach(function (comic) {
      // Add HTML to a string for each item we are adding to the UI. It invokes
      // the function to start reading the comic at a particular page (the
      // first page in this case).
      items += "<li><a onclick=\"loadAndRead('" + comic.hash + "', 0);\"><img height=\"100\" src=\"" + comic.thumbnails[0] + "\"/></a></li>";
    });
    
    list.html(items);

    // Now that we've populated it with something, display the controls for
    // browsing.
    uiMode("browse");
  });
}

// Hide the browsing interface and show the reading interface,
// loading the specified comic for reading.
function loadAndRead(hash, newPage) {
  page.load(hash, function () {
    page.flipTo(newPage, true);

    // Once we're on the right page in the right comic, shift into reading mode.
    uiMode("read");
  });
}

// If we're already in the correct mode, we don't need to flip, just ignore the
// request. This can easily happen when we're moving backward and forward
// through the browser history or when we click on a saved link or one sent to
// us.
function uiMode(mode) {
  // Hide all the interfaces.
  $("div#browse").hide();
  $("div#page").hide();
  $("div#admin").hide();

  // Now show only the selected one.
  if ("read" === mode) {
    $("div#page").show();
  } else if ("browse" === mode) {
    $("div#browse").show();
  } else if ("admin" === mode) {
    $("div#admin").show();
  }
}

// Helpers for binding controls to commands.
function bindMenu() {
  $("span#home").click(function () {
    $.bbq.pushState({}, 2);    
  });
  
  $("span#admin").click(function () {
    $.bbq.pushState({admin: true}, 2);
  });
}

function bindAdmin() {
  $("#processIncoming").click(function() {
    netcomixServer.processIncomingDirectory();
    
    return false;
  });
}

function setupPageTurning() {
  $("#page img").click(function(e) {
    // Based upon where the user clicked, move to the next or previous page.
    var x = e.pageX - this.offsetLeft;
    var y = e.pageY - this.offsetTop;

    // Page width is 960 pixels so we treat a click in the left 320 is the same 
    // as left arrow and the rightmost 320 pixels is the same as right arrow.
    if (x < 320) {
      page.previousPage();
    } else if (x >= 640) {
      page.nextPage();
    }
  });

  // Bind keys to actions within the interface. Note: They are bound to 
  // the document as a whole so no matter what has the current focus, they
  // will bubble up and work.
  $(document).keyup(function(e) {
    switch (e.which) {
      case 37:
        // <-
        page.previousPage();
        break;
      case 39:
        // ->
        page.nextPage();
        break;
      case 77:
        // m
        // page.magnify();
        break;
    }
  });
}

$(document).ready(function () {
  bindMenu();
  bindAdmin();
  setupPageTurning();

  // Bind a callback that executes when document.location.hash changes.
  $(window).bind("hashchange", function(e) {
    var state = $.bbq.getState();

    // Figure out what sort of command should be executed to get us to get the
    // UI to reflect the state in the URL.
    if (typeof state.comic != "undefined") {
      // Do we have a comic currently and if so, is it the same one referred to
      // in the state? If not load it.
      page.load(state.comic, function () {
        page.flipTo(state.displayPage, false);

        uiMode("read");
      });
    } else if (state.admin) {
      uiMode("admin");
    } else {
      browse();
    }
  });

  // Since the event is only triggered when the hash changes, we need
  // to trigger the event now, to handle the hash the page may have
  // loaded with.
  $(window).trigger("hashchange");
});
