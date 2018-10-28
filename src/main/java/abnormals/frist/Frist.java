package abnormals.frist;

import abnormals.frist.common.debug.command.FristTeleportCommand;
import abnormals.frist.common.init.ModBlocks;
import abnormals.frist.common.init.ModDimensions;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = Frist.MODID,
        name = Frist.MOD_NAME,
        version = Frist.VERSION
)
public class Frist {
    public static final String MODID = "frist";
    public static final String MOD_NAME = "Frist";
    public static final String VERSION = "0.0.1";

    public static final CreativeTabs FRIST_TAB = new CreativeTabs(MODID){
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.BLUE_FRISTUM);
        }
    };

    @Mod.Instance(MODID)
    public static Frist INSTANCE;

    @SidedProxy(clientSide = "abnormals.frist.client.ClientProxy",serverSide = "abnormals.frist.common.server.ServerProxy")
    public static IProxy PROXY;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        ModDimensions.registerDimensions();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent event){
        event.registerServerCommand(new FristTeleportCommand());
    }
}
