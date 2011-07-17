package com.johnmunsch.netcomix;

public class Server {
    private String comic1 = 
        "{ \"title\" : \"Baffling Mysteries\", " +
        "  \"volume\" : 1, " + 
        "  \"issue\" : 6, " + 
        "  \"pages\" : [ " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0000.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0001.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0002.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0003.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0004.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0005.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0006.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0007.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0008.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0009.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0010.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0011.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0012.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0013.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0014.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0015.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0016.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0017.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0018.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0019.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0020.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0021.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0022.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0023.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0024.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0025.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0026.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0027.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0028.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0029.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0030.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0031.jpg\" }, " + 
        "    { \"src\" : \"comics/Baffling Mysteries 006 (1952)/scan0032.jpg\" } " + 
        "  ] " + 
        "}";

    private String comic2 = 
        "{ \"title\" : \"Captain Aero Comics\", " +
        "  \"volume\" : 1, " +
        "  \"issue\" : 1, " +
        "  \"pages\" : [ " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/01.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/03.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/04.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/05.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/06.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/07.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/08.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/09.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/10.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/11.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/12.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/13.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/14.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/15.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/16.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/17.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/18.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/19.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/20.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/21.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/22.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/23.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/24.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/25.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/26.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/27.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/28.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/29.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/30.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/31.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/32.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/33.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/34.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/35.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/36.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/37.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/38.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/39.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/40.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/41.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/42.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/43.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/44.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/45.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/46.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/47.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/48.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/49.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/50.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/51.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/52.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/53.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/54.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/55.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/56.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/57.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/58.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/59.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/60.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/61.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/62.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/63.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/64.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/65.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/66.jpg\" }, " +
        "    { \"src\" : \"comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/68.jpg\" } " +
        "  ] " + 
        "}";

// var comic3 = new Comic(\"Wow Comics\", 1, 1, [
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/01.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/02.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/03.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/04.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/05.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/06.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/07.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/08.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/09.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/10.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/11.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/12.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/13.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/14.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/15.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/16.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/17.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/18.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/19.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/20.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/21.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/22.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/23.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/24.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/25.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/26.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/27.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/28.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/29.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/30.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/31.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/32.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/33.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/34.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/35.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/36.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/37.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/38.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/39.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/40.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/41.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/42.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/43.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/44.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/45.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/46.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/47.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/48.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/49.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/50.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/51.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/52.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/53.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/54.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/55.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/56.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/57.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/58.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/59.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/60.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/61.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/62.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/63.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/64.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/65.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/66.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/67.jpg\" },
  // { \"src\" : \"comics/Wow Comics 01f (1940) (c2c)/68.jpg\" },
// ]);

// var comic4 = new Comic(\"Wow Comics\", 1, 2, [
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/01.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/02.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/03.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/04.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/05.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/06.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/07.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/08.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/09.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/10.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/11.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/12.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/13.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/14.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/15.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/16.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/17.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/18.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/19.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/20.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/21.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/22.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/23.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/24.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/25.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/26.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/27.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/28.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/29.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/30.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/31.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/32.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/33.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/34.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/35.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/36.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/37.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/38.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/39.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/40.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/41.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/42.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/43.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/44.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/45.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/46.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/47.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/48.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/49.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/50.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/51.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/52.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/53.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/54.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/55.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/56.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/57.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/58.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/59.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/60.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/61.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/62.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/63.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/64.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/65.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/66.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/67.jpg\" },
  // { \"src\" : \"comics/Wow Comics 02f (1941) (c2c)/68.jpg\" },
// ]);

    /**
     * Look up the comic based on the incoming hash and return all of its
     * details.
     * 
     * @param hash
     * @return
     */
    public String getComic(String hash) {
    	return comic1;
    }
}
