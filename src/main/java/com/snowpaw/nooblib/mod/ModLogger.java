package com.snowpaw.nooblib.mod;

import com.snowpaw.nooblib.LibReferences;

import org.apache.logging.log4j.Level;
import cpw.mods.fml.common.FMLLog;
import net.minecraft.launchwrapper.Launch;

public class ModLogger {
	
	public ModLogger(String modName){
		this.modName = modName;
		preInit();
	}
	
	public static boolean debug = false;
	public static String modName;
	
	public static void log(Level level, Object object){
		FMLLog.log(modName, level, String.valueOf(object), new Object[0]);
	}
	
	public static void error(Object object){
		log(Level.ERROR, object);
	}
	
	public static void info(Object object){
		log(Level.INFO, object);
	}
	
	public static void warn(Object object){
		log(Level.WARN, object);
	}

	public static void debug(Object object){
		log(Level.INFO, "[Debug] " + object);
	}
	
	public static void preInit(){
		debug = (Boolean)Launch.blackboard.get("fml.deobfuscatedEnvironment");
	}

}
