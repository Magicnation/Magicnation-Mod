package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {
	
//---------------------------------------------------------------------------------------------------------------
	public static void box(World world,int posx, int posy, int posz,int x, int y, int z,Block blockx,Block blocky,Block blockz) {
			
			int j,k;
		
			if(world.getBlock(posx, posy, posz)!= blockz && world.getBlock(posx, posy + (y/2), posz + (z/2)) != (blocky)){
			//build walls 
			for(j=0;j<x;j++)
				for(k=0;k<y;k++){
					world.setBlock(posx + j,posy + k,posz, blockx);
					world.setBlock(posx + j,posy + k,posz + (z-1), blockx);
				}

			for(j=0;j<y;j++)
				for(k=0;k<z;k++){
					world.setBlock(posx,posy + j,posz + k, blocky);
					world.setBlock(posx + (x-1),posy + j,posz + k, blocky);
				}
			
			for(j=0;j<z;j++)
				for(k=0;k<x;k++){
					world.setBlock(posx + k, posy,posz + j, blockz);
					world.setBlock(posx + k,posy + (y-1),posz + j, blockz);
				}
			}
			
			
		}
//---------------------------------------------------------------------------------------------------------------

		@Override
		public boolean generate(World p_76484_1_, Random p_76484_2_,
				int p_76484_3_, int p_76484_4_, int p_76484_5_) {
			return false;
		}

	
}
