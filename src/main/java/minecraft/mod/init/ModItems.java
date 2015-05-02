package minecraft.mod.init;

import minecraft.mod.ModMain;
import minecraft.mod.Reference;
import minecraft.mod.items.VHSTape;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
		//Create variable for item here
		public static Item test_item;
	
		/**
		 * Put item variables here
		 */
		public static void init(){
			/*
			 * After creating a file for your item.
			 * use your item variable = new your item file name().setUnlocalizedName("your variable name");
			 */
			test_item = new VHSTape().setUnlocalizedName("test_item").setCreativeTab(ModMain.modTab);
		}
		
		/**
		 * Register items here
		 */
		public static void register(){
			/*
			 * Use GameRegistry.registerItem(your item variable, your item varible.getUnlocalizedName().substring(5));
			 */
			GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		}
		
		/**
		 * Registers item renders here
		 */
		public static void registerRenders(){
			/*
			 * Use registerRender(your item variable);
			 */
			registerRender(test_item);
		}
		
		/**
		 * Makes registering item renders easier
		 */
		public static void registerRender(Item item){
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
}
