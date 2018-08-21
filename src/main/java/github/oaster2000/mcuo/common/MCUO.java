package github.oaster2000.mcuo.common;

import github.oaster2000.mcuo.capability.CapabilityEventHandler;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.handler.AbilitiesHandler;
import github.oaster2000.mcuo.handler.EventMissionsHandler;
import github.oaster2000.mcuo.handler.GuiHandler;
import github.oaster2000.mcuo.handler.GuiOpenOnWorld;
import github.oaster2000.mcuo.handler.KeyHandler;
import github.oaster2000.mcuo.handler.LevellingEventHandler;
import github.oaster2000.mcuo.handler.RenderGuiHandler;
import github.oaster2000.mcuo.items.ModItems;
import github.oaster2000.mcuo.world.WorldTypeMCUO;
import github.oaster2000.mcuo.world.biomes.MCUOBiomes;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class MCUO {

	@SidedProxy(clientSide = "github.oaster2000.mcuo.client.ClientProxy", serverSide = "github.oaster2000.mcuo.common.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance(value = Reference.modid)
	public static MCUO instance;
	
	public static SimpleNetworkWrapper NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.modid);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		ModItems.createItems();
		new PacketHandler();
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		MinecraftForge.EVENT_BUS.register(new CapabilityEventHandler());
		MinecraftForge.EVENT_BUS.register(new LevellingEventHandler());
		MinecraftForge.EVENT_BUS.register(new EventMissionsHandler());
		CapabilityHandler.init();
		
		
		MinecraftForge.EVENT_BUS.register(new KeyHandler());
		MinecraftForge.EVENT_BUS.register(new AbilitiesHandler());
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		MinecraftForge.EVENT_BUS.register(new GuiOpenOnWorld());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
		MCUOBiomes.initBiomeManagerAndDictionary();
		WorldType MCUO = new WorldTypeMCUO("MCUOOnly");
		
		MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
	}

}
