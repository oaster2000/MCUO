package github.oaster2000.mcuo.items;

import java.util.HashSet;
import java.util.Set;

import github.oaster2000.mcuo.common.Reference;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public final class ModItems {

	public static Item modifier;
	
	public static void createItems() {
		modifier = (new ModifierItem("modifier"));
	}

	@Mod.EventBusSubscriber(modid = Reference.modid)
	public static class RegistrationHandler {
		public static final Set<Item> ITEMS = new HashSet<>();

		/**
		 * Register this mod's {@link Item}s.
		 *
		 * @param event
		 *            The event
		 */
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			createItems();
			final Item[] items = {modifier};

			final IForgeRegistry<Item> registry = event.getRegistry();

			for (final Item item : items) {
				registry.register(item);
				ITEMS.add(item);
			}
		}
	}

}
