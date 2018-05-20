package github.oaster2000.mcuo.common;

import github.oaster2000.mcuo.capability.CapabilityEventHandler;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.levels.LevelSystemServerSyncMessage;
import github.oaster2000.mcuo.capability.levels.LevelSystemSyncMessage;
import github.oaster2000.mcuo.capability.render.CapeServerSyncMessage;
import github.oaster2000.mcuo.capability.render.CapeServerSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.CapeSyncMessage;
import github.oaster2000.mcuo.capability.render.CapeSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.MCUOSyncMessage;
import github.oaster2000.mcuo.capability.render.MCUOSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.PowersServerSyncMessage;
import github.oaster2000.mcuo.capability.render.PowersServerSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.PowersSyncMessage;
import github.oaster2000.mcuo.capability.render.PowersSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.TorsoServerSyncMessage;
import github.oaster2000.mcuo.capability.render.TorsoServerSyncMessageHandler;
import github.oaster2000.mcuo.capability.render.TorsoSyncMessage;
import github.oaster2000.mcuo.capability.render.TorsoSyncMessageHandler;
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
        
        NETWORK.registerMessage(MCUOSyncMessageHandler.class, MCUOSyncMessage.class, 0, Side.CLIENT);
        
        NETWORK.registerMessage(MCUOServerSyncMessageHandler.class, MCUOServerSyncMessage.class, 1, Side.SERVER);
        
        NETWORK.registerMessage(TorsoSyncMessageHandler.class, TorsoSyncMessage.class, 2, Side.CLIENT);
        
        NETWORK.registerMessage(TorsoServerSyncMessageHandler.class, TorsoServerSyncMessage.class, 3, Side.SERVER);
        
        NETWORK.registerMessage(CapeSyncMessageHandler.class, CapeSyncMessage.class, 4, Side.CLIENT);
        
        NETWORK.registerMessage(CapeServerSyncMessageHandler.class, CapeServerSyncMessage.class, 5, Side.SERVER);
    
        NETWORK.registerMessage(LevelSystemSyncMessage.Handler.class, LevelSystemSyncMessage.class, 6, Side.CLIENT);
        
        NETWORK.registerMessage(LevelSystemServerSyncMessage.Handler.class, LevelSystemServerSyncMessage.class, 7, Side.SERVER);
	
        NETWORK.registerMessage(PowersSyncMessageHandler.class, PowersSyncMessage.class, 8, Side.CLIENT);
        
        NETWORK.registerMessage(PowersServerSyncMessageHandler.class, PowersServerSyncMessage.class, 9, Side.SERVER);
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
