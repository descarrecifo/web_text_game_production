package com.company.controller;

import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.CharacterController.createEnemyPlaceholder;
import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.fightResult;
import static com.company.view.IOView.optionsMainMenu;
//import static com.company.service.FightService.fightDevolving;

public class FightController {

//    public static Player fighting(Player player) {
//        NPC enemy = createEnemyPlaceholder();
//        System.out.println("Your enemy is a "+enemy.getName());
//        int playerLevel = player.getLevel();
//        fightDevolving(enemy, player, playerLevel);
//        return player;
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
}


