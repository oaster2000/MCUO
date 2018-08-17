package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.common.Reference;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

public class MCUOCap implements IMCUO
{
	private boolean createdCharacter = false;
	
	private int helmType = 0;
	private int torsoType = 0;
	private int capeType = 0;

	private float helmR = 1.0f;
	private float helmG = 1.0f;
	private float helmB = 1.0f;

	private float torsoR = 1.0f;
	private float torsoG = 1.0f;
	private float torsoB = 1.0f;
	
	private float capeR = 1.0f;
	private float capeG = 1.0f;
	private float capeB = 1.0f;
	
	private int powerset = 0;
	
	private int type = 0;
	
	private static ResourceLocation RL = new ResourceLocation(Reference.modid, "mcuo");
	
	public void setHelmColorR(float r) {
		helmR = r;
		MCUO.NETWORK.sendToServer(new MCUOSyncMessage(this.helmR, this.helmG, this.helmB, this.helmType, this.createdCharacter));
	}
	
	public void setHelmColorG(float g) {
		helmG = g;
		MCUO.NETWORK.sendToServer(new MCUOSyncMessage(this.helmR, this.helmG, this.helmB, this.helmType, this.createdCharacter));
	}
	
	public void setHelmColorB(float b) {
		helmB = b;
		MCUO.NETWORK.sendToServer(new MCUOSyncMessage(this.helmR, this.helmG, this.helmB, this.helmType, this.createdCharacter));
	}
	
	public float getHelmColorR() {
		return helmR;
	}
	
	public float getHelmColorG() {
		return helmG;
	}
	
	public float getHelmColorB() {
		return helmB;
	}
	
	@Override
	public float getTorsoColorR() {
		return torsoR;
	}
	
	@Override
	public float getTorsoColorG() {
		return torsoG;
	}
	
	@Override
	public float getTorsoColorB() {
		return torsoB;
	}
	
