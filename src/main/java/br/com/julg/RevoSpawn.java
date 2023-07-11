package br.com.julg;

import br.com.julg.commands.SpawnCommands;
import br.com.julg.listeners.PlayerJoinRemoveListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class RevoSpawn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + getClass().getSimpleName() + ChatColor.WHITE + " foi iniciado com sucesso");




        this.getCommand("spawn").setExecutor(new SpawnCommands());

        this.getServer().getPluginManager().registerEvents(new PlayerJoinRemoveListener(), this);

    }

    @Override
    public void onDisable () {
        Bukkit.getConsoleSender().sendMessage(ChatColor.YELLOW + getClass().getSimpleName() + ChatColor.WHITE + " foi desligado com sucesso");
    }
}
