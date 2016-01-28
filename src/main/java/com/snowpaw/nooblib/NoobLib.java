package com.snowpaw.nooblib;

import com.snowpaw.nooblib.mod.IForgeMod;
import com.snowpaw.nooblib.mod.ModLogger;
import com.snowpaw.nooblib.proxy.CommonProxy;
import com.snowpaw.nooblib.render.RenderTickHandler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * NoobLib (C) KitsuneAlex 2016 - All rights reserved !
 * @author KitsuneAlex
 *
 */
@Mod
(modid = LibReferences.MODID, version = LibReferences.VERSION, name = LibReferences.NAME)
public class NoobLib implements IForgeMod {
	
	@Instance
	(value = LibReferences.MODID)
	public static NoobLib instance;
	
	@SidedProxy
	(clientSide = LibReferences.CSIDE, serverSide = LibReferences.SSIDE)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
		setupLogger();
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
		FMLCommonHandler.instance().bus().register(new RenderTickHandler());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit();
	}
	
	public void setupLogger(){
		new ModLogger(LibReferences.NAME);
		
		if(ModLogger.debug = true){
			ModLogger.info("Development environment detected !");
		}
	}

}
