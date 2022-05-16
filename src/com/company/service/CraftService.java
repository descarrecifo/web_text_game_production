package com.company.service;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.controller.InventoryController.removeItemFromInventory;
import static com.company.service.InventoryService.basicItemPropertiesHashmap;
import static com.company.view.CraftView.craftingMessages;

public class CraftService {

    public static void itemCrafted(Player player, int inventoryQuantity, int necessaryQuantity, String craftedItemName, String craftedItemInventoryName, String craftedItemDescription, int craftedItemPrice, Item ingredientItem, String ingredientName){
        if(inventoryQuantity>=necessaryQuantity){
            Item craftedItem = new Item(craftedItemName, craftedItemInventoryName, "weapon", craftedItemDescription, craftedItemPrice , basicItemPropertiesHashmap());
            for(int i=0; i<necessaryQuantity; i++){
                removeItemFromInventory(player.getInventory(), ingredientItem);
            }
            addItemToInventory(player.getInventory().getItems(), player.getInventory(), craftedItem);
        }else craftingMessages(1, craftedItemName, inventoryQuantity, necessaryQuantity, ingredientName);

    }
}
