package xyz.r521m4.code.explodingchair.listeners

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerInteractEvent
import xyz.r521m4.code.explodingchair.variable.Variable

class PlayerInteractEvent : Listener {
    private val variable = Variable()
    @EventHandler
    fun onPlayerInteractEvent(event: PlayerInteractEvent){
        if (variable.game){

        }
    }
}