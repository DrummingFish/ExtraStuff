package com.drummingfish.extrastuff.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initSounds() {
		// init sounds
		
	}

	@Override
	public void initRenderers(String type) {

        RenderingRegistry.addNewArmourRendererPrefix(type);

	}
}
