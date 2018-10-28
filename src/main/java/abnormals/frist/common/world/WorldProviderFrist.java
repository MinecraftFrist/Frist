package abnormals.frist.common.world;

import abnormals.frist.common.init.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderFrist extends WorldProvider {
    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.FRIST;
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new ChunkGeneratorFrist(this.world);
    }
}
