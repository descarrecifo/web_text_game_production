package com.company.controller;

import com.company.model.Character;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.CharacterController.createEnemyPlaceholder;
import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;
import static com.company.view.IOView.optionsMainMenu;

public class FightController {

//    public static Player fighting(Player player) {
//            int level = enemyLevel(player);
//            player.setLevel(player.getLevel() + 1);
//            fightResult(level, player);
//            if (level > player.getLevel()) optionsMainMenu(createPlayer());
//            else {
//                System.out.println("You have leveled up! Your level is now "+player.getLevel());
//                player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
//            }
//            return player;
//    }

    public static Player fighting(Player player) {
        NPC enemy = createEnemyPlaceholder();
        System.out.println("Your enemy is a "+enemy.getName());
        int playerLevel = player.getLevel();
        int enemyHealthPoints = 30;
        int enemyStrength = enemy.getStrength();
        int enemyDefense = (new Random().nextInt(player.getDefense() - (player.getDefense()-5)))+1;
        //int enemySpeed = (new Random().nextInt((10 - 5) + 1))+1;


        fightResult(enemy, player, playerLevel);
        return player;
    }

    public static void fightResult(NPC enemy, Player player, int playerLevel) {

        int enemyDamage = (enemy.getStrength() * (enemy.getStrength() / player.getDefense()))+5;

        int playerDamage = (player.getStrength() * (player.getStrength() / enemy.getDefense()))+5;
        player.setHealthPoints(player.getHealthPoints() - enemyDamage);
        System.out.println("The enemy makes you " + enemyDamage + " points of damage!");
        System.out.println(player.getHealthPoints());
        enemy.setHealthPoints(enemy.getHealthPoints() - playerDamage);
        System.out.println("You makes " + playerDamage + " points of damage to your enemy!");
        System.out.println(enemy.getHealthPoints());

        if (player.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
        else if (enemy.getHealthPoints() <= 0) {
            player.setLevel(playerLevel++);
            System.out.println("You have leveled up! Your level is now " + player.getLevel());
            player.setHealthPoints(player.getHealthPoints() + 50);
            player.setStrength(player.getStrength() + 5);
            player.setDefense(player.getDefense() + 5);
            System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense()+" and you have "+player.getHealthPoints()+" HP");
            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
        } else{
            System.out.println("You need to attack again");
            fightResult(enemy, player, playerLevel);
        }
    }
}


