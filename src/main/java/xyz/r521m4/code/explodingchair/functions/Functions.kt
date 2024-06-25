package xyz.r521m4.code.explodingchair.functions

import org.bukkit.plugin.java.JavaPlugin
import xyz.r521m4.code.explodingchair.variable.Variable

class Functions :JavaPlugin(){
    val variable = Variable()
    fun start(pn0:String, pn1:String, cmdSender:String){
        val sender = server.getPlayer(cmdSender)
        if (server.getPlayer(pn0) == null || server.getPlayer(pn1) == null){
            sender?.sendMessage("プレイヤーが見つかりません。")
        }else{
            variable.game = true
        }
    }

    fun end(){
        variable.game = false
    }
}