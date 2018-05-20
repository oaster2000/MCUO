package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.PowersServerSyncMessage;
import github.oaster2000.mcuo.common.MCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.entity.player.EntityPlayer;

public class GUIPowerChoice extends GuiChoiceBase {

	GuiButton powerDown;
	GuiButton powerUp;

	EntityPlayer player = Minecraft.getMinecraft().player;
	IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);
	
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
			switch (mcuo.getPowers()) {
			case 0:
				mcuo.setPowers(5);
				break;
			case 1:
				mcuo.setPowers(0);
				break;
			case 2:
				mcuo.setPowers(1);
				break;
			case 3:
				mcuo.setPowers(2);
				break;
			case 4:
				mcuo.setPowers(3);
				break;
			case 5:
				mcuo.setPowers(4);
				break;
			}
			MCUO.NETWORK.sendToAll(new PowersServerSyncMessage(mcuo.getPowers(), mcuo.hasCreatedCharacter()));
			return;
		case 3:
			switch (mcuo.getPowers()) {
			case 0:
				mcuo.setPowers(1);
				break;
			case 1:
				mcuo.setPowers(2);
				break;
			case 2:
				mcuo.setPowers(3);
				break;
			case 3:
				mcuo.setPowers(4);
				break;
			case 4:
				mcuo.setPowers(5);
				break;
			case 5:
				mcuo.setPowers(0);
				break;
			}
			MCUO.NETWORK.sendToAll(new PowersServerSyncMessage(mcuo.getPowers(), mcuo.hasCreatedCharacter()));
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