package dev.gato.insideoutnmodels.block;

import dev.gato.insideoutnmodels.init.InsideoutnmodelsModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class PinkOrbBlock extends OrbBlockBase {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public PinkOrbBlock() {
        super(Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }


    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(InsideoutnmodelsModBlocks.PINK_ORB.get(), renderType -> renderType == RenderType.cutout());
    }

    @Override
    public InteractionResult use(BlockState p_60503_, Level level, BlockPos blockPos, Player player, InteractionHand p_60507_, BlockHitResult p_60508_) {

        level.removeBlock(blockPos, false);
        player.getInventory().add(new ItemStack(InsideoutnmodelsModBlocks.PINK_ORB.get(), 1));

        return super.use(p_60503_, level, blockPos, player, p_60507_, p_60508_);
    }

}
