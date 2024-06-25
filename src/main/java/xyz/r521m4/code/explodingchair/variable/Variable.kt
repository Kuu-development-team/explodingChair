package xyz.r521m4.code.explodingchair.variable

import org.bukkit.Color
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.Player


class Variable :JavaPlugin(){
    var senko:String = "1p"
    var senko_M:Material = Material.GRAVEL
    var koko:String = "2p"
    var koko_M:Material = Material.GRAVEL
    var game:Boolean = false
    var selectPointsChair_s:Boolean = false
    var selectPointsChair_k:Boolean = false
    var switchPlayer:Boolean = false
    val score:MutableMap<Player,Int> = mutableMapOf()
    val blockColorPair:MutableMap<Material, Int> = mutableMapOf(
        Material.ORANGE_CONCRETE to 1,
        Material.YELLOW_CONCRETE to 2,
        Material.LIME_CONCRETE to 3,
        Material.GREEN_CONCRETE to 4,
        Material.LIME_TERRACOTTA to 5,
        Material.CYAN_CONCRETE to 6,
        Material.LIGHT_BLUE_CONCRETE to 7,
        Material.BLUE_CONCRETE to 8,
        Material.PURPLE_CONCRETE to 9,
        Material.MAGENTA_CONCRETE to 10,
        Material.PINK_CONCRETE to 11,
        Material.RED_CONCRETE to 12
    )
    val chair_Color:MutableMap<Color,Location> = mutableMapOf(
        Color.fromRGB(255,128,0) to Location(server.getWorld("world"),29.5,-59.0,177.5),
        Color.fromRGB(255,255,0) to Location(server.getWorld("world"),24.5,-59.0,172.5),
        Color.fromRGB(128,255,0) to Location(server.getWorld("world"),23.5,-59.0,166.5),
        Color.fromRGB(0,255,0) to Location(server.getWorld("world"),24.5,-59.0,160.5),
        Color.fromRGB(0,255,128) to Location(server.getWorld("world"),29.5,-59.0,155.5),
        Color.fromRGB(0,255,255) to Location(server.getWorld("world"),35.5,-59.0,154.5),
        Color.fromRGB(0,128,255) to Location(server.getWorld("world"),41.5,-59.0,155.5),
        Color.fromRGB(0,0,255) to Location(server.getWorld("world"),46.5,-59.0,160.5),
        Color.fromRGB(128,0,255) to Location(server.getWorld("world"),47.5,-59.0,166.5),
        Color.fromRGB(255,0,255) to Location(server.getWorld("world"),46.5,-59.0,172.5),
        Color.fromRGB(255,0,128) to Location(server.getWorld("world"),41.5,-59.0,177.5),
        Color.fromRGB(255,0,0) to Location(server.getWorld("world"),34.5,-59.0,178.5)
    )
    val ue_sita:MutableMap<String, Location> = mutableMapOf(
        "ue" to Location(server.getWorld("world"), 35.5, -49.5, 166.5),
        "shita" to Location(server.getWorld("world"), 35.5, -59.5, 166.5)
    )
    val removeChair:MutableList<Int> = mutableListOf()
}