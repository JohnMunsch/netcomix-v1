function Comic(values) {
  this.title = values.title;
  this.volume = values.volume;
  this.issue = values.issue;
  this.pages = values.pages;

  this.currentPage = 0;
}

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
  // Browser scaling isn't perfect, but these days most browsers call functions that 
  // use graphics hardware to do high quality scaling quickly.
  this.image.attr("src", this.currentComic.page());

  this.image.attr("width", width);
  this.image.attr("height", height);
};

Page.prototype.displayPage = function() {
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

Page.prototype.nextPage = function() {
  if (this.currentComic != null) {
    this.currentComic.next();
    this.displayPage();
  }
};

Page.prototype.previousPage = function() {
  if (this.currentComic != null) {
    this.currentComic.previous();
    this.displayPage();
  }
};

var page = new Page();
  
// Hide the reading interface and show the browsing interface.
function browse() {
  netcomixServer.getNewsstand(function (comics) {
	var list = $("#browse ul");
	var items;
	
    comics.forEach(function (comic) {
      // Add HTML to a string for each item we are adding to the UI.
      items += "<li><a onclick=\"read('" + comic.hash + "');\"><img height=\"100\" src=\"" + comic.thumbnails[0] + "\"/></a></li>";
    });
    list.html(items);
  });
  
  $('#page').hide();
  $('#browse').show();
}

// Hide the browsing interface and show the reading interface,
// loading the specified comic for reading.
function read(hash) {
  // Get the comic's info from the server.
  netcomixServer.getComic(hash, function (comic) {
    // Once we've got it, shift into reading mode.
    $('#browse').hide();
    $('#page').show();

    page.init(new Comic(comic));
  });
}

function bindMenu() {
  $("#home").click(browse);
}

function setupPageTurning() {
  $("#page img").click(function(e) {
    // Based upon where the user clicked, move to the next or previous page.
    var x = e.pageX - this.offsetLeft;
    var y = e.pageY - this.offsetTop;

    // Page width is 960 pixels so the left 320 is the same as left arrow
	// and the rightmost 320 pixels is the same as right arrow.
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

$(document).ready(function() {
  bindMenu();
  setupPageTurning();

  browse();
});
