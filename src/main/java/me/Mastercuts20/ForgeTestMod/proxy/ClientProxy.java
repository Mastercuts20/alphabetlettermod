package me.Mastercuts20.ForgeTestMod.proxy;

import me.Mastercuts20.ForgeTestMod.init.ModBlocks;
import me.Mastercuts20.ForgeTestMod.init.ModItems;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }
}
