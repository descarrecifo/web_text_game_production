package com.company;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

import static com.company.controller.FightController.fightResult;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;
import static com.company.service.InventoryService.createItem;

public class Main {

    public static void main(String[] args) {



        Character player = new Character("Player", 1);
        Item testItem = new Item("Test Item", "testing", "A testing item", 1);
        HashMap<Item, Integer> items = new HashMap<Item, Integer>();
        Inventory playerInventory = new Inventory(items, 5);

        while (true){
            int level = enemyLevel(player);
            player.setLevel(player.getLevel()+1);

            fightResult(level, player);
            if(player.getLevel()>=level){
                addItemToInventory(items,playerInventory);
            }
            if(level>player.getLevel())break;
        }
    }
}
