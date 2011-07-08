function Comic(title, volume, issue, pages) {
    this.title = title;
	this.volume = volume;
	this.issue = issue;
	this.pages = pages;
	
	this.currentPage = 0;
}

Comic.prototype.page = function () {
  return this.pages[this.currentPage].src;
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

var comic1 = new Comic("Baffling Mysteries", 1, 6, [
  { src : "comics/Baffling Mysteries 006 (1952)/scan0000.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0001.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0002.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0003.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0004.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0005.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0006.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0007.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0008.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0009.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0010.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0011.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0012.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0013.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0014.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0015.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0016.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0017.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0018.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0019.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0020.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0021.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0022.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0023.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0024.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0025.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0026.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0027.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0028.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0029.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0030.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0031.jpg" },
  { src : "comics/Baffling Mysteries 006 (1952)/scan0032.jpg" },
]);

var comic2 = new Comic("Captain Aero Comics", 1, 1, [
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/01.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/03.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/04.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/05.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/06.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/07.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/08.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/09.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/10.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/11.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/12.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/13.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/14.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/15.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/16.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/17.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/18.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/19.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/20.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/21.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/22.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/23.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/24.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/25.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/26.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/27.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/28.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/29.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/30.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/31.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/32.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/33.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/34.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/35.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/36.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/37.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/38.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/39.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/40.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/41.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/42.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/43.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/44.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/45.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/46.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/47.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/48.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/49.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/50.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/51.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/52.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/53.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/54.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/55.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/56.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/57.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/58.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/59.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/60.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/61.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/62.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/63.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/64.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/65.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/66.jpg" },
  { src : "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/68.jpg" },
]);

var comic3 = new Comic("Wow Comics", 1, 1, [
  { src : "comics/Wow Comics 01f (1940) (c2c)/01.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/02.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/03.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/04.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/05.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/06.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/07.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/08.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/09.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/10.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/11.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/12.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/13.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/14.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/15.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/16.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/17.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/18.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/19.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/20.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/21.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/22.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/23.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/24.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/25.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/26.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/27.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/28.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/29.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/30.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/31.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/32.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/33.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/34.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/35.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/36.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/37.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/38.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/39.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/40.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/41.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/42.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/43.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/44.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/45.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/46.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/47.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/48.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/49.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/50.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/51.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/52.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/53.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/54.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/55.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/56.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/57.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/58.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/59.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/60.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/61.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/62.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/63.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/64.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/65.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/66.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/67.jpg" },
  { src : "comics/Wow Comics 01f (1940) (c2c)/68.jpg" },
]);

var comic4 = new Comic("Wow Comics", 1, 2, [
  { src : "comics/Wow Comics 02f (1941) (c2c)/01.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/02.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/03.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/04.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/05.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/06.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/07.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/08.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/09.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/10.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/11.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/12.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/13.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/14.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/15.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/16.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/17.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/18.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/19.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/20.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/21.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/22.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/23.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/24.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/25.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/26.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/27.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/28.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/29.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/30.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/31.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/32.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/33.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/34.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/35.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/36.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/37.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/38.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/39.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/40.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/41.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/42.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/43.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/44.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/45.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/46.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/47.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/48.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/49.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/50.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/51.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/52.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/53.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/54.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/55.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/56.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/57.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/58.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/59.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/60.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/61.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/62.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/63.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/64.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/65.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/66.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/67.jpg" },
  { src : "comics/Wow Comics 02f (1941) (c2c)/68.jpg" },
]);

var page = new Page();
  
// Hide the reading interface and show the browsing interface.
function browse() {
  $('#page').hide();
  $('#browse').show();
}

// Hide the browsing interface and show the reading interface,
// loading the specified comic for reading.
function read(comic) {
  $('#browse').hide();
  $('#page').show();
  
  page.init(comic);
}

$(document).ready(function() {
  var $container = $('#browse');
    
  $container.isotope({
    itemSelector : '.item',
    masonry : {
      columnWidth : 120
    },
    masonryHorizontal : {
      rowHeight: 120
    },
    cellsByRow : {
      columnWidth : 240,
      rowHeight : 240
    },
    cellsByColumn : {
      columnWidth : 240,
      rowHeight : 240
    }
  });
  
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
});
