package com.your_name.rotp_item_stand.client.render.entity.renderer.stand;

import com.your_name.rotp_item_stand.client.render.entity.model.stand.ItemStandModel;
import com.your_name.rotp_item_stand.ItemStandAddon;
import com.your_name.rotp_item_stand.entity.stand.stands.ItemStandEntity;
import com.github.standobyte.jojo.client.render.entity.renderer.stand.StandEntityRenderer;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class ItemStandRenderer extends StandEntityRenderer<ItemStandEntity, ItemStandModel> {

    public ItemStandRenderer(EntityRendererManager renderManager) {
        super(renderManager, new ItemStandModel(), new ResourceLocation(ItemStandAddon.MOD_ID, "textures/entity/stand/item_stand.png"), 0);
    }

}
