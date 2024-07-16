package dev.gato.custom.keybinds;

import dev.gato.insideoutnmodels.InsideoutnmodelsMod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod.EventBusSubscriber(modid = InsideoutnmodelsMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RegisterKeyBinds {

    public static void registerKeyBindings() {
        // Register your key bindings here using ClientRegistry
        ClientRegistry.registerKeyBinding(KeyBinding.TALK_KEY);
    }

    static {
        // Subscribe to the FMLClientSetupEvent to call registerKeyBindings at the right time
        FMLJavaModLoadingContext.get().getModEventBus().addListener(RegisterKeyBinds::onClientSetup);
    }

    private static void onClientSetup(final FMLClientSetupEvent event) {
        registerKeyBindings();
    }
}