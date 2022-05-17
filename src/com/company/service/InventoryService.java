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
                reward = new Item("Tunic", "Tunic         ", "cloth", "A simple tunic                       ", 2, 0, 1, 0);
            }
            case 2 -> {
                reward = new Item("Wooden stick", "Wooden stick  ", "weapon", "A simple stick made of wood          ", 1, 1, 0, 0);
            }
            case 3 -> {
                reward = new Item("Sword", "Sword         ", "weapon", "A simple sword                       ", 7, 4, 0, 0);
            }
            case 4 -> {
                reward = new Item("Bow", "Bow           ", "weapon", "A simple bow                         ", 4, 2, 0, 0);
            }
            case 5 -> {
                reward = new Item("Great armour", "Great armour  ", "armour", "A heavy armour with a good defense   ", 15, 0, 7, -2);
            }
            case 6 -> {
                reward = new Item("Helmet", "Helmet        ", "armour", "A basic iron helmet                  ", 5, 0, 2, 0);
            }
            case 7 -> {
                reward = new Item("Dagger", "Dagger        ", "weapon", "A simple dagger                      ", 3 , 2, 0, 0);
            }
            default -> reward = new Item("Healing herb", "Healing herb  ", "herb", "This herb has medicinal capabilities ", 1, 0, 0, 0);
        }
        return reward;
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








