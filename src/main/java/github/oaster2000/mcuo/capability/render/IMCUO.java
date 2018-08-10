package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.ICapability;

public interface IMCUO extends ICapability
{
	public void setHelmColorR(float r);
	public void setHelmColorG(float g);
	public void setHelmColorB(float b);
	public float getHelmColorR();
	public float getHelmColorG();
	public float getHelmColorB();
	
	public void setTorsoColorR(float r);
	public void setTorsoColorG(float g);
	public void setTorsoColorB(float b);
	public float getTorsoColorR();
	public float getTorsoColorG();
	public float getTorsoColorB();
	
	public void setCapeColorR(float r);
	public void setCapeColorG(float g);
	public void setCapeColorB(float b);
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

}