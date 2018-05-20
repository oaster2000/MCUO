package github.oaster2000.mcuo.world;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

import github.oaster2000.mcuo.world.biomes.MCUOBiomes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;

public class MCUOBiomeProvider extends BiomeProviderSingle {
	
	public MCUOBiomeProvider() {
		super(MCUOBiomes.FIELD);
		
		// DEBUG
        System.out.println("Constructing BiomeProviderMCUO");
	}

}
