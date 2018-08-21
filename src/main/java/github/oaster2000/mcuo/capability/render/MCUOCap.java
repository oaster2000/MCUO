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
	
	public void setHelmColor(float r, float g, float b) {
		helmR = r;
<<<<<<< HEAD
		helmG = g;
=======
		syncToServer();
	}
	
	public void setHelmColorG(float g) {
		helmG = g;
		syncToServer();
	}
	
	public void setHelmColorB(float b) {
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
		helmB = b;
		syncToServer();
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
	public void setCapeColor(float r, float g, float b) {
		capeR = r;
<<<<<<< HEAD
		capeG = g;
=======
		syncToServer();
	}
	
	@Override
	public void setCapeColorG(float g) {
		capeG = g;
		syncToServer();
	}
	
	@Override
	public void setCapeColorB(float b) {
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
		capeB = b;
		syncToServer();
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
	public void setTorsoColor(float r, float g, float b) {
		torsoR = r;
<<<<<<< HEAD
		torsoG = g;
=======
		syncToServer();
	}
	
	@Override
	public void setTorsoColorG(float g) {
		torsoG = g;
		syncToServer();
	}
	
	@Override
	public void setTorsoColorB(float b) {
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
		torsoB = b;
		syncToServer();
	}
	
	public int getHelmType() {
		return helmType;
	}
	
	public void setHelmType(int type) {
		helmType = type;
		syncToServer();
	}
	
	@Override
	public boolean hasCreatedCharacter() {
		return createdCharacter;
	}
	
	@Override
	public void setCreatedCharacter(boolean created) {
		createdCharacter = created;
		syncToServer();
	}

	@Override
	public int getTorsoType() {
		return torsoType;
	}
	
	@Override
	public void setTorsoType(int type) {
		torsoType = type;
		syncToServer();
	}
	
	@Override
	public int getCapeType() {
		return capeType;
	}
	
	@Override
	public void setCapeType(int type) {
		capeType = type;
<<<<<<< HEAD
		MCUO.NETWORK.sendToServer(new CapeSyncMessage(this.capeR, this.capeG, this.capeB, this.capeType, this.createdCharacter));
=======
		syncToServer();
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
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
		if(!player.world.isRemote) {
			MCUO.NETWORK.sendTo(new MCUOClientSyncMessage(this), player);
		}
	}
	
	@Override
	public void syncToServer() {
		MCUO.NETWORK.sendToServer(new MCUOServerSyncMessage(this));
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

<<<<<<< HEAD
    @Override
    public void deserializeNBT(NBTTagCompound nbt)
    {
    	setHelmColor(((NBTTagCompound) nbt).getFloat("helmR"), ((NBTTagCompound) nbt).getFloat("helmG"), ((NBTTagCompound) nbt).getFloat("helmB"));
    	setTorsoColor(((NBTTagCompound) nbt).getFloat("torsoR"), ((NBTTagCompound) nbt).getFloat("torsoG"), ((NBTTagCompound) nbt).getFloat("torsoB"));
    	setCapeColor(((NBTTagCompound) nbt).getFloat("capeR"), ((NBTTagCompound) nbt).getFloat("capeG"),((NBTTagCompound) nbt).getFloat("capeB"));
		setHelmType(((NBTTagCompound) nbt).getInteger("helmType"));
		setTorsoType(((NBTTagCompound) nbt).getInteger("torsoType"));
		setCapeType(((NBTTagCompound) nbt).getInteger("capeType"));
		setCreatedCharacter(((NBTTagCompound) nbt).getBoolean("createdCharacter"));
		setPowers(((NBTTagCompound) nbt).getInteger("powerset"));
		setType(((NBTTagCompound) nbt).getInteger("type"));
		
    }
=======
	@Override
	public void deserializeNBT(NBTTagCompound nbt)
	{
		this.helmR = nbt.getFloat("helmR");
		this.helmG = nbt.getFloat("helmG");
		this.helmB = nbt.getFloat("helmB");
		this.torsoR = nbt.getFloat("torsoR");
		this.torsoG = nbt.getFloat("torsoG");
		this.torsoB = nbt.getFloat("torsoB");
		this.capeR = nbt.getFloat("capeR");
		this.capeG = nbt.getFloat("capeG");
		this.capeB = nbt.getFloat("capeB");
		this.helmType = nbt.getInteger("helmType");
		this.torsoType = nbt.getInteger("torsoType");
		this.capeType = nbt.getInteger("capeType");
		this.createdCharacter = nbt.getBoolean("createdCharacter");
		this.powerset = nbt.getInteger("powerset");
		this.type = nbt.getInteger("type");
	}
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66

	@Override
	public void setPowers(int power) {
		powerset = power;
		syncToServer();
	}

	@Override
	public int getPowers() {
		return powerset;
	}

	@Override
	public void setType(int power) {
		type = power;
		syncToServer();
	}

	@Override
	public int getType() {
		return type;
	}


}