package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class LevelSystemProvider implements ICapabilityProvider, INBTSerializable<NBTBase> {

	private ILevelSystem instance = CapabilityHandler.LVL_SYS.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == CapabilityHandler.LVL_SYS;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == CapabilityHandler.LVL_SYS ? CapabilityHandler.LVL_SYS.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return CapabilityHandler.LVL_SYS.getStorage().writeNBT(CapabilityHandler.LVL_SYS, instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		CapabilityHandler.LVL_SYS.getStorage().readNBT(CapabilityHandler.LVL_SYS, instance, null, nbt);
	}

}
