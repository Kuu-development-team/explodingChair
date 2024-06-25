package xyz.r521m4.code.explodingchair

import org.bukkit.plugin.java.JavaPlugin
import xyz.r521m4.code.explodingchair.commands.MainCommand
import xyz.r521m4.code.explodingchair.listeners.PlayerInteractEvent

class ExplodingChair : JavaPlugin(){
    override fun onEnable() {
        // Plugin startup logic
        getCommand("explodingchair")?.setExecutor(MainCommand())
        server.pluginManager.registerEvents(PlayerInteractEvent(), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
