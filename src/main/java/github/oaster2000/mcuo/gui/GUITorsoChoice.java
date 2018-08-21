package github.oaster2000.mcuo.gui;

import java.io.IOException;

import github.oaster2000.mcuo.capability.CapabilityHandler;
import github.oaster2000.mcuo.capability.render.IMCUO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.entity.player.EntityPlayer;

public class GUITorsoChoice extends GuiChoiceBase {

	GuiButton torsoDown;
	GuiButton torsoUp;
	GuiButton updateColor;

	GuiTextField torsoColorR;
	GuiTextField torsoColorG;
	GuiTextField torsoColorB;
	
	EntityPlayer player = Minecraft.getMinecraft().player;
	IMCUO mcuo = player.getCapability(CapabilityHandler.MCUO, null);

	@Override
	public void initGui() {
		this.guiLeft = (this.width - 300) / 2;
		this.guiTop = (this.height - 200) / 2;
		torsoDown = new GuiButton(2, guiLeft + 190, guiTop + 25, 20, 20, "<");
		torsoUp = new GuiButton(3, guiLeft + 230, guiTop + 25, 20, 20, ">");
		updateColor = new GuiButton(4, guiLeft + 185, guiTop + 90, 80, 20, "Update");
		this.torsoColorR = new GuiTextField(5, Minecraft.getMinecraft().fontRenderer, guiLeft + 160, guiTop + 65, 30,
				20);
		this.torsoColorG = new GuiTextField(6, Minecraft.getMinecraft().fontRenderer, guiLeft + 210, guiTop + 65, 30,
				20);
		this.torsoColorB = new GuiTextField(7, Minecraft.getMinecraft().fontRenderer, guiLeft + 260, guiTop + 65, 30,
				20);
		this.torsoColorR.setMaxStringLength(3);
		this.torsoColorG.setMaxStringLength(3);
		this.torsoColorB.setMaxStringLength(3);
		this.torsoColorR.setText("" + (int)(mcuo.getTorsoColorR() * 255));
		this.torsoColorG.setText("" + (int)(mcuo.getTorsoColorG() * 255));
		this.torsoColorB.setText("" + (int)(mcuo.getTorsoColorB() * 255));
		buttonList.clear();
		buttonList.add(torsoDown);
		buttonList.add(torsoUp);
		buttonList.add(updateColor);
		this.page = 1;
		super.initGui();
	}

	@Override
	protected void actionPerformed(GuiButton button) {
		switch (button.id) {
		case 0:
			MCUO.NETWORK.sendToServer(new TorsoServerSyncMessage(mcuo.getTorsoColorR(), mcuo.getTorsoColorG(), mcuo.getTorsoColorB(), mcuo.getTorsoType(), mcuo.hasCreatedCharacter()));
			Minecraft.getMinecraft().displayGuiScreen(new GUIMaskChoice());
			return;
		case 1:
			MCUO.NETWORK.sendToServer(new TorsoServerSyncMessage(mcuo.getTorsoColorR(), mcuo.getTorsoColorG(), mcuo.getTorsoColorB(), mcuo.getTorsoType(), mcuo.hasCreatedCharacter()));
			Minecraft.getMinecraft().displayGuiScreen(new GUICapeChoice());
			return;
		case 2:
			switch (mcuo.getTorsoType()) {
			case 0:
				mcuo.setTorsoType(1);
				break;
			case 1:
				mcuo.setTorsoType(0);
				break;
			}
			return;
		case 3:
			switch (mcuo.getTorsoType()) {
			case 0:
				mcuo.setTorsoType(1);
				break;
			case 1:
				mcuo.setTorsoType(0);
				break;
			}
			return;
		case 4:
<<<<<<< HEAD
			mcuo.setTorsoColor((float)(Integer.parseInt(this.torsoColorR.getText())) / 255, (float)(Integer.parseInt(this.torsoColorG.getText())) / 255, (float)(Integer.parseInt(this.torsoColorB.getText())) / 255);
=======
			mcuo.setTorsoColorR((float)(Integer.parseInt(this.torsoColorR.getText())) / 255);
			mcuo.setTorsoColorG((float)(Integer.parseInt(this.torsoColorG.getText())) / 255);
			mcuo.setTorsoColorB((float)(Integer.parseInt(this.torsoColorB.getText())) / 255);
>>>>>>> 7a04a261e3674935c67bef2d921b0afd68daaf66
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
		if (this.torsoColorR.isFocused())
			this.torsoColorR.textboxKeyTyped(par1, par2);
		if (this.torsoColorG.isFocused())
			this.torsoColorG.textboxKeyTyped(par1, par2);
		if (this.torsoColorB.isFocused())
			this.torsoColorB.textboxKeyTyped(par1, par2);
	}

	protected void mouseClicked(int x, int y, int btn) {
		try {
			super.mouseClicked(x, y, btn);
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.torsoColorR.mouseClicked(x, y, btn);
		this.torsoColorG.mouseClicked(x, y, btn);
		this.torsoColorB.mouseClicked(x, y, btn);
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float partialTicks) {
		super.drawScreen(mouseX, mouseY, partialTicks);
		int i = this.guiLeft - 40;
		int j = this.guiTop;
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Torso", i + 230, j + 10, 0xffa7a7a7);
		Minecraft.getMinecraft().fontRenderer.drawStringWithShadow("Torso Color", i + 220, j + 50, 0xffa7a7a7);
		this.torsoColorR.drawTextBox();
		this.torsoColorG.drawTextBox();
		this.torsoColorB.drawTextBox();
	}
}