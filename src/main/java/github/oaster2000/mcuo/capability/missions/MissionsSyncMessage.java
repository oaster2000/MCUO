package github.oaster2000.mcuo.capability.missions;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IThreadListener;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MissionsSyncMessage implements IMessage {
	
	public MissionsSyncMessage() {
	}

	private int hkc;
	private int ahkc;
	private int vkc;
	private int currID;

	public MissionsSyncMessage(int hkc, int ahkc, int vkc, int currID) {
		this.hkc = hkc;
		this.ahkc = ahkc;
		this.vkc = vkc;
		this.currID = currID;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		hkc = buf.readInt();
		ahkc = buf.readInt();
		vkc = buf.readInt();
		currID = buf.readInt();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(hkc);
		buf.writeInt(ahkc);
		buf.writeInt(vkc);
		buf.writeInt(currID);
	}

	public static class Handler implements IMessageHandler<MissionsSyncMessage, IMessage> {

		@Override
		public IMessage onMessage(MissionsSyncMessage message, MessageContext ctx) {
						IThreadListener mainThread = Minecraft.getMinecraft();
			mainThread.addScheduledTask(new Runnable() {
				@Override
				public void run() {
					Minecraft mc = Minecraft.getMinecraft();
					EntityPlayer player = mc.player;
					IMissions capability = player.getCapability(CapabilityHandler.MISSIONS, null);
					if (capability != null) {
						capability.setHKC(message.hkc);
						capability.setAHKC(message.ahkc);
						capability.setVKC(message.vkc);
						capability.setCurrentMissionID(message.currID);
					}
				}

			});

			return null;
		}
	}
}