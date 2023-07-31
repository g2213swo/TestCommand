package me.g2213swo.testcommand.commands;


import me.g2213swo.testcommand.api.commands.AbstractMainCommand;

public class MainCommand extends AbstractMainCommand {

    public MainCommand() {
        regSubCommand(ReloadCommand.INSTANCE);
        regSubCommand(TestCommand1.INSTANCE);
    }
}