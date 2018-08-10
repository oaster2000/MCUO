package github.oaster2000.mcuo.handler;

import org.lwjgl.input.Keyboard;

import github.oaster2000.mcuo.common.MCUO;
import github.oaster2000.mcuo.gui.GuiMissions;
import github.oaster2000.mcuo.keybindings.Keybinds;
import github.oaster2000.mcuo.packet.CPacket;
import github.oaster2000.mcuo.packet.RPacket;
import github.oaster2000.mcuo.packet.VPacket;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;

public class KeyHandler {

	@SubscribeEvent
	public void onEvent(KeyInputEvent event) {
		if (Keybinds.missions.isPressed()) {
			Minecraft.getMinecraft().displayGuiScreen(new GuiMissions());
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onKeyInput(TickEvent.PlayerTickEvent event) {
		EntityPlayer player = event.player;
		if (event.side == Side.CLIENT) {
			int key = Keyboard.getEventKey();
			boolean isDown = Keyboard.getEventKeyState();
			
			if (isDown && key == Keybinds.ability1.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendToServer(new RPacket(player));
			}
			
			if (isDown && key == Keybinds.ability2.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendToServer(new CPacket(player));
			}
			
			if (isDown && key == Keybinds.ability3.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendToServer(new VPacket(player));
			}
		}else if (event.side == Side.SERVER && event.player instanceof EntityPlayerMP) {
			EntityPlayerMP playerMP = (EntityPlayerMP) event.player;
			
			int key = Keyboard.getEventKey();
			boolean isDown = Keyboard.getEventKeyState();
			
			if (isDown && key == Keybinds.ability1.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendTo(new RPacket(playerMP), playerMP);
			}
			
			if (isDown && key == Keybinds.ability2.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendTo(new CPacket(playerMP), playerMP);
			}
			
			if (isDown && key == Keybinds.ability3.getKeyCode() && !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()
					&& Minecraft.getMinecraft().currentScreen == null) {
				MCUO.NETWORK.sendTo(new VPacket(playerMP), playerMP);
			}
		}
	}

}
