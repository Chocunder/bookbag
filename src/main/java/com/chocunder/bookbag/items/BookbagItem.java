package com.chocunder.bookbag.items;

import com.chocunder.bookbag.Bookbag;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BookbagItem extends Item
{
    public BookbagItem()
    {
        setRegistryName("bookbagitem");
        setUnlocalizedName(Bookbag.MODID + ".bookbagitem");
        setCreativeTab(CreativeTabs.TOOLS);
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
