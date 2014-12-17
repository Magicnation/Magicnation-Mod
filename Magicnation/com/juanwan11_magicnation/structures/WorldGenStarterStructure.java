package com.juanwan11_magicnation.structures;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenStarterStructure extends WorldGenerator {

	public boolean generate(World world, Random random, int blockx, int blocky, int blockz) {

		while (world.isAirBlock(blockx, blocky, blockz) && blocky > 2) {
			--blocky;
		}

		world.setSpawnLocation(blockx, blocky, blockz);

		//Array containing sets of x,y,z coordinates
		int[] coords = {
			0,0,0,1,0,0,2,0,0,3,0,0,4,0,0,5,0,0,6,0,0,7,0,0,8,0,0,
			0,0,1,1,0,1,2,0,1,3,0,1,4,0,1,5,0,1,6,0,1,7,0,1,8,0,1,
			0,0,2,1,0,2,2,0,2,3,0,2,4,0,2,5,0,2,6,0,2,7,0,2,8,0,2,
			0,0,3,1,0,3,2,0,3,3,0,3,4,0,3,5,0,3,6,0,3,7,0,3,8,0,3,
			0,0,4,1,0,4,2,0,4,3,0,4,4,0,4,5,0,4,6,0,4,7,0,4,8,0,4,
			0,0,5,1,0,5,2,0,5,3,0,5,4,0,5,5,0,5,6,0,5,7,0,5,8,0,5,
			0,0,6,1,0,6,2,0,6,3,0,6,4,0,6,5,0,6,6,0,6,7,0,6,8,0,6,
			0,0,7,1,0,7,2,0,7,3,0,7,4,0,7,5,0,7,6,0,7,7,0,7,8,0,7,
			0,0,8,1,0,8,2,0,8,3,0,8,4,0,8,5,0,8,6,0,8,7,0,8,8,0,8,
			};
		for (int i = 0; i < coords.length; i=+3) {
			world.setBlock(blockx + coords[i], blocky + coords[i+1], blockz + coords[i+2], Blocks.stonebrick);
		}
		
		return true;
	}
}
