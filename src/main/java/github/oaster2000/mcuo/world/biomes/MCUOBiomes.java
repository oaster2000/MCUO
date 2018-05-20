package github.oaster2000.mcuo.world.biomes;

import github.oaster2000.mcuo.common.Reference;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.modid)
public class MCUOBiomes {

	public static final BiomeField FIELD = null;

	@Mod.EventBusSubscriber(modid = Reference.modid)
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Biome> event) {
			final IForgeRegistry<Biome> registry = event.getRegistry();
			System.out.println("Registering biomes");
			registry.register(new BiomeField().setRegistryName(Reference.modid, "field"));
		}
	}

	public static void initBiomeManagerAndDictionary() {
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(FIELD, 10));
		BiomeManager.addSpawnBiome(FIELD);
		BiomeManager.addStrongholdBiome(FIELD);
		BiomeDictionary.addTypes(FIELD, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DRY,
				BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.PLAINS);

	}

}
