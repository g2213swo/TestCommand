package me.g2213swo.testcommand;

import me.g2213swo.testcommand.commands.MainCommand;
import org.bukkit.Bukkit;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestCommand extends JavaPlugin {

    public static TestCommand INSTANCE;

    @Override
    public void onLoad() {
        INSTANCE = this;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerCommands() {
        MainCommand mainCommand = new MainCommand();
        PluginCommand testCommand = Bukkit.getPluginCommand("testcommand");
        if (testCommand != null) {
            testCommand.setExecutor(mainCommand);
            testCommand.setTabCompleter(mainCommand);
        }
    }

    public void reload() {
        // Reload logic
    }
}
