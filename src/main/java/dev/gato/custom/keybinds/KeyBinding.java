package dev.gato.custom.keybinds;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_BINDING_CATEGORY = "key.categories.insideoutnmodels";

    public static final String KEY_BINDING_TALK = "key.insideoutnmodels.talk";

    public static final KeyMapping TALK_KEY =
            new KeyMapping(
                    KEY_BINDING_TALK,
                    KeyConflictContext.IN_GAME,
                    InputConstants.Type.KEYSYM,
                    GLFW.GLFW_KEY_V,
                    KEY_BINDING_CATEGORY
            );
}
