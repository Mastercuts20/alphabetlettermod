package me.Mastercuts20.ForgeTestMod.init;

import me.Mastercuts20.ForgeTestMod.ModInfo;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item cheese;
    public static void init(){
        cheese =  new ItemFood(2, 2, false).setUnlocalizedName("itemcheese").setCreativeTab(CreativeTabs.FOOD);
    }
    public static void registerItem(Item item){

        GameRegistry.register(item, new ResourceLocation(ModInfo.MOD_ID, item.getUnlocalizedName().substring(5)));
    }

    public static void registerItems(){
        registerItem(cheese);
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));

    }

    public static void registerRenders(){
        registerRender(cheese);
    }
}
