package me.g2213swo.testcommand.commands;

import me.g2213swo.testcommand.TestCommand;
import me.g2213swo.testcommand.api.commands.AbstractSubCommand;
import org.bukkit.command.CommandSender;

import java.util.List;

public class TestCommand1 extends AbstractSubCommand {

    public static final TestCommand1 INSTANCE = new TestCommand1();

    public TestCommand1() {
        super("testcommand1");
    }

    @Override
    public boolean onCommand(CommandSender sender, List<String> args) {
        sender.sendMessage("testcommand1");
        return true;
    }
}

