package com.drummingfish.extrastuff;

import com.drummingfish.extrastuff.block.BlocksES;
import com.drummingfish.extrastuff.config.ConfigHandler;
import com.drummingfish.extrastuff.entity.EntityPermaIceBall;
import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.proxy.CommonProxy;
import com.drummingfish.extrastuff.recipes.Recipes;
import com.drummingfish.extrastuff.utilities.LogHelper;
import com.drummingfish.extrastuff.world.WorldGenOre;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.MinecraftForge;

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

		ItemsES.init();
		BlocksES.init();

        int modEntityID = 0;

        EntityRegistry.registerModEntity(EntityPermaIceBall.class, "permaIceBall", ++modEntityID, this, 64, 10, true);

        proxy.initSounds();
        proxy.initRenderers();
        proxy.initEntities();
		proxy.initArmourRenderer("PERMAICE");
        proxy.initArmourRenderer("MUMMY");
        proxy.initArmourRenderer("FLOWER");

        LogHelper.info("Pre-Initialization Complete!");
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		ItemsES.oreRegistration();
		
		Recipes.registerRecipes();

        GameRegistry.registerWorldGenerator(new WorldGenOre(), 5);

        LogHelper.info("Initialization Complete!");
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        LogHelper.info("Post-Initialization Complete!");
    }
}
