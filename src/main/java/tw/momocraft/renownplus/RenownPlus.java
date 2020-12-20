package tw.momocraft.renownplus;

import org.bukkit.plugin.java.JavaPlugin;
import tw.momocraft.coreplus.api.CorePlusAPI;
import tw.momocraft.renownplus.handlers.ConfigHandler;
import tw.momocraft.renownplus.handlers.RegisterHandler;

public class RenownPlus extends JavaPlugin {
    private static RenownPlus instance;

    @Override
    public void onEnable() {
        instance = this;
        ConfigHandler.generateData(false);
        RegisterHandler.registerEvents();
        CorePlusAPI.getLangManager().sendConsoleMsg(ConfigHandler.getPrefix(),"&fhas been Enabled.");
    }

    @Override
    public void onDisable() {
        CorePlusAPI.getLangManager().sendConsoleMsg(ConfigHandler.getPrefix(),"&fhas been Disabled.");
    }

    public static RenownPlus getInstance() {
        return instance;
    }
}