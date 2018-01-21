package cz.yusari.sc;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;
    @Override
    public void onEnable() {
        registerCommands();
        registerEvents();
        instance = this;
    }
    //Registrace příkazů
    public void registerCommands() {

    }
    //Registrace Eventů
    public void registerEvents() {

    }
    public static Main getInstance() {
        return instance;
    }
}
