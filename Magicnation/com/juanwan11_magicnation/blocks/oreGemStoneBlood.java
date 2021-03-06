package com.juanwan11_magicnation.blocks;

import java.util.Random;

import com.juanwan11_magicnation.BaseClass;
import com.juanwan11_magicnation.ModInformation;
import com.juanwan11_magicnation.Items.MAItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class oreGemStoneBlood extends Block {

	public oreGemStoneBlood() {
		super(Material.rock);

	}
	
	    @Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
	    iconRegister.registerIcon("magicnation:oreGemStoneBlood_ore");
	}
	
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) {
		return (int) 5;
	}

	   public Item getItemDropped(int damage, Random random, int fortune)
	    {
	        return MAItems.itemShardGemBlood;
	    }

	    public int quantityDropped(Random random)
	    {
	        return 1;
	    }
	    
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return blockIcon;
		
	}

	    public int quantityDroppedWithBonus(int fortune, Random random)
	    {
	        if (fortune > 0)
	        {
	            int j = random.nextInt(fortune + 2) - 1;

	            if (j < 0)
	            {
	                j = 0;
	            }

	            return quantityDropped(random) * (j + 1);
	        }
	        else
	        {
	            return quantityDropped(random);
	        }
	    }
}
