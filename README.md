Introduction

This is a project for testing out ideas for a CBZ comics reader that would have 
a nice UI written in HTML, CSS, and JavaScript (with a healthy dose of jQuery) 
and a very simple server API.

Here's what it can do today (and it's not much). You can build it with Apache
Ant (I used 1.8.2) and Java 6 (I used 1.6.0_26), then you can deploy the 
resulting WAR file (dist/netcomix.war) to a Java EE server (I used Tomcat 
7.0.16), and you can visit the web app in your browser and you'll see some 
thumbnail images of comic covers.

Click one to start reading a comic (there are only two from which to chose :). 
You can use the left and right arrows on the keyboard to move forward and 
backward through the pages or click on the left third or right third of a page 
to page through with the mouse.

Notice that despite it being a so-called "one page app" all of the browser
history buttons work perfectly well to move backwards and forwards through the
pages you've visited. You can also bookmark pages and send a link to someone
else to have them jump directly to a specific page within a comic. 

That's it.

However, I did get to try out a lot of JavaScript/jQuery stuff I had not tried
out before and I've got my first DWR code in there to let me communicate some
info from the server to the client UI.

Tech Overview

Client Side: HTML, CSS, JavaScript with jQuery, and jQuery BBQ. That's it for 
the moment and I got the best parts of it from the HTML 5 Boilerplate 
(http://html5boilerplate.com/). You can see most of my contribution thus far in 
the war/index.html and war/js/script.js files.

Server Side: Java, DWR. That's it for the moment although clearly the server
side has a lot of complexity that will have to be added including things like
search (probably Solr), persistence of info about the comics (probably 
Hibernate), possibly dependency injection (Spring), and actually pulling apart
a CBZ file into its constituent parts in order to serve up individual page
images to the client. 

Note: There are a couple of comics in the war/comics directory that I'm using
for testing. Both are out of copyright, see Digital Comic Museum 
(http://digitalcomicmuseum.com/) for more information and other golden age 
comics that never had their copyrights renewed. Another similar site is 
Golden Age Comics (http://goldenagecomics.co.uk/) though I haven't spent much 
time there yet.