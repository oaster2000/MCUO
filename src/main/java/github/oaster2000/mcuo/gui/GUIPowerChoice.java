package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.utils.SyncUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public class GUIPowerChoice extends GuiChoiceBase {

	GuiButton powerDown;
	GuiButton powerUp;

	@Override
	public void initGui() {
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		powerDown = new GuiButton(2, guiLeft + 190, guiTop + 25, 20, 20, "<");
		powerUp = new GuiButton(3, guiLeft + 230, guiTop + 25, 20, 20, ">");
		buttonList.clear();
		buttonList.add(powerDown);
		buttonList.add(powerUp);
		this.page = 8;
		super.initGui();
		this.btnNext = new GuiButton(1, guiLeft + 230, guiTop + 160, 60, 20, "Finish");
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 0:
			Minecraft.getMinecraft().displayGuiScreen(new GUITorsoChoice());
			return;
		case 1:
			Minecraft.getMinecraft().displayGuiScreen(null);
			return;
		case 2:
			SyncUtils.sync(Minecraft.getMinecraft().player);
			return;
		case 3:
			SyncUtils.sync(Minecraft.getMinecraft().player);
			return;
		}
		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void mouseClicked(int x, int y, int btn) {
		try {
			super.mouseClicked(x, y, btn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		int i = this.guiLeft - 40;
		int j = this.guiTop;
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Power", i + 230, j + 10, 0xffa7a7a7);
	}
}