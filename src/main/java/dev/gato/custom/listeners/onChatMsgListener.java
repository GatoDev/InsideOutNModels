package dev.gato.custom.listeners;

import dev.gato.insideoutnmodels.InsideoutnmodelsMod;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InsideoutnmodelsMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class onChatMsgListener {
    @SubscribeEvent
    public static void onChatMessage(ClientChatReceivedEvent event) {
        if (event.getMessage().getString().contains("Replaced a slot on")) {
            event.setCanceled(true);
        }
    }
}
