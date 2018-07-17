package com.chocunder.bookbag;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Bookbag.MODID, version = Bookbag.VERSION, name = Bookbag.NAME)
public class Bookbag
{
    public static final String NAME = "Bookbag";
    public static final String MODID = "bookbag";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static Bookbag instance;

    @SidedProxy(clientSide = "com.chocunder.bookbag.ClientProxy", serverSide = "com.chocunder.bookbag.ServerProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
