package github.oaster2000.mcuo.keybindings;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class Keybinds {
	
	public static KeyBinding missions;
	public static KeyBinding ability1;
	public static KeyBinding ability2;
	public static KeyBinding ability3;
	
    public static void register()
    {
    	missions = new KeyBinding("key.missions.desc", Keyboard.KEY_M, "key.categories.mcuo");
        ClientRegistry.registerKeyBinding(missions);

        ability1 = new KeyBinding("key.ability1.desc", Keyboard.KEY_R, "key.categories.mcuo");
        ClientRegistry.registerKeyBinding(ability1);
        
        ability2 = new KeyBinding("key.ability2.desc", Keyboard.KEY_C, "key.categories.mcuo");
        ClientRegistry.registerKeyBinding(ability2);
        
        ability3 = new KeyBinding("key.ability3.desc", Keyboard.KEY_V, "key.categories.mcuo");
        ClientRegistry.registerKeyBinding(ability3);
    }
}
