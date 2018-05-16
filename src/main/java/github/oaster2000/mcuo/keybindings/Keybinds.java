package github.oaster2000.mcuo.keybindings;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds {
	
	public static KeyBinding looks;
	 
    public static void register()
    {
    	looks = new KeyBinding("key.looks.desc", Keyboard.KEY_V, "key.categories.mcuo");
 
        ClientRegistry.registerKeyBinding(looks);
    }
}
