
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package dev.gato.insideoutnmodels.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class InsideoutnmodelsModTabs {
	public static CreativeModeTab TAB_INSIDE_OUT_MODELS_TAB;

	public static void load() {
		TAB_INSIDE_OUT_MODELS_TAB = new CreativeModeTab("tabinside_out_models_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.SLIME_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
