package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.HashMap;
import java.util.Random;

import static com.company.service.InventoryService.basicItemPropertiesHashmap;
import static com.company.service.InventoryService.createItem;

import static com.company.view.CharacterView.presentationText;

public class

CharacterController {

    public static void createPlayer(String name , String charClass) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);

        HashMap<String,Integer> itemProperties = new HashMap<>();

        switch (charClass){
            case "Cleric" ->  {Player player = new Player(name, 1, playerInventory, 100, 100, 10, 15, 20, 20, "Cleric", 5);
                itemProperties.put("attack" , 0);
                itemProperties.put("defense" , 1);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Tunic","Tunic         ", "cloth", "A simple tunic                       ", 2 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Mage" ->  {Player player = new Player(name, 1, playerInventory, 100, 100, 10, 15, 25, 15, "Mage", 5);
                itemProperties.put("attack" , 0);
                itemProperties.put("defense" , 1);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Tunic","Tunic         ", "cloth", "A simple tunic                       ", 2 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Monk" ->  {Player player = new Player(name, 1, playerInventory, 90, 90, 15, 10, 25, 25, "Monk", 5);
                itemProperties.put("attack", 1);
                itemProperties.put("defense", 0);
                itemProperties.put("speed", 0);
                Item newItem = new Item("Wooden stick", "Wooden stick  ", "weapon", "A simple stick made of wood          ", 1, itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Paladin" ->  {Player player = new Player(name, 1, playerInventory, 120, 120, 15, 15, 15, 10, "Paladin", 5);
                itemProperties.put("attack" , 4);
                itemProperties.put("defense" , 0);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Ranger" ->  {Player player = new Player(name, 1, playerInventory, 100, 100, 10, 10, 20, 25, "Hunter", 5);
                itemProperties.put("attack" , 2);
                itemProperties.put("defense" ,0);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Bow", "Bow           ", "weapon", "A simple bow                         ", 4 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Rogue" -> {Player player = new Player(name, 1, playerInventory, 90, 90, 15, 15, 20, 25, "Rogue", 5);
                itemProperties.put("attack" , 2);
                itemProperties.put("defense" , 0);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Dagger", "Dagger        ", "weapon", "A simple dagger                      ", 3 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }

            case "Warrior" -> {Player player = new Player(name, 1, playerInventory, 100, 100, 25, 15, 10, 15, "Warrior", 5);
                itemProperties.put("attack" , 4);
                itemProperties.put("defense" , 0);
                itemProperties.put("speed" , 0);
                Item newItem = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7 , itemProperties);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                playerInventory.setCapacity(playerInventory.getCapacity() - 1);
                presentationText(player);
            }
        }
    }

    public static NPC createEnemyPlaceholder(){
        NPC enemy;

        int value = new Random().nextInt((10-1)+1);

        Item fur = new Item("Fur", "Fur           ", "material", "The fur of an wild animal            ", 1, basicItemPropertiesHashmap());
        Item clay = new Item("Clay", "Clay          ", "material", "A handful of clay                    ", 1, basicItemPropertiesHashmap());

        switch (value){
            case 1 -> enemy = new NPC("Goblin", 5, createItem(), 20, 20, 20, 5, 25, 25, null, 5);
            case 2 -> enemy = new NPC("Wolf", 5, fur, 10, 10, 10, 15, 35, 5, null,0);
            case 3 -> enemy = new NPC("Burglar", 5, createItem(), 25, 25, 15, 15, 15, 15, null, 20);
            case 4 -> enemy = new NPC("Witch", 5, createItem(), 20, 20, 10, 15, 25, 15, null, 5);
            case 5 -> enemy = new NPC("Ratman", 5, fur, 25, 25, 20, 10, 20, 10, null, 0);
            case 6 -> enemy = new NPC("Wild boar", 5, fur, 10, 10, 10, 10, 25, 10, null, 0);
            case 7 -> enemy = new NPC("Vampire", 5, createItem(), 40, 40, 20, 10, 15, 15, null, 10);
            case 8 -> enemy = new NPC("Wendigo", 5, fur, 25, 25, 25, 5, 25, 5, null, 0);
            case 9 -> enemy = new NPC("Golem", 5, clay, 45, 45, 35, 25, 10, 10, null, 0);
            default -> enemy = new NPC("Soldier", 5, createItem(), 50, 50, 25, 15, 5, 10, null, 15);
        }
        return enemy;
    }

}



