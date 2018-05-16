package github.oaster2000.mcuo.common;

import github.oaster2000.mcuo.capability.CapabilityEventHandler;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.capability.render.MCUOSyncMessage;
import github.oaster2000.mcuo.capability.render.TorsoServerSyncMessage;
import github.oaster2000.mcuo.capability.render.TorsoSyncMessage;
import github.oaster2000.mcuo.handler.GuiHandler;
import github.oaster2000.mcuo.handler.GuiOpenOnWorld;
import github.oaster2000.mcuo.handler.KeyHandler;
import github.oaster2000.mcuo.keybindings.Keybinds;
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
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.modid, name = Reference.name, version = Reference.version)
public class MCUO {

	@SidedProxy(clientSide = "github.oaster2000.mcuo.client.ClientProxy", serverSide = "github.oaster2000.mcuo.common.ServerProxy")
	public static CommonProxy proxy;
	
	@Instance(value = Reference.modid)
	public static MCUO instance;
	
	public static SimpleNetworkWrapper NETWORK;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		Keybinds.register();
		MinecraftForge.EVENT_BUS.register(new KeyHandler());
		NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.modid);
        NETWORK.registerMessage(MCUOSyncMessage.Handler.class, MCUOSyncMessage.class, 0, Side.CLIENT);
        NETWORK.registerMessage(MCUOSyncMessage.Handler.class, MCUOSyncMessage.class, 1, Side.SERVER);
        NETWORK.registerMessage(MCUOServerSyncMessage.Handler.class, MCUOServerSyncMessage.class, 2, Side.SERVER);
        NETWORK.registerMessage(MCUOServerSyncMessage.Handler.class, MCUOServerSyncMessage.class, 3, Side.CLIENT);
        NETWORK.registerMessage(TorsoSyncMessage.Handler.class, TorsoSyncMessage.class, 4, Side.CLIENT);
        NETWORK.registerMessage(TorsoSyncMessage.Handler.class, TorsoSyncMessage.class, 5, Side.SERVER);
        NETWORK.registerMessage(TorsoServerSyncMessage.Handler.class, TorsoServerSyncMessage.class, 6, Side.SERVER);
        NETWORK.registerMessage(TorsoServerSyncMessage.Handler.class, TorsoServerSyncMessage.class, 7, Side.CLIENT);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		CapabilityHandler.init();
		MinecraftForge.EVENT_BUS.register(new CapabilityEventHandler());
		MinecraftForge.EVENT_BUS.register(new GuiOpenOnWorld());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}

}
