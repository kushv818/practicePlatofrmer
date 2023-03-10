package practicePlatformer;

import de.gurkenlabs.litiengine.*;
import de.gurkenlabs.litiengine.resources.Resources;

public class Program {

	public static void main(String[] args) {
		// set meta information about the game 
	    Game.info().setName("GURK NUKEM"); 
	    Game.info().setSubTitle("");
	    Game.info().setVersion("v0.0.1"); 
	    Game.info().setWebsite("https://github.com/gurkenlabs/litiengine-gurk-nukem"); 
	    Game.info().setDescription("An example 2D platformer with shooter elements made in the LITIENGINE"); 

	    // init the game infrastructure 
	    Game.init(args); 

	    // set the icon for the game (this has to be done after initialization because the ScreenManager will not be present otherwise) 
	    Game.window().setIcon(Resources.images().get("icon.png")); 
	    Game.graphics().setBaseRenderScale(4f); 

	    // load data from the utiLITI game file 
	    Resources.load("practicePlatformer.litidata"); 

	    // load the first level (resources for the map were implicitly loaded from the game file) 
	    Game.world().loadEnvironment("level1"); 
	    Game.start(); 

	}

}
