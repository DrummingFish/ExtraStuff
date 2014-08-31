package com.drummingfish.extrastuff.proxy;

import com.drummingfish.extrastuff.ExtraStuff;
import com.drummingfish.extrastuff.entity.EntityPermaIceBall;
import com.drummingfish.extrastuff.item.ItemInfo;
import com.drummingfish.extrastuff.item.ItemsES;
import com.drummingfish.extrastuff.renderer.RenderPermaIceBall;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.client.renderer.entity.RenderSnowball;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initSounds() {
		// init sounds
		
	}

	@Override
	public void initArmourRenderer(String type) {

        RenderingRegistry.addNewArmourRendererPrefix(type);

	}

    @Override
    public void initRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(EntityPermaIceBall.class, new RenderPermaIceBall(ItemsES.permaIceBall));
    }

    @Override
    public void initEntities() {
        EntityRegistry.registerGlobalEntityID(EntityPermaIceBall.class, "permaIceBall", EntityRegistry.findGlobalUniqueEntityId());
    }
}
