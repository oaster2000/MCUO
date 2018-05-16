package github.oaster2000.mcuo.capability.levels;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

public class LevelSystemProvider implements ICapabilitySerializable<NBTTagCompound>{

	private ILevelSystem ls;

    public LevelSystemProvider()
    {
    	ls = new LevelSystem();
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, @Nullable EnumFacing facing)
    {
        return capability == CapabilityHandler.LVL_SYS;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, @Nullable EnumFacing facing)
    {
        return hasCapability(capability, facing) ? (T) ls : null;
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
        return ls.serializeNBT();
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
    	ls.deserializeNBT(nbt);
    }

}
