package minecraft.mod;


import minecraft.mod.init.ModBlocks;
import minecraft.mod.init.ModItems;
import minecraft.mod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class ModMain {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final ModTab modTab = new ModTab("modTab");
	
	/**
	 * Put init's and registers here
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModBlocks.init();
		ModBlocks.register();
		ModItems.init();
		ModItems.register();
	}
	
	/**
	 * I think the only thing that goes here it the proxy renders
	 */
	@EventHandler
	public void Init(FMLInitializationEvent event){
		proxy.registerRenders();
	}
	
	/**
	 * What's this for? I don't know.
	 * @param event
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
