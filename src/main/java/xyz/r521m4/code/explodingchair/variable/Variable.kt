package xyz.r521m4.code.explodingchair.variable

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Location
import org.bukkit.entity.Player


class Variable :JavaPlugin(){
    var game:Boolean = false
    val score:MutableMap<Player,Int> = mutableMapOf()
    val chair:MutableList<Location> = mutableListOf(
        Location(server.getWorld("world"),29.5,-59.0,177.5),
        Location(server.getWorld("world"),24.5,-59.0,172.5),
        Location(server.getWorld("world"),23.5,-59.0,166.5),
        Location(server.getWorld("world"),24.5,-59.0,160.5),
        Location(server.getWorld("world"),29.5,-59.0,155.5),
        Location(server.getWorld("world"),35.5,-59.0,154.5),
        Location(server.getWorld("world"),41.5,-59.0,155.5),
        Location(server.getWorld("world"),46.5,-59.0,160.5),
        Location(server.getWorld("world"),47.5,-59.0,166.5),
        Location(server.getWorld("world"),46.5,-59.0,172.5),
        Location(server.getWorld("world"),41.5,-59.0,177.5),
        Location(server.getWorld("world"),34.5,-59.0,178.5)
    )
}