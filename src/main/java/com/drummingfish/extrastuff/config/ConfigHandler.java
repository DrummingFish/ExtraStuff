package com.drummingfish.extrastuff.config;

import com.drummingfish.extrastuff.ModInfo;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean testValue = false;

	public static void init(File file) {
        if (config == null) {
            config = new Configuration(file);

            loadConfiguration();
        }
	}

    private static void loadConfiguration() {
        testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");

        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
        if (event.modID.equalsIgnoreCase(ModInfo.ID)) {
            loadConfiguration();
        }
    }

    //Recipes.hardmodeRecipes = config.get("Hardmode Recipes", "hardmodeRecipesEnabled", false).getBoolean(false);
}
