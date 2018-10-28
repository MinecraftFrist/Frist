package abnormals.frist.common;


import abnormals.frist.Frist;
import abnormals.frist.common.block.BlockFristum;
import abnormals.frist.common.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Frist.MODID)
public class RegistryEventHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(
            createBasicItemBlock(ModBlocks.BLUE_FRISTUM)
        );
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(
            new BlockFristum().setRegistryName(Frist.MODID,"blue_fristum").setTranslationKey(Frist.MODID+".blue_fristum").setHardness(1.5F).setResistance(10.0F)
        );
    }

    static ItemBlock createBasicItemBlock(Block b){
        return (ItemBlock)(new ItemBlock(b).setRegistryName(b.getRegistryName()));
    }
}
