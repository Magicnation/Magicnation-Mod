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

		//Array list containing x,y,z multiples
		int[] coords = {0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < coords.length/3; i=+3) {
			world.setBlock(blockx + coords[i], blocky + coords[i+1], blockz + coords[i+2], Blocks.stonebrick);
		}
		
		return true;
	}
}
