package com.company.service;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.controller.InventoryController.removeItemFromInventory;
import static com.company.service.InventoryService.basicItemPropertiesHashmap;

public class CraftService {

    public static void itemCrafted(Player player, int inventoryQuantity, int necessaryQuantity, String craftedItemName, String craftedItemInventoryName, String craftedItemDescription, int craftedItemPrice, Item ingredientItem){
        if(inventoryQuantity>=necessaryQuantity){
            Item craftedItem = new Item(craftedItemName, craftedItemInventoryName, "weapon", craftedItemDescription, craftedItemPrice , basicItemPropertiesHashmap());
            for(int i=0; i<necessaryQuantity; i++){
                removeItemFromInventory(player.getInventory(), ingredientItem);
            }
            addItemToInventory(player.getInventory().getItems(), player.getInventory(), craftedItem);
        }else System.out.println("You don't have enough ingredients, you need "+(necessaryQuantity-inventoryQuantity)+" more of "+ingredientItem+" to craft a "+craftedItemName);

    }
}
