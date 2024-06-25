package xyz.r521m4.code.explodingchair.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import xyz.r521m4.code.explodingchair.functions.Functions


class MainCommand : CommandExecutor, TabCompleter{
    override fun onCommand(sender: CommandSender, cmd: Command, str: String, arg: Array<out String>): Boolean {
        if (sender.isOp){
            if (cmd.name == "explodingchair"){
                when(arg[0]){
                    "start" -> {
                        Functions().start(arg[1], arg[2], sender.name)
                    }
                    "stop" -> {
                        Functions().end()
                    }
                    else -> {
                        sender.sendMessage("/ec <start|stop> <Player> <Player>")
                    }
                }
            }
        }else{
            sender.sendMessage("権限がありません！")
        }
        return true
    }

    override fun onTabComplete(sender: CommandSender, cmd: Command, str: String, arg: Array<out String>): List<String>? {
        if(cmd.name == "explodingchair" || cmd.name == "ec"){
            if (arg.size == 1) {
                val completions = listOf("start", "stop")
                return completions.filter { it.startsWith(arg[0], ignoreCase = true) }
            }
        }
        return emptyList()
    }
}