package abnormals.frist.client;

import abnormals.frist.Frist;
import abnormals.frist.common.init.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Frist.MODID)
public class ClientEventHandler {
    @SubscribeEvent
    public static void registerItemModels(ModelRegistryEvent event){
        registerBasicItemModels(ItemBlock.getItemFromBlock(ModBlocks.BLUE_FRISTUM));
    }
    static void registerBasicItemModels(Item item){
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(item.getRegistryName(),"inventory"));
    }
}