	@Override
	public void setCapeColorR(float r) {
		capeR = r;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.capeR, this.capeG, this.capeB, this.capeType, this.createdCharacter));
	}
	
	@Override
	public void setCapeColorG(float g) {
		capeG = g;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.capeR, this.capeG, this.capeB, this.capeType, this.createdCharacter));
	}
	
	@Override
	public void setCapeColorB(float b) {
		capeB = b;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.capeR, this.capeG, this.capeB, this.capeType, this.createdCharacter));
	}
	
	@Override
	public float getCapeColorR() {
		return capeR;
	}
	
	@Override
	public float getCapeColorG() {
		return capeG;
	}
	
	@Override
	public float getCapeColorB() {
		return capeB;
	}
	
	@Override
	public void setTorsoColorR(float r) {
		torsoR = r;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.torsoR, this.torsoG, this.torsoB, this.torsoType, this.createdCharacter));
	}
	
	@Override
	public void setTorsoColorG(float g) {
		torsoG = g;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.torsoR, this.torsoG, this.torsoB, this.torsoType, this.createdCharacter));
	}
	
	@Override
	public void setTorsoColorB(float b) {
		torsoB = b;
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.torsoR, this.torsoG, this.torsoB, this.torsoType, this.createdCharacter));
	}
	
	public int getHelmType() {
		return helmType;
	}
	
	public void setHelmType(int type) {
		helmType = type;
		MCUO.NETWORK.sendToServer(new MCUOSyncMessage(this.helmR, this.helmG, this.helmB, this.helmType, this.createdCharacter));
	}
	
	@Override
	public boolean hasCreatedCharacter() {
		return createdCharacter;
	}
	
	@Override
	public void setCreatedCharacter(boolean created) {
		createdCharacter = created;
		MCUO.NETWORK.sendToServer(new MCUOSyncMessage(this.helmR, this.helmG, this.helmB, this.helmType, this.createdCharacter));
	}

	@Override
	public int getTorsoType() {
		return torsoType;
	}
	
	@Override
	public void setTorsoType(int type) {
		torsoType = type;
		MCUO.NETWORK.sendToServer(new TorsoSyncMessage(this.torsoR, this.torsoG, this.torsoB, this.torsoType, this.createdCharacter));
	}
	
	@Override
	public int getCapeType() {
		return capeType;
	}
	
	@Override
	public void setCapeType(int type) {
		capeType = type;
		MCUO.NETWORK.sendToServer(new TorsoSyncMessage(this.capeR, this.capeG, this.capeB, this.capeType, this.createdCharacter));
	}
	
	@Override
    public ResourceLocation getKey()
    {
        return RL;
    }

    @Override
    public ICapabilityProvider getProvider()
    {
        return new MCUOProvider();
    }

    @Override
    public void dataChanged(EntityPlayerMP player)
    {
    	MCUO.NETWORK.sendTo(new MCUOSyncMessage(helmR, helmG, helmB, helmType, createdCharacter), player);
    	MCUO.NETWORK.sendTo(new TorsoSyncMessage(torsoR, torsoG, torsoB, torsoType, createdCharacter), player);
    	MCUO.NETWORK.sendTo(new CapeSyncMessage(capeR, capeG, capeB, capeType, createdCharacter), player);
    	MCUO.NETWORK.sendTo(new PowersSyncMessage(powerset, createdCharacter), player);
    	MCUO.NETWORK.sendTo(new TypeSyncMessage(type, createdCharacter), player);
    }

    @Override
    public NBTTagCompound serializeNBT()
    {
    	NBTTagCompound nbt = new NBTTagCompound();
		nbt.setFloat("helmR", getHelmColorR());
		nbt.setFloat("helmG", getHelmColorG());
		nbt.setFloat("helmB", getHelmColorB());
		nbt.setFloat("torsoR", getTorsoColorR());
		nbt.setFloat("torsoG", getTorsoColorG());
		nbt.setFloat("torsoB", getTorsoColorB());
		nbt.setFloat("capeR", getCapeColorR());
		nbt.setFloat("capeG", getCapeColorG());
		nbt.setFloat("capeB", getCapeColorB());
		nbt.setInteger("helmType", getHelmType());
		nbt.setInteger("torsoType", getTorsoType());
		nbt.setInteger("capeType", getCapeType());
		nbt.setBoolean("createdCharacter", hasCreatedCharacter());
		nbt.setInteger("powerset", getPowers());
		nbt.setInteger("type", getType());
		return nbt;
    }

    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
    	setHelmColorR(((NBTTagCompound) nbt).getFloat("helmR"));
		setHelmColorG(((NBTTagCompound) nbt).getFloat("helmG"));
		setHelmColorB(((NBTTagCompound) nbt).getFloat("helmB"));
    	setTorsoColorR(((NBTTagCompound) nbt).getFloat("torsoR"));
		setTorsoColorG(((NBTTagCompound) nbt).getFloat("torsoG"));
		setTorsoColorB(((NBTTagCompound) nbt).getFloat("torsoB"));
    	setCapeColorR(((NBTTagCompound) nbt).getFloat("capeR"));
		setCapeColorG(((NBTTagCompound) nbt).getFloat("capeG"));
		setCapeColorB(((NBTTagCompound) nbt).getFloat("capeB"));
		setHelmType(((NBTTagCompound) nbt).getInteger("helmType"));
		setTorsoType(((NBTTagCompound) nbt).getInteger("torsoType"));
		setCapeType(((NBTTagCompound) nbt).getInteger("capeType"));
		setCreatedCharacter(((NBTTagCompound) nbt).getBoolean("createdCharacter"));
		setPowers(((NBTTagCompound) nbt).getInteger("powerset"));
		setType(((NBTTagCompound) nbt).getInteger("type"));
    }

	@Override
	public void setPowers(int power) {
		powerset = power;
		MCUO.NETWORK.sendToServer(new PowersSyncMessage(this.powerset, this.createdCharacter));
	}

	@Override
	public int getPowers() {
		return powerset;
	}

	@Override
	public void setType(int power) {
		type = power;
		MCUO.NETWORK.sendToServer(new TypeSyncMessage(this.type, this.createdCharacter));
	}

	@Override
	public int getType() {
		return type;
	}


}