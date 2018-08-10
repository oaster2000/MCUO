package github.oaster2000.mcuo.packet;

import github.oaster2000.mcuo.gui.GUIMaskChoice;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CharacterCreationMessageHandler implements IMessageHandler<CharacterCreationMessage, IMessage> {

	@Override
	public IMessage onMessage(CharacterCreationMessage message, MessageContext ctx) {
		Minecraft.getMinecraft().addScheduledTask(new Runnable() {
			@Override
			public void run() {
				Minecraft mc = Minecraft.getMinecraft();
				EntityPlayer player = mc.player;
				mc.displayGuiScreen(new GUIMaskChoice());
			}

		});

		return null;
	}
}