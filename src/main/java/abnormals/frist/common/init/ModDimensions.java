package abnormals.frist.common.init;

import abnormals.frist.common.world.WorldProviderFrist;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {
    public static final DimensionType FRIST = DimensionType.register("frist","_frist",-112, WorldProviderFrist.class,false);

    public static void registerDimensions(){
        DimensionManager.registerDimension(FRIST.getId(),FRIST);
    }
}
