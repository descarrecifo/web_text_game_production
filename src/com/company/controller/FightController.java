package com.company.controller;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;

public class FightController {

    public static void fighting() {
        Character player = new Character("Player", 1);
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);
        while (true) {
            int level = enemyLevel(player);
            player.setLevel(player.getLevel() + 1);
            fightResult(level, player);
            if (level > player.getLevel()) break;
            else {
                System.out.println("You have leveled up! Your level is now "+player.getLevel());
                addItemToInventory(items, playerInventory);
            }
        }
    }

    public static void fightResult(int level, Character player) {

        System.out.println(level > player.getLevel() ? "The enemy is stronger than you. You lose!"
                : "You are stronger than your enemy. You win!");

    }
}


