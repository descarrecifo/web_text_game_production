package com.company.service;

import com.company.model.Item;
import com.company.model.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static com.company.controller.InventoryController.removeItemFromInventory;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;

public class InventoryService {

    public static Item createItem() {
        int value = new Random().nextInt((8 - 1) + 1);

        var reward = new Item();

        HashMap<String, Integer> itemProperties = new HashMap<>();

        switch (value) {
            case 1 -> {
                itemProperties.put("attack", 0);
                itemProperties.put("defense", 1);
                itemProperties.put("speed", 0);
                reward = new Item("Tunic", "Tunic         ", "cloth", "A simple tunic                       ", 2, itemProperties);
            }
            case 2 -> {
                itemProperties.put("attack", 1);
                itemProperties.put("defense", 0);
                itemProperties.put("speed", 0);
                reward = new Item("Wooden stick", "Wooden stick  ", "weapon", "A simple stick made of wood          ", 1, itemProperties);
            }
            case 3 -> {
                itemProperties.put("attack", 4);
                itemProperties.put("defense", 0);
                itemProperties.put("speed", 0);
                reward = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7, itemProperties);
            }
            case 4 -> {
                itemProperties.put("attack", 2);
                itemProperties.put("defense", 0);
                itemProperties.put("speed", 0);
                reward = new Item("Bow", "Bow           ", "weapon", "A simple bow                         ", 4, itemProperties);
            }
            case 5 -> {
                itemProperties.put("attack", 0);
                itemProperties.put("defense", 7);
                itemProperties.put("speed", -2);
                reward = new Item("Great armour", "Great armour  ", "armour", "A heavy armour with a good defense   ", 15, itemProperties);
            }
            case 6 -> {
                itemProperties.put("attack", 0);
                itemProperties.put("defense", 2);
                itemProperties.put("speed", 0);
                reward = new Item("Helmet", "Helmet        ", "armour", "A basic iron helmet                  ", 5, itemProperties);
            }
            case 7 -> {
                itemProperties.put("attack" , 2);
                itemProperties.put("defense" , 0);
                itemProperties.put("speed" , 0);
                reward = new Item("Dagger", "Dagger        ", "weapon", "A simple dagger                      ", 3 , itemProperties);
            }
            default -> reward = new Item("Healing herb", "Healing herb  ", "herb", "This herb has medicinal capabilities ", 1, basicItemPropertiesHashmap());
        }
        return reward;
    }

    public static HashMap<String, Integer> basicItemPropertiesHashmap(){
        HashMap<String, Integer> itemProperties = new HashMap<>();

        itemProperties.put("attack", 0);
        itemProperties.put("defense", 0);
        itemProperties.put("speed", 0);

        return itemProperties;
    }

    public static boolean compareItems(HashMap<Item, Integer> items, Item newItemToAdd) {
        return items.containsKey(newItemToAdd);
    }

    public static void equippingObject(Player player, int option) {
        for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())){
            if (item.getIndex() == option){
                System.out.println("The chosen object is: " + YELLOW_BRIGHT + item.getName() + ANSI_RESET);
                removeItemFromInventory(player.getInventory(), item);
            }
        }
    }
}








