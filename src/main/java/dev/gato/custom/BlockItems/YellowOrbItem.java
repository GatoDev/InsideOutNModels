package dev.gato.custom.BlockItems;

import dev.gato.insideoutnmodels.entity.PurpleOrbProjEntity;
import dev.gato.insideoutnmodels.entity.YellowOrbProjEntity;
import dev.gato.insideoutnmodels.init.InsideoutnmodelsModEntities;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class YellowOrbItem extends BlockItem {
    public YellowOrbItem(Block p_40565_, Properties p_40566_) {
        super(p_40565_, p_40566_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        if (!level.isClientSide()) {
            Projectile _entityToSpawn = new Object() {
                public Projectile getArrow(Level level, float damage, int knockback) {
                    AbstractArrow entityToSpawn = new YellowOrbProjEntity(InsideoutnmodelsModEntities.YELLOW_ORB_PROJ.get(), level);
                    entityToSpawn.setBaseDamage(damage);
                    entityToSpawn.setKnockback(knockback);
                    entityToSpawn.setSilent(true);
                    return entityToSpawn;
                }
            }.getArrow(level, 5, 1);
            _entityToSpawn.setPos(player.getX(), player.getEyeY() - 0.1, player.getZ());
            _entityToSpawn.shoot(player.getLookAngle().x, player.getLookAngle().y, player.getLookAngle().z, 1, 0);
            level.addFreshEntity(_entityToSpawn);
        }

        player.getMainHandItem().shrink(1);

        return super.use(level, player, interactionHand);
    }
}
