DROP TABLE COMIC;
DROP TABLE PAGE;
DROP TABLE THUMBNAIL;
DROP TABLE COMIC_XREF;
DROP TABLE TAG;
DROP TABLE USER;
CREATE TABLE COMIC(id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, originalFileName VARCHAR(256), series VARCHAR(256), volume INTEGER, issue INTEGER, hash VARCHAR(30), added TIMESTAMP);
CREATE TABLE PAGE(id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, comic_id INTEGER, page_order INTEGER, filename VARCHAR(256));
CREATE TABLE THUMBNAIL(page_id INTEGER, filename VARCHAR(256));
CREATE TABLE COMIC_XREF(tag_id INTEGER, comic_id INTEGER);
CREATE TABLE TAG(id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, name VARCHAR(256));
CREATE TABLE USER(id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, name VARCHAR(256));
INSERT INTO "PUBLIC"."COMIC" 
(ORIGINALFILENAME, SERIES, VOLUME, ISSUE, HASH, ADDED) VALUES
('Baffling Mysteries 006 (1952).cbz', 'Baffling Mysteries', 1, 6, 's', {ts '2011-08-13 22:56:00.000000000'});
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 0, 'Baffling Mysteries 006 (1952)/scan0000.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 1, 'Baffling Mysteries 006 (1952)/scan0001.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 2, 'Baffling Mysteries 006 (1952)/scan0002.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 3, 'Baffling Mysteries 006 (1952)/scan0003.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 4, 'Baffling Mysteries 006 (1952)/scan0004.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 5, 'Baffling Mysteries 006 (1952)/scan0005.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 6, 'Baffling Mysteries 006 (1952)/scan0006.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 7, 'Baffling Mysteries 006 (1952)/scan0007.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 8, 'Baffling Mysteries 006 (1952)/scan0008.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 9, 'Baffling Mysteries 006 (1952)/scan0009.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 10, 'Baffling Mysteries 006 (1952)/scan0010.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 11, 'Baffling Mysteries 006 (1952)/scan0011.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 12, 'Baffling Mysteries 006 (1952)/scan0012.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 13, 'Baffling Mysteries 006 (1952)/scan0013.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 14, 'Baffling Mysteries 006 (1952)/scan0014.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 15, 'Baffling Mysteries 006 (1952)/scan0015.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 16, 'Baffling Mysteries 006 (1952)/scan0016.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 17, 'Baffling Mysteries 006 (1952)/scan0017.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 18, 'Baffling Mysteries 006 (1952)/scan0018.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 19, 'Baffling Mysteries 006 (1952)/scan0019.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 20, 'Baffling Mysteries 006 (1952)/scan0020.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 21, 'Baffling Mysteries 006 (1952)/scan0021.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 22, 'Baffling Mysteries 006 (1952)/scan0022.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 23, 'Baffling Mysteries 006 (1952)/scan0023.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 24, 'Baffling Mysteries 006 (1952)/scan0024.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 25, 'Baffling Mysteries 006 (1952)/scan0025.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 26, 'Baffling Mysteries 006 (1952)/scan0026.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 27, 'Baffling Mysteries 006 (1952)/scan0027.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 28, 'Baffling Mysteries 006 (1952)/scan0028.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 29, 'Baffling Mysteries 006 (1952)/scan0029.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 30, 'Baffling Mysteries 006 (1952)/scan0030.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 31, 'Baffling Mysteries 006 (1952)/scan0031.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(3, 32, 'Baffling Mysteries 006 (1952)/scan0032.jpg');
INSERT INTO "PUBLIC"."COMIC" 
(ORIGINALFILENAME, SERIES, VOLUME, ISSUE, HASH, ADDED) VALUES
('Captain_Aero_Comics_001_66p_no_ifc_ibc', 'Captain Aero Comics', 1, 1, 's', {ts '2011-08-13 22:56:00.000000000'});
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 0, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/00.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 1, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/01.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 2, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/02.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 3, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/03.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 4, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/04.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 5, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/05.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 6, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/06.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 7, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/07.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 8, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/08.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 9, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/09.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 10, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/10.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 11, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/11.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 12, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/12.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 13, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/13.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 14, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/14.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 15, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/15.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 16, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/16.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 17, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/17.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 18, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/18.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 19, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/19.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 20, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/20.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 21, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/21.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 22, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/22.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 23, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/23.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 24, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/24.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 25, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/25.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 26, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/26.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 27, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/27.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 28, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/28.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 29, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/29.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 30, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/30.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 31, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/31.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 32, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/32.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 33, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/33.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 34, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/34.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 35, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/35.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 36, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/36.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 37, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/37.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 38, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/38.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 39, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/39.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 40, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/40.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 41, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/41.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 42, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/42.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 43, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/43.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 44, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/44.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 45, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/45.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 46, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/46.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 47, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/47.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 48, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/48.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 49, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/49.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 50, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/50.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 51, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/51.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 52, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/52.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 53, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/53.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 54, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/54.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 55, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/55.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 56, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/56.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 57, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/57.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 58, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/58.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 59, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/59.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 60, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/60.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 61, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/61.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 62, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/62.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 63, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/63.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 64, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/64.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 65, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/65.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 66, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/66.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 67, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/67.jpg');
INSERT INTO "PUBLIC"."PAGE" 
(COMIC_ID, PAGE_ORDER, FILENAME) VALUES 
(4, 68, 'Captain_Aero_Comics_001_66p_no_ifc_ibc/68.jpg');
