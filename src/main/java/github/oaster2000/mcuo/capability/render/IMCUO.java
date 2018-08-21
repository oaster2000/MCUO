package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.ICapability;

public interface IMCUO extends ICapability
{
	public float getHelmColorR();
	public float getHelmColorG();
	public float getHelmColorB();
	
	public float getTorsoColorR();
	public float getTorsoColorG();
	public float getTorsoColorB();
	
	public float getCapeColorR();
	public float getCapeColorG();
	public float getCapeColorB();
	
	public int getHelmType();
	public void setHelmType(int type);
	public int getTorsoType();
	public void setTorsoType(int type);
	public int getCapeType();
	public void setCapeType(int type);
	
	public void setPowers(int power);
	public int getPowers();
	
	public void setType(int power);
	public int getType();
	
	public boolean hasCreatedCharacter();
	public void setCreatedCharacter(boolean created);
	
	public void setHelmColor(float r, float g, float b);
	public void setTorsoColor(float r, float g, float b);
	public void setCapeColor(float r, float g, float b);

}