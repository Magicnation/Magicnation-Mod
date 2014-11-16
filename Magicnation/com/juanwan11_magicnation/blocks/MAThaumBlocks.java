package com.juanwan11_magicnation.blocks;

pimport net.minecraft.block.Block;
import net.minecraft.block.Block;
import net.minecraft.init.Items;

import com.juanwan11_magicnation.*;

import cpw.mods.fml.common.registry.GameRegistry;

public class MAThaumBlocks {
	
	public static Block miscGemStoneBloodBlock;
	public static Block miscGemStoneBloodBricks;
	
	public static void makeBlocks() {
		miscGemStoneBloodBlock = new miscGemStoneBloodBlock().setCreativeTab(BaseClass.magicnationTab).setBlockName(ModInformation.modid + "_" + "miscGemStoneBloodBlock").setBlockTextureName(ModInformation.modid + ":" + "miscGemStoneBloodBlock").setHardness(5.5f).setResistance(15f);
		miscGemStoneBloodBricks = new miscGemStoneBloodBricks().setCreativeTab(BaseClass.magicnationTab).setBlockName(ModInformation.modid + "_" + "miscGemStoneBloodBricks").setBlockTextureName(ModInformation.modid + ":" + "miscGemStoneBloodBricks").setHardness(4.5f).setResistance(12f);
	};

	public static void registerBlocks() {
		GameRegistry.registerBlock(miscGemStoneBloodBlock, "miscGemStoneBloodBlock");
		GameRegistry.registerBlock(miscGemStoneBloodBricks, "miscGemStoneBloodBricks");

	};
	
	
