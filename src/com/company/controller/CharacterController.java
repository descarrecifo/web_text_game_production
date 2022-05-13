package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.HashMap;
import java.util.Random;

import static com.company.service.InventoryService.createItem;

import static com.company.view.IOView.gameLoopView;

public class

CharacterController {

    public static void createPlayer(String name , String charClass) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);
        HashMap<String,Item> equipment = new HashMap<>();

        HashMap<String,Integer> itemHabilities = new HashMap<>();//tenemos el



        switch (charClass){
            case "Warrior" -> {Player player = new Player(name, 1, playerInventory, 100, 25, 15, 10, 15, "Warrior", equipment);
                itemHabilities.put("attack" , 4);
                itemHabilities.put("defense" , 0);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                gameLoopView(player);
            }

            case "Mage" ->  {Player player = new Player(name, 1, playerInventory, 100, 10, 15, 25, 15, "Mage", equipment);
                itemHabilities.put("attack" , 0);
                itemHabilities.put("defense" , 1);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Tunic","Tunic         ", "cloth", "A simple tunic                       ", 2 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                gameLoopView(player);
            }

            case "Hunter" ->  {Player player = new Player(name, 1, playerInventory, 100, 10, 10, 20, 25, "Hunter", equipment);
                itemHabilities.put("attack" , 2);
                itemHabilities.put("defense" ,0);
                itemHabilities.put("speed" , 0);
                Item newItem = new Item("Bow", "Bow           ", "weapon", "A simple bow                         ", 4 , itemHabilities);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                gameLoopView(player);
            }
        }
    }

    public static NPC createEnemyPlaceholder(){
        NPC enemy;

        int value = new Random().nextInt((4-1)+1);

        switch (value){
            case 1 -> enemy = new NPC("Goblin", 5, createItem(), 20, 20, 5, 25, 25, null);
            case 2 -> enemy = new NPC("Wolf", 5, createItem(), 10, 10, 15, 35, 5, null);
            case 3 -> enemy = new NPC("Burglar", 5, createItem(), 25, 15, 15, 15, 15, null);
            default -> enemy = new NPC("Soldier", 5, createItem(), 50, 25, 15, 5, 10, null);
        }

        return enemy;
    }

}



