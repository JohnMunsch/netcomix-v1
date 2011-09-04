package com.johnmunsch.netcomix;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletContext;

import org.directwebremoting.ServerContextFactory;

public class Server {
    private String bafflingMysteriesPages[] = {
	    "comics/Baffling Mysteries 006 (1952)/scan0000.jpg",
	    "comics/Baffling Mysteries 006 (1952)/scan0001.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0002.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0003.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0004.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0005.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0006.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0007.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0008.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0009.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0010.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0011.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0012.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0013.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0014.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0015.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0016.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0017.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0018.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0019.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0020.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0021.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0022.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0023.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0024.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0025.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0026.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0027.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0028.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0029.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0030.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0031.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0032.jpg"
	};

    private String bafflingMysteriesThumbnails[] = {
	    "comics/Baffling Mysteries 006 (1952)/scan0000_thumbnail.jpg",
	    "comics/Baffling Mysteries 006 (1952)/scan0001_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0002_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0003_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0004_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0005_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0006_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0007_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0008_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0009_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0010_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0011_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0012_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0013_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0014_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0015_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0016_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0017_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0018_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0019_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0020_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0021_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0022_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0023_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0024_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0025_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0026_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0027_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0028_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0029_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0030_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0031_thumbnail.jpg", 
	    "comics/Baffling Mysteries 006 (1952)/scan0032_thumbnail.jpg"
	};

    private String captainAeroComicsPages[] = {
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/01.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/03.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/04.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/05.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/06.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/07.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/08.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/09.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/10.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/11.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/12.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/13.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/14.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/15.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/16.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/17.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/18.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/19.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/20.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/21.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/22.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/23.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/24.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/25.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/26.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/27.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/28.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/29.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/30.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/31.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/32.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/33.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/34.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/35.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/36.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/37.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/38.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/39.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/40.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/41.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/42.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/43.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/44.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/45.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/46.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/47.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/48.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/49.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/50.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/51.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/52.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/53.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/54.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/55.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/56.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/57.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/58.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/59.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/60.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/61.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/62.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/63.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/64.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/65.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/66.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/68.jpg"
    };

    private String captainAeroComicsThumbnails[] = {
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/01_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/03_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/04_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/05_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/06_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/07_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/08_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/09_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/10_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/11_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/12_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/13_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/14_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/15_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/16_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/17_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/18_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/19_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/20_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/21_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/22_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/23_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/24_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/25_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/26_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/27_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/28_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/29_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/30_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/31_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/32_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/33_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/34_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/35_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/36_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/37_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/38_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/39_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/40_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/41_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/42_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/43_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/44_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/45_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/46_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/47_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/48_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/49_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/50_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/51_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/52_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/53_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/54_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/55_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/56_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/57_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/58_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/59_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/60_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/61_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/62_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/63_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/64_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/65_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/66_thumbnail.jpg", 
        "comics/Captain_Aero_Comics_001_66p_no_ifc_ibc/68_thumbnail.jpg"
    };

    private Comic bafflingMysteries = 
    		new Comic("Baffling Mysteries", 1, 6, "comic1",
    				Arrays.asList(bafflingMysteriesPages),
    				Arrays.asList(bafflingMysteriesThumbnails));
    private Comic captainAeroComics = 
    		new Comic("Captain Aero Comics", 1, 1, "comic2",
    				Arrays.asList(captainAeroComicsPages),
    				Arrays.asList(captainAeroComicsThumbnails));
    List<Comic> comics = new ArrayList<Comic>();
    Logger log = Logger.getLogger(Server.class.getName());

    public Server() {
    	comics.add(bafflingMysteries);
        comics.add(captainAeroComics);
    }
    
    /**
     * Get a list of comics to display in a browsing context for the user.
     * 
     * @return
     */
    public List<Comic> getNewsstand() {
    	return comics;
    }
    
    /**
     * Look up the comic based on the incoming hash and return all of its
     * details.
     * 
     * @param hash
     * @return
     */
    public Comic getComic(String hash) {
    	for (Comic comic : comics) {
			if (comic.getHash().equals(hash)) {
				return comic;
			}
		}
    	
    	return null;
    }
    
    public List<Comic> processIncomingDirectory() {
    	List<Comic> comicsAdded = new ArrayList<Comic>();

    	ServletContext servletContext = 
    			ServerContextFactory.get().getServletConfig().getServletContext();
    	
    	File incomingDirectory = 
    			IncomingComicsProcessor.findOrCreateDirectory("/incoming/");
    	
		try {
			IncomingComicsProcessor processor = new IncomingComicsProcessor( 
					new IncomingComicsObserver());
			
			processor.process(incomingDirectory);
		} catch (Exception e) {
			e.printStackTrace();
		}

    	return comicsAdded;
    }
}
