package com.drummingfish.extrastuff;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.config.ConfigHandler;
import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.proxy.CommonProxy;
import com.drummingfish.extrastuff.recipes.Recipes;
import com.drummingfish.extrastuff.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class ExtraStuff {

	@Mod.Instance(ModInfo.ID)
	public static ExtraStuff instance;
	
	@SidedProxy(clientSide = "com.drummingfish.extrastuff.proxy.ClientProxy", serverSide = "com.drummingfish.extrastuff.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	// public static ExtraStuffTab extraStuffTab = new ExtraStuffTab();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre-Initialization Complete!");

		ItemsES.init();
		BlocksES.init();

		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ItemsES.oreRegistration();
		
		Recipes.registerRecipes();

		// LanguageRegistry.instance().addStringLocalization("itemGroup.Extra Stuff", "Extra Stuff");

        LogHelper.info("Initialization Complete!");
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-Initialization Complete!");
    }
}
