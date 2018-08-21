package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import github.oaster2000.mcuo.capability.render.MCUOServerSyncMessage;
import github.oaster2000.mcuo.common.MCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class GUIMaskChoice extends GuiChoiceBase {

	GuiButton helmetDown;
	GuiButton helmetUp;
	GuiButton updateColor;

	GuiTextField helmColorR;
	GuiTextField helmColorG;
	GuiTextField helmColorB;

	EntityPlayer player = Minecraft.getMinecraft().player;
	IMCUO mcuo;

	@Override
	public void initGui() {
		mcuo = player.getCapability(CapabilityHandler.MCUO, null);
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		
		helmColorR = new GuiTextField(5, Minecraft.getMinecraft().fontRenderer, guiLeft + 160, guiTop + 65, 30, 20);
		helmColorG = new GuiTextField(6, Minecraft.getMinecraft().fontRenderer, guiLeft + 210, guiTop + 65, 30, 20);
		helmColorB = new GuiTextField(7, Minecraft.getMinecraft().fontRenderer, guiLeft + 260, guiTop + 65, 30, 20);
		
		helmetDown = new GuiButton(2, guiLeft + 190, guiTop + 25, 20, 20, "<");
		helmetUp = new GuiButton(3, guiLeft + 230, guiTop + 25, 20, 20, ">");
		updateColor = new GuiButton(4, guiLeft + 185, guiTop + 90, 80, 20, "Update");
		
		this.helmColorR.setMaxStringLength(3);
		this.helmColorG.setMaxStringLength(3);
		this.helmColorB.setMaxStringLength(3);
		this.helmColorR.setText("" + (int) (mcuo.getHelmColorR() * 255));
		this.helmColorG.setText("" + (int) (mcuo.getHelmColorG() * 255));
		this.helmColorB.setText("" + (int) (mcuo.getHelmColorB() * 255));
		buttonList.clear();
		buttonList.add(helmetDown);
		buttonList.add(helmetUp);
		buttonList.add(updateColor);
		this.page = 0;
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 1:
			MCUO.NETWORK.sendToServer(new MCUOServerSyncMessage(mcuo.getHelmColorR(), mcuo.getHelmColorG(),
					mcuo.getHelmColorB(), mcuo.getHelmType(), mcuo.hasCreatedCharacter()));
			Minecraft.getMinecraft().displayGuiScreen(new GUITorsoChoice());
			return;
		case 2:
			switch (mcuo.getHelmType()) {
			case 0:
				mcuo.setHelmType(3);
				break;
			case 1:
				mcuo.setHelmType(0);
				break;
			case 2:
				mcuo.setHelmType(1);
				break;
			case 3:
				mcuo.setHelmType(2);
				break;
			}
			return;
		case 3:
			switch (mcuo.getHelmType()) {
			case 0:
				mcuo.setHelmType(1);
				break;
			case 1:
				mcuo.setHelmType(2);
				break;
			case 2:
				mcuo.setHelmType(3);
				break;
			case 3:
				mcuo.setHelmType(0);
				break;
			}
			return;
		case 4:
			mcuo.setHelmColor((float) (Integer.parseInt(this.helmColorR.getText())) / 255, (float) (Integer.parseInt(this.helmColorG.getText())) / 255, (float) (Integer.parseInt(this.helmColorB.getText())) / 255);
			return;
		}

		try {
			super.actionPerformed(button);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void keyTyped(char par1, int par2) {
		try {
			super.keyTyped(par1, par2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (this.helmColorR.isFocused())
			this.helmColorR.textboxKeyTyped(par1, par2);
		if (this.helmColorG.isFocused())
			this.helmColorG.textboxKeyTyped(par1, par2);
		if (this.helmColorB.isFocused())
			this.helmColorB.textboxKeyTyped(par1, par2);
	}

	protected void mouseClicked(int x, int y, int btn) {
		try {
			super.mouseClicked(x, y, btn);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.helmColorR.mouseClicked(x, y, btn);
		this.helmColorG.mouseClicked(x, y, btn);
		this.helmColorB.mouseClicked(x, y, btn);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		int i = this.guiLeft - 40;
		int j = this.guiTop;
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Mask/Helmet", i + 230, j + 10, 0xffa7a7a7);
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Mask/Helmet Color", i + 220, j + 50, 0xffa7a7a7);
		this.helmColorR.drawTextBox();
		this.helmColorG.drawTextBox();
		this.helmColorB.drawTextBox();
	}
}