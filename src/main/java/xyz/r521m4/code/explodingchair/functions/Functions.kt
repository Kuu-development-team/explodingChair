package xyz.r521m4.code.explodingchair.functions

import org.bukkit.Color
import org.bukkit.GameMode
import org.bukkit.Location
import org.bukkit.Material
import org.bukkit.entity.ArmorStand
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.LeatherArmorMeta
import org.bukkit.plugin.java.JavaPlugin
import xyz.r521m4.code.explodingchair.variable.Variable

class Functions :JavaPlugin(){

    private val variable = Variable()


    fun start(pn0:String, pn1:String, cmdSender:String){
        val sender = server.getPlayer(cmdSender)
        if (server.getPlayer(pn0) == null || server.getPlayer(pn1) == null){
            sender?.sendMessage("プレイヤーが見つかりません。")
        }else{
            for (i in server.onlinePlayers){
                i.gameMode = GameMode.SURVIVAL
                if (i.name == pn0){
                    variable.senko = pn0
                    server.getPlayer(variable.senko)!!.teleport(variable.ue_sita["shita"]!!)

                }else if (i.name == pn1){
                    variable.koko = pn1
                    server.getPlayer(variable.koko)!!.teleport(variable.ue_sita["ue"]!!)

                } else{
                    i.gameMode = GameMode.SPECTATOR
                }
            }
            spawnArmorStand()
            variable.game = true
        }
    }

    fun end(){
        variable.game = false
    }

    private fun spawnArmorStand(){
        var round = 1
        for (i in variable.chair_Color){
            if (variable.removeChair.contains(round)){

            }else{
                val armorstand = server.getWorld("world")?.spawn(i.value, ArmorStand::class.java)
                armorstand?.isCustomNameVisible = true
                armorstand?.customName = round.toString()

                val leatherHelmet = ItemStack(Material.LEATHER_HELMET)
                val leatherChestplate = ItemStack(Material.LEATHER_CHESTPLATE)
                val leatherLeggings = ItemStack(Material.LEATHER_LEGGINGS)
                val leatherBoots = ItemStack(Material.LEATHER_BOOTS)

                setColor(leatherHelmet, i.key)
                setColor(leatherChestplate, i.key)
                setColor(leatherLeggings, i.key)
                setColor(leatherBoots, i.key)

                armorstand?.equipment?.helmet = leatherHelmet
                armorstand?.equipment?.chestplate = leatherChestplate
                armorstand?.equipment?.leggings = leatherLeggings
                armorstand?.equipment?.boots = leatherBoots
            }

            round++
        }
    }

    private fun setColor(item: ItemStack, color: Color) {
        val meta = item.itemMeta as LeatherArmorMeta
        meta.setColor(color)
        item.itemMeta = meta
    }

    private fun changePlayer(){
        if (variable.switchPlayer){
            server.getPlayer(variable.senko)!!.teleport(variable.ue_sita["ue"]!!)
            server.getPlayer(variable.koko)!!.teleport(variable.ue_sita["shita"]!!)

            variable.switchPlayer = false
        }else if (!variable.switchPlayer){
            server.getPlayer(variable.koko)!!.teleport(variable.ue_sita["ue"]!!)
            server.getPlayer(variable.senko)!!.teleport(variable.ue_sita["shita"]!!)

            variable.switchPlayer = true
        }
    }
}