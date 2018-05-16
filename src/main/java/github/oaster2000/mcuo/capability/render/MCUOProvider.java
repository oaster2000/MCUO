package github.oaster2000.mcuo.capability.render;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class MCUOProvider implements ICapabilitySerializable<NBTTagCompound>{

	private IMCUO mcuo;

    public MCUOProvider()
    {
    	mcuo = new MCUOCap();
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing)
    {
        return capability == CapabilityHandler.MCUO;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing)
    {
        return hasCapability(capability, facing) ? (T) mcuo : null;
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        return mcuo.serializeNBT();
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
    	mcuo.deserializeNBT(nbt);
    }

}
