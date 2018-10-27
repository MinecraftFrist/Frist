package abnormals.frist.common.world;

import abnormals.frist.common.init.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;

public class WorldProviderFrist extends WorldProvider {
    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.FRIST;
    }
}
