package com.juanwan11_magicnation.Items;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.lexicon.LexiconPage;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
public class MABotaniaItem {
	public static Item miscNilfhemWart;
	
	public static void init() 
	{
		
		
		helmZionArmor = new ItemZionArmor(DAItems.DISSOLUTED, DemonicAlchemy.proxy.addArmor("ZionArmor"), 0).setUnlocalizedName("helmZionArmor").setCreativeTab(CreativeTabs.tabAllSearch).setTextureName("chaos:helm3");
		GameRegistry.registerItem(helmZionArmor, "helmZionArmor");
		
		
	}

}
