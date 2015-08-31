package com.lothrazar.enderbook;

import net.minecraftforge.common.config.Configuration;

public class ConfigSettings 
{
	boolean doesPauseGame;
	boolean craftNetherStar;
	boolean showCoordTooltips;
	int maximumSaved;
	Configuration config;
	public ConfigSettings(Configuration c)
	{
		config = c;
		config.load();
		String category = Configuration.CATEGORY_GENERAL;
		
		doesPauseGame = config.getBoolean("pause_game_sp", category, false, "The Ender Book GUI will pause the game (single player)");
		
		craftNetherStar = config.getBoolean("needs_nether_star", category, true, "The Ender Book requires a nether star to craft.");
		
		showCoordTooltips = config.getBoolean("show_coordinates_tooltip", category, true, "Waypoint buttons will show the exact coordinates in a hover tooltip.");

		maximumSaved = config.getInt("max_saved", category, 10, 5, 20, "How many waypoints the book can store");
		
		if(config.hasChanged()){config.save();}
	}
	
}
