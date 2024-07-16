
package dev.gato.insideoutnmodels.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import dev.gato.insideoutnmodels.procedures.TNTRightclickedProcedure;
import dev.gato.insideoutnmodels.init.InsideoutnmodelsModTabs;

public class TNTItem extends Item {
	public TNTItem() {
		super(new Item.Properties().tab(InsideoutnmodelsModTabs.TAB_INSIDE_OUT_MODELS_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TNTRightclickedProcedure.execute(entity);
		return ar;
	}
}
