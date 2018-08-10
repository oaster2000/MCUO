package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class MissionsProvider implements ICapabilityProvider, INBTSerializable<NBTBase> {

	private IMissions instance = CapabilityHandler.MISSIONS.getDefaultInstance();
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == CapabilityHandler.MISSIONS;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == CapabilityHandler.MISSIONS ? CapabilityHandler.MISSIONS.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return CapabilityHandler.MISSIONS.getStorage().writeNBT(CapabilityHandler.MISSIONS, instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		CapabilityHandler.MISSIONS.getStorage().readNBT(CapabilityHandler.MISSIONS, instance, null, nbt);
	}

}
