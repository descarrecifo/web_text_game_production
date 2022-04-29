package com.company.service;

import com.company.model.Item;

import java.util.HashMap;
import java.util.Random;

public class InventoryService {

    public static Item createItem(){
        int value = new Random().nextInt((3-1)+1);

        Item reward;

        switch (value){
            case 1 -> reward = new Item("Tunic", "cloth", "A simple tunic", 2);
            case 2 -> reward = new Item("Wooden stick", "weapon", "A simple stick made of wood", 1);
            case 3 -> reward = new Item("Sword", "weapon", "A simple sword", 7);
            default -> reward = new Item("Healing herb", "herb", "This herb has medicinal capabilities ", 1);
        }

        return reward;
    }

    public int compareItems(HashMap<Item, Integer> items,Item newItemToAdd){
        return items.get(items.keySet()).compareTo(items.get(newItemToAdd));
    }
}
