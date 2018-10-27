package abnormals.frist.common.debug.command;

import abnormals.frist.common.init.ModDimensions;
import abnormals.frist.common.world.TeleporterFrist;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class FristTeleportCommand implements ICommand {

    List<String> aliases;

    public FristTeleportCommand(){
        aliases = new ArrayList<String>();
        aliases.add("ftp");
    }
    @Override
    public String getName() {
        return "fristtp";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/fristtp";
    }

    @Override
    public List<String> getAliases() {
        return aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        sender.getCommandSenderEntity().changeDimension(ModDimensions.FRIST.getId(),new TeleporterFrist());
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, @Nullable BlockPos targetPos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand iCommand) {
        return 0;
    }
}
