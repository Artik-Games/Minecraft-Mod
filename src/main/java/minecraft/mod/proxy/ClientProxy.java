package minecraft.mod.proxy;

import minecraft.mod.init.ModBlocks;
import minecraft.mod.init.ModItems;

public class ClientProxy extends CommonProxy{
	
	@Override
	public void registerRenders(){
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}
}
