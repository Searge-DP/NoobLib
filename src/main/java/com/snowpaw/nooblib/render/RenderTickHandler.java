package com.snowpaw.nooblib.render;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;

public class RenderTickHandler {
	
	public static int renderTime = 0;
	public static float renderFrame = 0F;
	public static int r = 255;
	public static int g = 0;
	public static int b = 0;
	
	@SubscribeEvent
	public void clientTickEvent(TickEvent.ClientTickEvent event){
		if(event.phase == Phase.END){
			renderTime += 1;
		}
	}
	
	@SubscribeEvent
	public void renderTickEvent(TickEvent.RenderTickEvent event){
		if(event.phase == Phase.END){
			renderFrame = event.renderTickTime;
		}
		
		if(r > 0 && b == 0){
			r -= 1;
			g += 1;
		}
		else if(g > 0){
			g -= 1;
			b += 1;
		}
		else if(b > 0){
			b -= 1;
			r += 1;
		}
	}
	
	public static float getRenderFrame(){
		return renderFrame;
	}
	
	public static int getRenderTime(){
		return renderTime + (int)renderFrame;
	}
	
	public static int getRedI(){
		return r;
	}
	
	public static int getGreenI(){
		return g;
	}
	
	public static int getBlueI(){
		return b;
	}
	
	public static float getRedF(){
		return r / 255;
	}
	
	public static float getGreenF(){
		return g / 255;
	}
	
	public static float getBlueF(){
		return b / 255;
	}

}
