package me.g2213swo.testcommand.commands;


import me.g2213swo.testcommand.TestCommand;
import me.g2213swo.testcommand.api.commands.AbstractSubCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public final class ReloadCommand extends AbstractSubCommand {

    public static final ReloadCommand INSTANCE = new ReloadCommand();

    private ReloadCommand() {
        super("reload");
    }

    @Override
    public boolean onCommand(CommandSender sender, List<String> args) {
        TestCommand.INSTANCE.reload();
        sender.sendMessage("reload awa");
        return true;
    }
}