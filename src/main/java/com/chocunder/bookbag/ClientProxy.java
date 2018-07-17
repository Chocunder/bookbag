package com.chocunder.bookbag;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy
{
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event)
    {
        ModItems.bookbagItem.initModel();
    }
}
