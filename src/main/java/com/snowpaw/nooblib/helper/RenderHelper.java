package com.snowpaw.nooblib.helper;

import org.lwjgl.opengl.GL11;

public class RenderHelper {
	
	public static void insertPlacementLogic(double x, double y, double z, int meta){
		if(meta == 0){
			GL11.glTranslated(x + 0.5D, y - 0.5D, z + 0.5D);
			GL11.glRotated(360, 0D, 0D, 1D);
		}
		else if(meta == 1){
			GL11.glTranslated(x + 0.5D, y + 1.5D, z + 0.5D);
			GL11.glRotated(180, 0D, 0D, 1D);
		}
		else if(meta == 2){
			GL11.glTranslated(x + 0.5D, y + 0.5D, z - 0.5D);
			GL11.glRotated(-270, 1D, 0D, 0D);
		}
		else if(meta == 3){
			GL11.glTranslated(x + 0.5D, y + 0.5D, z + 1.5D);
			GL11.glRotated(270, 1D, 0D, 0D);
		}
		else if(meta == 4){
			GL11.glTranslated(x + -0.5D, y + 0.5D, z + 0.5D);
			GL11.glRotated(270, 0D, 0D, 1D);
		}
		else if(meta == 5){
			GL11.glTranslated(x + 1.5D, y + 0.5D, z + 0.5D);
			GL11.glRotated(-270, 0D, 0D, 1D);
		}
	}

}
