package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.common.Reference;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class Missions implements IMissions{

	private int heroKillCount = 0;
	private int antiHeroKillCount = 0;
	private int villainKillCount = 0;
	private int currentMissionID = 0;

	private static ResourceLocation RL = new ResourceLocation(Reference.modid, "missions");
	
	@Override
	public ResourceLocation getKey() {
		return RL;
	}

	@Override
	public ICapabilityProvider getProvider() {
		return new MissionsProvider();
	}

	@Override
	public void dataChanged(EntityPlayerMP player) {
		if(!player.world.isRemote) {
			MCUO.NETWORK.sendTo(new MissionsSyncMessage(this), player);
		}
	}
	
	@Override
	public void syncToServer() {
		MCUO.NETWORK.sendToServer(new MissionsSyncMessage(this));
	}

	@Override
	public NBTTagCompound serializeNBT() {
    	NBTTagCompound nbt = new NBTTagCompound();
    	nbt.setInteger("hKC", heroKillCount);
    	nbt.setInteger("aHKC", antiHeroKillCount);
    	nbt.setInteger("vKC", villainKillCount);
    	nbt.setInteger("currID", currentMissionID);
		return nbt;
	}

	@Override
	public void deserializeNBT(NBTTagCompound nbt) {
		this.heroKillCount = nbt.getInteger("hKC");
		this.antiHeroKillCount = nbt.getInteger("aHKC");
		this.villainKillCount = nbt.getInteger("vKC");
		this.currentMissionID = nbt.getInteger("currID");
	}

	@Override
	public int getHeroKillCount() {
		return heroKillCount;
	}

	@Override
	public void setHKC(int kc) {
		this.heroKillCount = kc;
		syncToServer();
	}

	@Override
	public int getAntiHeroKillCount() {
		return antiHeroKillCount;
	}

	@Override
	public void setAHKC(int kc) {
		this.antiHeroKillCount = kc;
		syncToServer();
	}
	
	@Override
	public int getVillainKillCount() {
		return antiHeroKillCount;
	}

	@Override
	public void setVKC(int kc) {
		this.villainKillCount = kc;
		syncToServer();
	}

	@Override
	public void addToHeroKillCount() {
		this.heroKillCount = heroKillCount + 1;
		syncToServer();
	}

	@Override
	public void addToAntiHeroKillCount() {
		this.antiHeroKillCount = antiHeroKillCount + 1;
		syncToServer();
	}

	@Override
	public void addToVillainKillCount() {
		this.villainKillCount = villainKillCount + 1;
		syncToServer();
	}

	@Override
	public int getCurrentMissionID() {
		return currentMissionID;
	}

	@Override
	public void setCurrentMissionID(int newID) {
		currentMissionID = newID;
		syncToServer();
	}
}
