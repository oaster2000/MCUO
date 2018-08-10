package github.oaster2000.mcuo.gui;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class GuiLevelingSystem extends Gui{

	public GuiLevelingSystem(Minecraft mc)
	{
		ScaledResolution scaled = new ScaledResolution(mc);
		int width = scaled.getScaledWidth();
		int height = scaled.getScaledHeight();
		
		drawCenteredString(mc.fontRenderer, "Lvl: " + mc.player.getCapability(CapabilityHandler.LVL_SYS, null).getLevel(), 20, 6, Integer.parseInt("cfcfcf", 16));
	}
	
}
