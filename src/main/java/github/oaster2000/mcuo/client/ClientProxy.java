package github.oaster2000.mcuo.client;

import github.oaster2000.mcuo.client.render.ItemRenderRegister;
import github.oaster2000.mcuo.client.render.RenderBlast;
import github.oaster2000.mcuo.common.CommonProxy;
import github.oaster2000.mcuo.common.Reference;
import github.oaster2000.mcuo.entities.EntityFlameBlast;
import github.oaster2000.mcuo.entities.EntityIceBlast;
import github.oaster2000.mcuo.keybindings.Keybinds;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		//ModBlocks.initModels();
	}

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		Keybinds.register();
		RenderingRegistry.registerEntityRenderingHandler(EntityFlameBlast.class, RenderBlast::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityIceBlast.class, RenderBlast::new);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		ItemRenderRegister.registerItemRenderer();
		
		//MinecraftForge.EVENT_BUS.register(new PlayerRenderHandler());
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
	
	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityEntry> event) {
		int ID = 0;
		EntityEntry fireblast = EntityEntryBuilder.create().entity(EntityFlameBlast.class)
				.id(new ResourceLocation(Reference.modid, "firebeam"), ID++).name("firebeam").tracker(100, 100, true)
				.build();
		event.getRegistry().register(fireblast);
		
		EntityEntry iceblast = EntityEntryBuilder.create().entity(EntityIceBlast.class)
				.id(new ResourceLocation(Reference.modid, "iceblast"), ID++).name("iceblast").tracker(100, 100, true)
				.build();
		event.getRegistry().register(iceblast);
	}
	
}
