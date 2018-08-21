package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.common.Reference;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class LevelSystem implements ILevelSystem {

	private int level = 0;
	private int exp = 0;

	private static ResourceLocation RL = new ResourceLocation(Reference.modid, "level");
	
	@Override
	public ResourceLocation getKey() {
		return RL;
	}

	@Override
	public ICapabilityProvider getProvider() {
		return new LevelSystemProvider();
	}

	@Override
	public void dataChanged(EntityPlayerMP player) {
		if(!player.world.isRemote) {
			MCUO.NETWORK.sendTo(new LevelSystemSyncMessage(this), player);
		}
	}
	
	@Override
	public void syncToServer() {
		MCUO.NETWORK.sendToServer(new LevelSystemSyncMessage(this));
	}

	@Override
	public NBTTagCompound serializeNBT() {
    	NBTTagCompound nbt = new NBTTagCompound();
    	nbt.setInteger("Level", level);
    	nbt.setInteger("Xp", exp);
		return nbt;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.level = nbt.getInteger("Level");
		this.exp = nbt.getInteger("Xp");
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public void setLevel(int lvl) {
		this.level = lvl;
		syncToServer();
	}

	@Override
	public int getExp() {
		return exp;
	}

	@Override
	public void setExp(int exp) {
		this.exp = exp;
		syncToServer();
	}
}
