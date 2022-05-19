package com.company.controller;

import com.company.model.Item;
import com.company.model.Player;

import java.util.ArrayList;
import java.util.HashMap;

import static com.company.service.CraftService.itemCrafted;

public class CraftController {

    public static void crafting(Player player, int value, int craftQuantity) {
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
                itemCrafted(player, quantity, 5, "Health potion", "A potion with medicinal capabilities", 5, ingredientItem, ingredientName, "Potion", 0, 0, 0, craftQuantity, false, true);
            }
            case 2 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 10, "Golem arm", "The arm of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
            }
            case 3 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 10, "Golem leg", "The leg of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
            }
            case 4 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem) * craftQuantity;
                    }
                }
                itemCrafted(player, quantity, 10, "Golem head", "The head of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
            }
            case 5 -> {
                ingredientName = "Clay";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Clay")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 20, "Golem body", "The body of a Golem", 40, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
            }
            case 6 -> {
                ingredientName = "Fur";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Fur")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 1, "Leather", "A piece of leather", 2, ingredientItem, ingredientName, "Material",0, 0, 0, craftQuantity, false, false);
            }
            case 7 -> {
                ingredientName = "Leather";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Leather")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 3, "Leather helmet", "A basic helmet made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
            }
            case 8 -> {
                ingredientName = "Leather";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Leather")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 4, "Leather gloves", "A basic pair of gloves made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
            }
            case 9 -> {
                ingredientName = "Leather";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Leather")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 4, "Leather boots", "A basic pair of boots made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
            }
            case 10 -> {
                ingredientName = "Leather";
                for (Item item : new ArrayList<>(player.getInventory().getItems().keySet())) {
                    if (item.getName().equals("Leather")) {
                        ingredientItem = item;
                        quantity = inventory.get(ingredientItem);
                    }
                }
                itemCrafted(player, quantity, 7, "Leather armour", "A basic armour made of leather", 6, ingredientItem, ingredientName, "armour", 0, 4, 0, craftQuantity, true, false);
            }
        }
    }
}
