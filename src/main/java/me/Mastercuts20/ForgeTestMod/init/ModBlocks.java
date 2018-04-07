package me.Mastercuts20.ForgeTestMod.init;

import me.Mastercuts20.ForgeTestMod.ModInfo;
import me.Mastercuts20.ForgeTestMod.TestMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block trademark;
    public static Block letterm;
    public static Block lettera;
    public static Block letterk;

    public static void init(){
        trademark = new Block(Material.CLAY).setUnlocalizedName("trademark").setCreativeTab(TestMod.letters);
        letterm = new Block(Material.CLAY).setUnlocalizedName("letterm").setCreativeTab(TestMod.letters);
        lettera = new Block(Material.CLAY).setUnlocalizedName("lettera").setCreativeTab(TestMod.letters);
        letterk = new Block(Material.CLAY).setUnlocalizedName("letterk").setCreativeTab(TestMod.letters);
    }

    public static void registerBlocks(){
        registerBlock(trademark);
        registerBlock(letterm);
        registerBlock(lettera);
        registerBlock(letterk);
    }

    public static void registerBlock(Block b){
        GameRegistry.register(b, new ResourceLocation(ModInfo.MOD_ID, b.getUnlocalizedName().substring(5)));
        GameRegistry.register(new ItemBlock(b), new ResourceLocation(ModInfo.MOD_ID, b.getUnlocalizedName().substring(5)));
    }

    public static void registerRenders(){
        registerRender(trademark);
        registerRender(letterm);
        registerRender(lettera);
        registerRender(letterk);
    }

    public static void registerRender(Block b){
        Item item = Item.getItemFromBlock(b);
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(ModInfo.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
