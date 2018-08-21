package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;

public class GUIHorVChoice extends GuiChoiceBase {

	GuiButton Hero;
	GuiButton AntiHero;
	GuiButton Villain;
	
	EntityPlayer player = Minecraft.getMinecraft().player;
	IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);

	@Override
	public void initGui() {
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		Hero = new GuiButton(2, guiLeft + 170, guiTop + 25, 95, 20, "A Hero");
		AntiHero = new GuiButton(3, guiLeft + 170, guiTop + 60, 95, 20, "An Anti-Hero");
		Villain = new GuiButton(4, guiLeft + 170, guiTop + 95, 95, 20, "A Villain");
		this.page = 8;
		super.initGui();
		this.btnNext.enabled = false;
		this.btnPrev.enabled = false;
		buttonList.clear();
		buttonList.add(Hero);
		buttonList.add(AntiHero);
		buttonList.add(Villain);
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 0:
			return;
		case 1:
			return;
		case 2:
			mcuo.setType(0);
			Minecraft.getMinecraft().displayGuiScreen(null);
			return;
		case 3:
			mcuo.setType(1);
			Minecraft.getMinecraft().displayGuiScreen(null);
			return;
		case 4:
			mcuo.setType(2);
			Minecraft.getMinecraft().displayGuiScreen(null);
			return;
		}

		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		int i = this.guiLeft - 40;
		int j = this.guiTop;
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Are you...", i + 230, j + 10, 0xffa7a7a7);
	}
}