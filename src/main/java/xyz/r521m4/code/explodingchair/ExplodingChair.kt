package xyz.r521m4.code.explodingchair

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class ExplodingChair : JavaPlugin() , Listener{
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(this, this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
