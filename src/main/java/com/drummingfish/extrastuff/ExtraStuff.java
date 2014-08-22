package com.drummingfish.extrastuff;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.config.ConfigHandler;
import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.proxy.CommonProxy;
import com.drummingfish.extrastuff.recipes.Recipes;
import com.drummingfish.extrastuff.tab.ExtraStuffTab;
import com.drummingfish.extrastuff.utilities.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)

public class ExtraStuff {

	@Mod.Instance(ModInfo.ID)
	public static ExtraStuff instance;
	
	@SidedProxy(clientSide = "extrastuff.proxy.ClientProxy", serverSide = "extrastuff.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs extraStuffTab = new ExtraStuffTab(CreativeTabs.getNextID(), ModInfo.NAME);
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
        LogHelper.info("Pre Initialization Complete!");

		ItemsES.init();
		BlocksES.init();

		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ItemsES.addNames();
		ItemsES.oreRegistration();
		
		BlocksES.addNames();
		
		Recipes.registerRecipes();

		LanguageRegistry.instance().instance().addStringLocalization("itemGroup.Extra Stuff", "Extra Stuff");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
}
