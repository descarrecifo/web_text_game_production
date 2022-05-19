package com.company.service;

import com.company.model.Item;
import com.company.model.Player;

import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.controller.InventoryController.removeItemFromInventory;
import static com.company.view.CraftView.craftingMessages;

public class CraftService {

    public static void itemCrafted(Player player, int inventoryQuantity, int necessaryQuantity, String craftedItemName, String craftedItemDescription, int craftedItemPrice, Item ingredientItem, String ingredientName, String craftedItemType, int strength, int defense, int speed, int craftQuantity, boolean equippable, boolean useable){
        if(inventoryQuantity<necessaryQuantity*craftQuantity) craftingMessages(1, craftedItemName, inventoryQuantity, necessaryQuantity, ingredientName, craftQuantity);
        else{
            Item craftedItem = new Item(craftedItemName, craftedItemType, craftedItemDescription, craftedItemPrice , strength, defense, speed, equippable, useable);
            for(int i=0; i<craftQuantity; i++){
                for(int j=0; j<necessaryQuantity; j++){
                    removeItemFromInventory(player.getInventory(), ingredientItem);
                }
                addItemToInventory(player.getInventory().getItems(), player.getInventory(), craftedItem);
            }
        }

    }
}
