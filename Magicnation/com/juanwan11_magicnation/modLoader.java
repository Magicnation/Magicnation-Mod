package com.juanwan11_magicnation;

import com.juanwan11_magicnation.Items.botania.MABotaniaItems;
import com.juanwan11_magicnation.blocks.thaumcraft.MAThaumBlocks;
import com.juanwan11_magicnation.recipies.*;
import com.juanwan11_magicnation.recipies.thaumcraft.ThaumcraftCraftingRecipes;

import cpw.mods.fml.common.Loader;

public class modLoader {

	private static boolean isThaumcraftLoaded = Loader.isModLoaded("Thaumcraft");
    private static boolean isBotaniaLoaded = Loader.isModLoaded("Botania");
	
    public static void isModsLoaded(){
    	thaumcraftisLoaded();
    	botaniaIsLoaded();
    	botaniaAndThaumcraft();
    }
    
	private static void thaumcraftisLoaded(){
		if (isThaumcraftLoaded) {
			ThaumcraftCraftingRecipes.CraftingRecipes();
			MAThaumBlocks.makeBlocks();
		    MAThaumBlocks.registerBlocks();
		}
	}
	
	private static void botaniaIsLoaded(){
		if (isBotaniaLoaded) {
			ThaumcraftCraftingRecipes.CraftingRecipes();
			MABotaniaItems.makeItems();
		    MABotaniaItems.registerItems();
		}
	}
	
	private static void botaniaAndThaumcraft(){
		if (isThaumcraftLoaded && isBotaniaLoaded) {
		}
	}
}


