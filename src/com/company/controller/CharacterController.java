package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import java.util.HashMap;

public class CharacterController {

    public static Player createPlayer() {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);
        Player player = new Player("Player", 1, playerInventory);
        Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
        items.put(newItem, 1);
        player.getInventory().setItems(items);

        return player;
    }
}
