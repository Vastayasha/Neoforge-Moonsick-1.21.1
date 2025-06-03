package com.TzrcWolf.Moonsick.item;

import com.TzrcWolf.Moonsick.Moonsick;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Moonsick.MODID);

public static final DeferredItem<Item> VorpalChip = ITEMS.register("vorpalchip",
        //Naming conventions for the register key are underscored no spaces
        ()-> new Item(new Item.Properties()));
//Note: this doesn't create the item in any other form obtainaible, meaning its unnamed, unobtainable, and untextured.
    //Note: You can add notes via 2 front slashes

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
