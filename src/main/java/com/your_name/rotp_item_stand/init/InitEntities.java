package com.your_name.rotp_item_stand.init;

import com.your_name.rotp_item_stand.ItemStandAddon;

import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, ItemStandAddon.MOD_ID);


}
