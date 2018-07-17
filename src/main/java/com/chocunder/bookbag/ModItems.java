package com.chocunder.bookbag;

import com.chocunder.bookbag.items.BookbagItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    @GameRegistry.ObjectHolder("bookbag:bookbagitem")
    public static BookbagItem bookbagItem;

}
