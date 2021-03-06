package me.ferdz.placeableitems.block.component;

import me.ferdz.placeableitems.block.PlaceableItemsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.storage.loot.LootContext;

import javax.annotation.Nullable;
import java.util.List;

public interface IBlockComponent {

    /**
     * {@link net.minecraft.block.Block#onBlockActivated(BlockState, World, BlockPos, PlayerEntity, Hand, BlockRayTraceResult)}
     */
    boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) throws AbstractBlockComponent.NotImplementedException;

    /**
     * {@link net.minecraft.block.Block#fillStateContainer(StateContainer.Builder)}
     */
    void fillStateContainer(StateContainer.Builder<Block, BlockState> builder);

    /**
     * {@link net.minecraft.block.Block#getStateForPlacement(BlockItemUseContext)}
     */
    BlockState getStateForPlacement(BlockItemUseContext context, BlockState blockState);

    /**
     * {@link net.minecraft.block.Block#getShape(BlockState, IBlockReader, BlockPos, ISelectionContext)}
     */
    VoxelShape getShape(VoxelShape shape, BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context);

    /**
     * {@link net.minecraft.block.Block#getDrops(BlockState, LootContext.Builder)}
     */
    List<ItemStack> getDrops(BlockState state, LootContext.Builder builder);

    /**
     * {@link Block#asItem()}
     */
    Item asItem();

    /**
     * {@link net.minecraftforge.common.extensions.IForgeBlock#hasTileEntity(BlockState)}
     */
    boolean hasTileEntity(BlockState state);

    /**
     * Get the class of the tile entity this component provides. The provided state may be null, therefore
     * this should be taken into consideration. The default tile entity should be returned instead.
     *
     * @param state the state for which to get the tile entity class
     *
     * @return the tile entity class
     */
    Class<? extends TileEntity> getTileEntityClass(BlockState state);

    /**
     * {@link net.minecraftforge.common.extensions.IForgeBlock#createTileEntity(BlockState, IBlockReader)}
     */
    @Nullable
    TileEntity createTileEntity(BlockState state, IBlockReader world);

    /**
     * {@link Block#onBlockPlacedBy(World, BlockPos, BlockState, LivingEntity, ItemStack)}
     */
    void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack);

    /**
     * {@link Block#onLanded(IBlockReader, Entity)}
     */
    void onLanded(IBlockReader worldIn, Entity entityIn) throws AbstractBlockComponent.NotImplementedException;

    /**
     * {@link Block#onFallenUpon(World, BlockPos, Entity, float)}
     */
    void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance) throws AbstractBlockComponent.NotImplementedException;

    /**
     * Called when the block is being registered, use for custom Item bindings
     */
    void register(PlaceableItemsBlock block, String name);
}
