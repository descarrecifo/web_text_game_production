package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.HashMap;
import java.util.Random;

import static com.company.service.InventoryService.createItem;

public class CharacterController {

    public static Player createPlayer() {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);
        Player player = new Player("Player", 1, playerInventory, 100, 10, 15, 10, 15);
        Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
        items.put(newItem, 1);
        player.getInventory().setItems(items);

        return player;
    }

    public static NPC createEnemyPlaceholder(){
        NPC enemy;

        int value = new Random().nextInt((4-1)+1);

        switch (value){
            case 1 -> enemy = new NPC("Goblin", 5, createItem(), 20, 20, 5, 25, 5);
            case 2 -> enemy = new NPC("Wolf", 5, createItem(), 10, 10, 15, 15, 5);
            case 3 -> enemy = new NPC("Burglar", 5, createItem(), 25, 15, 15, 15, 15);
            default -> enemy = new NPC("Soldier", 5, createItem(), 50, 25, 15, 5, 10);
        }

        return enemy;
    }
}
