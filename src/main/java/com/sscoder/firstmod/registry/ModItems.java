package com.sscoder.firstmod.registry;

import com.sscoder.firstmod.Firstmod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Firstmod.MOD_ID, "ruby"), RUBY);
    }
}
