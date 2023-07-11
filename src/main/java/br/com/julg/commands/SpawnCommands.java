package br.com.julg.commands;


import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (!(sender instanceof Player)) return false;
        Player player = (Player) sender;
        command.getName().equalsIgnoreCase("spawn");

        double X = 0.5;
        double Y = 100;
        double Z =  0.5;

        World world = player.getWorld();

        Location teleportLocation = new Location(world, X, Y, Z);

                if(args.length == 0 && world.getName().equalsIgnoreCase("practice")){

            player.teleport(teleportLocation);
        }
                if(args.length == 0 && world.getName().equalsIgnoreCase("arena")){

            player.teleport(teleportLocation);
        }
                if(args.length == 0 && world.getName().equalsIgnoreCase("arenalegacy")){

            player.teleport(teleportLocation);
        }

        else{return false;}



        return false;

    }


}
