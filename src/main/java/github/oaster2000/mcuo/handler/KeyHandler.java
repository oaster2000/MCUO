package github.oaster2000.mcuo.handler;

import github.oaster2000.mcuo.gui.GUIMaskChoice;
import github.oaster2000.mcuo.keybindings.Keybinds;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class KeyHandler {

	@SubscribeEvent
	public void onEvent(KeyInputEvent event) {
		if (Keybinds.looks.isPressed()) {
			System.out.println("Looks Key pressed!");
			Minecraft.getMinecraft().displayGuiScreen(new GUIMaskChoice());
		}
	}

}
