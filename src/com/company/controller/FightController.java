package com.company.controller;

import com.company.model.Character;
import com.company.model.Player;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;
import static com.company.view.IOView.optionsMainMenu;

public class FightController {

    public static Player fighting(Player player) {
            int level = enemyLevel(player);
            player.setLevel(player.getLevel() + 1);
            fightResult(level, player);
            if (level > player.getLevel()) optionsMainMenu(createPlayer());
            else {
                System.out.println("You have leveled up! Your level is now "+player.getLevel());
                player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
            }
            return player;
    }

    public static void fightResult(int level, Character player) {

        System.out.println(level > player.getLevel() ? "The enemy is stronger than you. You lose!"
                : "You are stronger than your enemy. You win!");
    }
}


