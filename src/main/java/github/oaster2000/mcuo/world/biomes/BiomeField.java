package github.oaster2000.mcuo.world.biomes;

import java.util.Random;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeField extends Biome {

	public BiomeField() {
		super(new BiomeProperties("Field"));
		this.decorator.treesPerChunk = 0;
		this.decorator.extraTreeChance = 0.0F;
		this.decorator.flowersPerChunk = 0;
		this.decorator.grassPerChunk = 0;
		this.topBlock = Blocks.TALLGRASS.getDefaultState();
		this.fillerBlock = Blocks.GRASS.getDefaultState();

	}

	public void decorate(World worldIn, Random rand, BlockPos pos) {
		super.decorate(worldIn, rand, pos);
	}
}