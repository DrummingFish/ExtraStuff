package com.drummingfish.extrastuff;

import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import extrastuff.blocks.Blocks;
import extrastuff.config.ConfigHandler;
import extrastuff.items.ItemInfo;
import extrastuff.items.Items;
import extrastuff.network.PacketHandler;
import extrastuff.proxies.CommonProxy;
import extrastuff.recipes.Recipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true, packetHandler = PacketHandler.class)
public class ExtraStuff {

	@Instance(ModInfo.ID)
	public static ExtraStuff instance;
	
	@SidedProxy(clientSide = "extrastuff.proxies.ClientProxy", serverSide = "extrastuff.proxies.CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs extraStuffTab = new ExtraStuffTab(CreativeTabs.getNextID(), ModInfo.NAME);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete!");

		Items.init();
		Blocks.init();

		proxy.initSounds();
		proxy.initRenderers();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		Items.addNames();
		Items.oreRegistration();
		
		Blocks.addNames();
		
		Recipes.registerRecipes();

		LanguageRegistry.instance().addStringLocalization("itemGroup.Extra Stuff", "Extra Stuff");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	
}
