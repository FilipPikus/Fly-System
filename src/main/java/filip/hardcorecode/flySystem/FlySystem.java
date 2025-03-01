package filip.hardcorecode.flySystem;

import org.bukkit.plugin.java.JavaPlugin;

import static filip.hardcorecode.flySystem.flycommand.FlyMessagemeon;

public final class FlySystem extends JavaPlugin {
    public static FlySystem instance;
    @Override
    public void onEnable() {
        instance = this;
        getCommand("fly").setExecutor(new flycommand());
        Config config = ConfigUtil.getConfig("config");
        config.setDefault("FlyMessageOff",flycommand.FlyMessageoff);
        flycommand.FlyMessageoff = config.getString("FlyMessageOff");
        config.setDefault("FlyMessageOn",FlyMessagemeon);
        FlyMessagemeon = config.getString("FlyMessageOn");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
