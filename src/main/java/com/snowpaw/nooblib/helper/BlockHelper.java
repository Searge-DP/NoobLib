package com.snowpaw.nooblib.helper;

import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockHelper {
	
	public static int getPlacementData(World world, int x, int y, int z, int side, boolean changeState){
		int orientation = -1;
		
		if (side == 0 && world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN))
            orientation = side;
        else if (side == 1 && world.isSideSolid(x, y - 1, z, ForgeDirection.UP))
            orientation = side;
        else if (side == 2 && world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH))
            orientation = side;
        else if (side == 3 && world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH))
            orientation = side;
        else if (side == 4 && world.isSideSolid(x + 1, y, z, ForgeDirection.WEST))
            orientation = side;
        else if (side == 5 && world.isSideSolid(x - 1, y, z, ForgeDirection.EAST))
            orientation = side;
        else {
            if (world.isSideSolid(x, y - 1, z, ForgeDirection.UP))
                orientation = 1;
            else if (world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH))
                orientation = 2;
            else if (world.isSideSolid(x - 1, y, z, ForgeDirection.EAST))
                orientation = 5;
            else if (world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH))
                orientation = 3;
            else if (world.isSideSolid(x + 1, y, z, ForgeDirection.WEST))
                orientation = 4;
            else if (world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN))
                orientation = 0;
        }
		
		if(changeState = true){
			if(world.isBlockIndirectlyGettingPowered(x, y, z)){
				orientation = orientation + 6;
			}
		}
		
		return orientation;
	}
	
	public static boolean isPlacementPossible(World world, int x, int y, int z){
        return (world.isSideSolid(x, y - 1, z, ForgeDirection.UP)) ||
                (world.isSideSolid(x, y + 1, z, ForgeDirection.DOWN)) ||
                (world.isSideSolid(x, y, z + 1, ForgeDirection.NORTH)) ||
                (world.isSideSolid(x, y, z - 1, ForgeDirection.SOUTH)) ||
                (world.isSideSolid(x + 1, y, z, ForgeDirection.WEST)) ||
                (world.isSideSolid(x - 1, y, z, ForgeDirection.EAST));
	}

}
