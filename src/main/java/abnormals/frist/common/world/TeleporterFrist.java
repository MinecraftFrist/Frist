package abnormals.frist.common.world;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ITeleporter;

public class TeleporterFrist implements ITeleporter {
    @Override
    public void placeEntity(World world, Entity entity, float yaw) {
        entity.setLocationAndAngles(entity.posX,entity.posY,entity.posZ,entity.rotationYaw,entity.rotationPitch);
    }

}
