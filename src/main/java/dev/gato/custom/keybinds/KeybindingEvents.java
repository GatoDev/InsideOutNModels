package dev.gato.custom.keybinds;

import dev.gato.insideoutnmodels.InsideoutnmodelsMod;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class KeybindingEvents {
    private static int tickCount = 0;
    private static boolean commandScheduled = false;
    private static String scheduledCommand = "";
    private static Player scheduledPlayer = null;
    private static int delayTicks = 0;

    @Mod.EventBusSubscriber(modid = InsideoutnmodelsMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event) {
            if (Minecraft.getInstance().player == null) return;
            Player player = Minecraft.getInstance().player;

            if (KeyBinding.TALK_KEY.consumeClick()) {
                Minecraft.getInstance().player.chat("/item replace entity " + player.getScoreboardName() + " armor.head with minecraft:coal");
                scheduleCommand(player, "item replace entity " + player.getScoreboardName() + " armor.head with air", 60); // Program the elimination of the item
            }
        }

        @SubscribeEvent
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if (event.player.equals(Minecraft.getInstance().player) && commandScheduled) {
                tickCount++;
                if (tickCount >= delayTicks) { // Usar delayTicks para comparar
                    Minecraft.getInstance().player.chat("/" + scheduledCommand);
                    resetScheduler();
                }
            }
        }

        private static void scheduleCommand(Player player, String command, int delay) {
            scheduledPlayer = player;
            scheduledCommand = command;
            tickCount = 0;
            delayTicks = delay;
            commandScheduled = true;
        }

        private static void resetScheduler() {
            tickCount = 0;
            commandScheduled = false;
            scheduledCommand = "";
            scheduledPlayer = null;
            delayTicks = 0;
        }
    }
}