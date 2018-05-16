package github.oaster2000.mcuo.common;

import github.oaster2000.mcuo.capability.CapabilityEventHandler;
import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.handler.GuiOpenOnWorld;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy {

	@SubscribeEvent
	public void preInit(FMLPreInitializationEvent e) {
	}

	@SubscribeEvent
	public void init(FMLInitializationEvent e) {
	}

	@SubscribeEvent
	public void postInit(FMLPostInitializationEvent e) {

	}

}
