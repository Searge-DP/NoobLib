package com.snowpaw.nooblib.device;

import net.minecraft.block.Block;

public class EnergyDevice {
	
	public int x;
	public int y;
	public int z;
	public Block block;
	
	public EnergyDevice(int x, int y, int z, Block block){
		this.x = x;
		this.y = y;
		this.z = z;
		this.block = block;
	}

}
