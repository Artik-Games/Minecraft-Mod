package minecraft.mod.init;

import minecraft.mod.ModMain;
import minecraft.mod.Reference;
import minecraft.mod.blocks.ModBlock;
import minecraft.mod.ore.ModOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModBlocks {

	//Put block variables here
	public static Block test_block;
	public static Block test_ore;
	
	/**
	 * Put value for new blocks here
	 */
	public static void init(){
		/*
		 * TODO: Create block file
		 */
		test_block = new ModBlock(Material.wood).setUnlocalizedName("test_block").setCreativeTab(ModMain.modTab);
		test_ore = new ModOre("test_ore", Material.rock, ModItems.test_item, 1, 2, 20.0f, 10.0f, 2, ModMain.modTab);
	}
	
	/**
	 * Register blocks here
	 */
	public static void register(){
		/*
		 * Use GameRegistry.registerBlock(your block variable, your block variable.getUnlocalizedName().substring(5));
		 */
		GameRegistry.registerBlock(test_block, test_block.getUnlocalizedName().substring(5)); // "title.dirt_sword"
		GameRegistry.registerBlock(test_ore, test_ore.getUnlocalizedName().substring(5));
	}
	
	/**
	 * Register block render here
	 */
	public static void registerRenders(){
		/*
		 * Use registerRender(your block variable);
		 */
		registerRender(test_block);
		registerRender(test_ore);
	}
	
	/**
	 * Makes registering block renders easier
	 */
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
