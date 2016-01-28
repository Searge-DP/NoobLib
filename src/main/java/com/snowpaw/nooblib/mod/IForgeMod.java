package com.snowpaw.nooblib.mod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public interface IForgeMod {
	
	
	@EventHandler public void preInit(FMLPreInitializationEvent event);
	
	@EventHandler public void init(FMLInitializationEvent event);
	
	@EventHandler public void postInit(FMLPostInitializationEvent event);

}
