package abnormals.frist.client;

import abnormals.frist.Frist;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Frist.MODID)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event){

    }
}
