package tw.momocraft.renownplus.handlers;

import tw.momocraft.renownplus.Commands;
import tw.momocraft.renownplus.RenownPlus;
import tw.momocraft.renownplus.utils.TabComplete;


public class RegisterHandler {

    public static void registerEvents() {
        RenownPlus.getInstance().getCommand("RenownPlus").setExecutor(new Commands());
        RenownPlus.getInstance().getCommand("RenownPlus").setTabCompleter(new TabComplete());
    }
}
