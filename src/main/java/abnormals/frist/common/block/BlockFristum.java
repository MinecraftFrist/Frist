package abnormals.frist.common.block;

import abnormals.frist.Frist;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import javax.annotation.Nullable;

public class BlockFristum extends Block {
    public BlockFristum() {
        super(Material.PACKED_ICE);
        setCreativeTab(Frist.FRIST_TAB);
        slipperiness=.98f;
        setSoundType(SoundType.GLASS);
    }


}
