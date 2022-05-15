package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.HashMap;
import java.util.Random;

import static com.company.service.InventoryService.createItem;

import static com.company.view.CharacterView.presentationText;
import static com.company.view.IOView.gameLoopView;

public class

CharacterController {

    public static void createPlayer(String name , String charClass) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);

        HashMap<String,Integer> itemHabilities = new HashMap<>();

        switch (charClass){
            case "Cleric" ->  {Player player = new Player(name, 1, playerInventory, 100, 10, 15, 20, 20, "Cleric", 5);
                itemHabilities.put("attack" , 0);
                itemHabilities.put("defense" , 1);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Tunic","Tunic         ", "cloth", "A simple tunic                       ", 2 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Mage" ->  {Player player = new Player(name, 1, playerInventory, 100, 10, 15, 25, 15, "Mage", 5);
                itemHabilities.put("attack" , 0);
                itemHabilities.put("defense" , 1);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Tunic","Tunic         ", "cloth", "A simple tunic                       ", 2 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Monk" ->  {Player player = new Player(name, 1, playerInventory, 90, 15, 10, 25, 25, "Monk", 5);
                itemHabilities.put("attack", 1);
                itemHabilities.put("defense", 0);
                itemHabilities.put("speed", 0);
                Item newItem = new Item("Wooden stick", "Wooden stick  ", "weapon", "A simple stick made of wood          ", 1, itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Paladin" ->  {Player player = new Player(name, 1, playerInventory, 120, 15, 15, 15, 10, "Paladin", 5);
                itemHabilities.put("attack" , 4);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Ranger" ->  {Player player = new Player(name, 1, playerInventory, 100, 10, 10, 20, 25, "Hunter", 5);
                itemHabilities.put("attack" , 2);
                itemHabilities.put("defense" ,0);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Bow", "Bow           ", "weapon", "A simple bow                         ", 4 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Warrior" -> {Player player = new Player(name, 1, playerInventory, 100, 25, 15, 10, 15, "Warrior", 5);
                itemHabilities.put("attack" , 4);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }
        }
    }

    public static NPC createEnemyPlaceholder(){
        NPC enemy;

        int value = new Random().nextInt((9-1)+1);

        HashMap<String, Integer> itemHabilities = new HashMap<>();

        itemHabilities.put("attack", 0);
        itemHabilities.put("defense", 0);
        itemHabilities.put("speed", 0);
        Item fur = new Item("Fur", "Fur           ", "herb", "The fur of an wild animal            ", 1, itemHabilities);

        switch (value){
            case 1 -> enemy = new NPC("Goblin", 5, createItem(), 20, 20, 5, 25, 25, null, 5);
            case 2 -> enemy = new NPC("Wolf", 5, fur, 10, 10, 15, 35, 5, null,0);
            case 3 -> enemy = new NPC("Burglar", 5, createItem(), 25, 15, 15, 15, 15, null, 20);
            case 4 -> enemy = new NPC("Witch", 5, createItem(), 20, 10, 15, 25, 15, null, 5);
            case 5 -> enemy = new NPC("Ratman", 5, fur, 25, 20, 10, 20, 10, null, 0);
            case 6 -> enemy = new NPC("Wild boar", 5, fur, 10, 10, 10, 25, 10, null, 0);
            case 7 -> enemy = new NPC("Vampire", 5, createItem(), 40, 20, 10, 15, 15, null, 10);
            case 8 -> enemy = new NPC("Wendigo", 5, fur, 25, 25, 5, 25, 5, null, 0);
            default -> enemy = new NPC("Soldier", 5, createItem(), 50, 25, 15, 5, 10, null, 15);
        }
        return enemy;
    }

}



