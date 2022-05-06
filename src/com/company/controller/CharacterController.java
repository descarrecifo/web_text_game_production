package com.company.controller;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.NPC;
import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.HashMap;


import java.util.Random;

import static com.company.service.InventoryService.createItem;


import static com.company.view.IOView.OptionsMenuNewGame;

import static com.company.view.IOView.optionsMainMenu;
import static com.company.view.Menu.menuNewGameView;

public class

CharacterController {

    public static void createPlayer(String name , String charclass) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);

        switch (charclass){
            case "Guerrero" -> {Player player = new Player("Player", 1, playerInventory, 100, 10, 15, 10, 15);
                Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }

            case "Mago" ->  {Player player = new Player("Player", 1, playerInventory, 100, 10, 15, 10, 15);
                Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }

            case "Cazador" ->  {Player player = new Player("Player", 1, playerInventory, 100, 10, 15, 10, 15);
                Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }
        }


    }


    public static NPC createEnemyPlaceholder(){
        NPC enemy;

        int value = new Random().nextInt((4-1)+1);

        switch (value){
            case 1 -> enemy = new NPC("Goblin", 5, createItem(), 20, 20, 5, 25, 25);
            case 2 -> enemy = new NPC("Wolf", 5, createItem(), 10, 10, 15, 35, 5);
            case 3 -> enemy = new NPC("Burglar", 5, createItem(), 25, 15, 15, 15, 15);
            default -> enemy = new NPC("Soldier", 5, createItem(), 50, 25, 15, 5, 10);
        }

        return enemy;
    }

}
