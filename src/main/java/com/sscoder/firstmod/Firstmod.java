package com.sscoder.firstmod;

import com.sscoder.firstmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Firstmod implements ModInitializer {
    public static final String MOD_ID = "firstmod";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
