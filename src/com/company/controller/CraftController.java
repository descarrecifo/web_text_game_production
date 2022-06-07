package com.company.controller;

import com.company.model.Item;
import com.company.model.Player;
import com.company.model.UsableItem;
import com.company.service.CraftService;
import com.company.service.InventoryService;

import java.util.List;

public class CraftController {

    public static void crafting(Player player, int value, int craftQuantity) {
        List<Item> inventory = player.getInventory().getItems();
        Item ingredientItem = null;
        int quantity = 0;
        String ingredientName;


        switch (value) {
            case 1: {
                ingredientName = "Healing herb";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();

                CraftService.crafting(player, quantity, 5, "Health potion", "A potion with medicinal capabilities", 5, ingredientItem, ingredientName, "Potion", 0, 0, 0, craftQuantity, false, true);
                break;
            }
            case 2: {
                ingredientName = "Clay";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 10, "Golem arm", "The arm of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
                break;
            }
            case 3: {
                ingredientName = "Clay";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 10, "Golem leg", "The leg of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
                break;
            }
            case 4: {
                ingredientName = "Clay";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 10, "Golem head", "The head of a Golem", 20, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
                break;
            }
            case 5: {
                ingredientName = "Clay";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 20, "Golem body", "The body of a Golem", 40, ingredientItem, ingredientName, "Constructor", 0, 0, 0, craftQuantity, false, false);
                break;
            }
            case 6: {
                ingredientName = "Fur";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 1, "Leather", "A piece of leather", 2, ingredientItem, ingredientName, "Material", 0, 0, 0, craftQuantity, false, false);
                break;
            }
            case 7: {
                ingredientName = "Leather";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 3, "Leather helmet", "A basic helmet made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
                break;
            }
            case 8: {
                ingredientName = "Leather";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 4, "Leather gloves", "A basic pair of gloves made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
                break;
            }
            case 9: {
                ingredientName = "Leather";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 4, "Leather boots", "A basic pair of boots made of leather", 4, ingredientItem, ingredientName, "armour", 0, 2, 0, craftQuantity, true, false);
                break;
            }
            case 10: {
                ingredientName = "Leather";
                ingredientItem = InventoryService.searchItemByName(inventory,ingredientName);
                if(ingredientItem != null) quantity = ingredientItem.getQuantity();
                CraftService.crafting(player, quantity, 7, "Leather armour", "A basic armour made of leather", 6, ingredientItem, ingredientName, "armour", 0, 4, 0, craftQuantity, true, false);
                break;
            }
        }
    }
}
