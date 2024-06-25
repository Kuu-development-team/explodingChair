package xyz.r521m4.code.explodingchair.listeners

import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.Action
import org.bukkit.event.player.PlayerInteractEvent
import xyz.r521m4.code.explodingchair.variable.Variable

class PlayerInteractEvent : Listener, JavaPlugin() {
    private val variable = Variable()
    @EventHandler
    fun onPlayerInteractEvent(event: PlayerInteractEvent){
        if (variable.game){
            if (!variable.switchPlayer){//先行のターン
                if (event.player == server.getPlayer(variable.senko) && event.clickedBlock?.type == Material.OAK_PRESSURE_PLATE){
                    if (event.action == Action.PHYSICAL){
                        variable.senko_M = server.getWorld("world")?.getBlockAt(Location(server.getWorld("world"), event.player.location.x, event.player.location.y - 1, event.player.location.z))?.type!!
                        variable.selectPointsChair_s = true
                        event.player.teleport(variable.ue_sita["ue"]!!)//先行を上にテレポート
                        server.getPlayer(variable.koko)!!.teleport(variable.ue_sita["shita"]!!)//後攻を下にテレポート
                    }
                }
            }else{//後攻のターン

            }

        }
    }
}