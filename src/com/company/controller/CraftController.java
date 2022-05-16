package com.company.controller;

import com.company.model.Item;
import com.company.model.Player;

import java.util.ArrayList;
import java.util.HashMap;

import static com.company.service.CraftService.itemCrafted;

public class CraftController {

    public static void crafting(Player player, int value) {
        HashMap<Item, Integer> inventory = player.getInventory().getItems();
        Item ingredientItem = null;
        int quantity = 0;
        String ingredientName;
        switch (value) {
            case 1 -> {
                ingredientName = "Healing herb";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Healing herb")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 5, "Health potion", "Health potion ", "A potion with medicinal capabilities ", 5, ingredientItem, ingredientName);
            }
            case 2 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 10, "Golem arm", "Golem arm    ", "The arm of a Golem                   ", 20, ingredientItem, ingredientName);
            }
            case 3 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 10, "Golem leg", "Golem leg    ", "The leg of a Golem                   ", 20, ingredientItem, ingredientName);
            }
            case 4 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 10, "Golem head", "Golem head   ", "The head of a Golem                  ", 20, ingredientItem, ingredientName);
            }
            case 5 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 20, "Golem body", "Golem body   ", "The body of a Golem                  ", 40, ingredientItem, ingredientName);
            }
        }
    }
}
