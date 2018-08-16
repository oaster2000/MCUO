package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.common.MCUO;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;

public class MCUOProvider implements ICapabilityProvider, INBTSerializable<NBTBase> {

	private IMCUO instance;

	public MCUOProvider() {
		instance = new MCUOCap();
	}
	
	@Override
	public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
		return capability == CapabilityHandler.MCUO;
	}

	@Override
	public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
		return capability == CapabilityHandler.MCUO ? CapabilityHandler.MCUO.<T> cast(this.instance) : null;
	}

	@Override
	public NBTBase serializeNBT() {
		return CapabilityHandler.MCUO.getStorage().writeNBT(CapabilityHandler.MCUO, instance, null);
	}

	@Override
	public void deserializeNBT(NBTBase nbt) {
		CapabilityHandler.MCUO.getStorage().readNBT(CapabilityHandler.MCUO, instance, null, nbt);
	}

}
