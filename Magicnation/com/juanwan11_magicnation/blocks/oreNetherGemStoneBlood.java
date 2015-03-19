package com.juanwan11_magicnation.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.juanwan11_magicnation.Items.MAItems;

public class oreNetherGemStoneBlood extends Block {

	public oreNetherGemStoneBlood() {
		super(Material.rock);

	}
	public int getExpDrop(IBlockAccess world, int metadata, int fortune) 
	{
		return (int) 5;
	}

	   public Item getItemDropped(int damage, Random random, int fortune)
	    {
	        return MAItems.itemShardGemBlood;
	    }

	    public int quantityDropped(Random random)
	    {
	        return 2;
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
	  
	    @Override
	    public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int meta)
	    {
	    	Random rand = new Random();
	    	
	    	if(rand.nextInt(100) <= 10){
	    		world.createExplosion((Entity)null, (double)x, (double)y, (double)z, 5f, true);
	    		world.spawnEntityInWorld(new EntityLightningBolt(world,x,y,z));
	    	
	    	}
	    }

}