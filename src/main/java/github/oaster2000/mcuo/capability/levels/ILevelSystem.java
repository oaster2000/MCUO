package github.oaster2000.mcuo.capability.levels;

import github.oaster2000.mcuo.capability.ICapability;

public interface ILevelSystem extends ICapability{

	public int getLevel();
	public void setLevel(int lvl);
	
	public int getExp();
	public void setExp(int exp);
	
}
