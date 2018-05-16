package github.oaster2000.mcuo.capability.render;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class TorsoSyncMessage implements IMessage {
	
	public TorsoSyncMessage() {
	}
	
	private float torsoR;
	private float torsoG;
	private float torsoB;
	private int torsoType;

	private boolean createdChar;

	public TorsoSyncMessage(float r, float g, float b, int type, boolean created) {
		this.torsoR = r;
		this.torsoG = g;
		this.torsoB = b;
		this.torsoType = type;
		this.createdChar = created;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		torsoType = buf.readInt();
		torsoR = buf.readFloat();
		torsoG = buf.readFloat();
		torsoB = buf.readFloat();
		createdChar = buf.readBoolean();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(torsoType);
		buf.writeFloat(torsoR);
		buf.writeFloat(torsoG);
		buf.writeFloat(torsoB);
		buf.writeBoolean(createdChar);
	}

	public static class Handler implements IMessageHandler<TorsoSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(TorsoSyncMessage message, MessageContext ctx) {
						IThreadListener mainThread = Minecraft.getMinecraft();
			mainThread.addScheduledTask(new Runnable() {
				@Override
				public void run() {
					Minecraft mc = Minecraft.getMinecraft();
					EntityPlayerSP player = mc.player;
					IMCUO capability = player.getCapability(CapabilityHandler.MCUO, null);
					if (capability != null) {
						capability.setTorsoColorR(message.torsoR);
						capability.setTorsoColorG(message.torsoG);
						capability.setTorsoColorB(message.torsoB);
						capability.setTorsoType(message.torsoType);
						
						capability.setCreatedCharacter(message.createdChar);
					}
				}

			});

			return null;
		}
	}
}