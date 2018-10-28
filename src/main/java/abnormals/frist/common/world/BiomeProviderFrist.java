package abnormals.frist.common.world;

import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.layer.GenLayer;

public class BiomeProviderFrist extends BiomeProvider {
    @Override
    public GenLayer[] getModdedBiomeGenerators(WorldType worldType, long seed, GenLayer[] original) {
        return super.getModdedBiomeGenerators(worldType, seed, original);
    }
}
