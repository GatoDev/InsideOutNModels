
package dev.gato.insideoutnmodels.entity;

import dev.gato.insideoutnmodels.init.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TNTProjectileEntity extends AbstractArrow implements ItemSupplier {
	public TNTProjectileEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(InsideoutnmodelsModEntities.TNT_PROJECTILE.get(), world);
	}

	public TNTProjectileEntity(EntityType<? extends TNTProjectileEntity> type, Level world) {
		super(type, world);
	}

	public TNTProjectileEntity(EntityType<? extends TNTProjectileEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public @NotNull Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public @NotNull ItemStack getItem() {
		return new ItemStack(InsideoutnmodelsModItems.TNT.get());
	}

	@Override
	protected @NotNull ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(@NotNull LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static TNTProjectileEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		TNTProjectileEntity entityarrow = new TNTProjectileEntity(InsideoutnmodelsModEntities.TNT_PROJECTILE.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);

		//noinspection DataFlowIssue
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static TNTProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		TNTProjectileEntity entityarrow = new TNTProjectileEntity(InsideoutnmodelsModEntities.TNT_PROJECTILE.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);

		//noinspection DataFlowIssue
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1, 1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}

	@Override
	protected void onHit(@NotNull HitResult p_37260_) {

		if(level instanceof ServerLevel serverLevel){
			serverLevel.sendParticles((SimpleParticleType) InsideoutnmodelsModParticleTypes.EXPLOSION_PARTICLE.get(), getX(), getY()-2, getZ(), 1, 0, 0, 0, 0);

            //noinspection DataFlowIssue
            serverLevel.playSound(null, getX(), getY(), getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("insideoutnmodels:boom")), SoundSource.NEUTRAL, 0.1f, level.getRandom().nextFloat() + 0.5f);
		}

		super.onHit(p_37260_);
	}
}
