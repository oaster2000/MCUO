package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.ICapability;

public interface IMissions extends ICapability{

	public int getHeroKillCount();
	public int getAntiHeroKillCount();
	public int getVillainKillCount();
	
	public void addToHeroKillCount();
	public void addToAntiHeroKillCount();
	public void addToVillainKillCount();
	
	public void setHKC(int kc);
	public void setAHKC(int kc);
	public void setVKC(int kc);
	
	public int getCurrentMissionID();
	public void setCurrentMissionID(int newID);
	
}
