package me.Mastercuts20.ForgeTestMod;


import me.Mastercuts20.ForgeTestMod.Util.Logger;
import me.Mastercuts20.ForgeTestMod.init.ModBlocks;
import me.Mastercuts20.ForgeTestMod.init.ModItems;
import me.Mastercuts20.ForgeTestMod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;

@Mod(name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, modid = ModInfo.MOD_ID, acceptedMinecraftVersions = ModInfo.ACCEPTED_MINECRAFT_VERSIONS)
public class TestMod {

    @Mod.Instance
    public static TestMod instence;
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        Logger.logText(Level.INFO, "Test Mod is now loading!");
        ModItems.init();
        ModItems.registerItems();
        ModBlocks.init();
        ModBlocks.registerBlocks();
        proxy.preInit(e);
    }

    public void Init(FMLInitializationEvent e){
        proxy.Init(e);
    }

    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit(e);
        Logger.logText(Level.INFO, "Test Mod has finished loading! Enjoy!");
    }

    public static CreativeTabs letters = new CreativeTabs("letters") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(ModBlocks.letterm);
        }
    };
}
