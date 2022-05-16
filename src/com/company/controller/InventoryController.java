package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

import static com.company.service.InventoryService.compareItems;
import static com.company.view.InventoryView.addItemToInventoryMessage;

public class InventoryController {

    public static Inventory addItemToInventory(HashMap<Item, Integer> items, Inventory playerInventory, Item newItem) {
        if (playerInventory.getCapacity() > 0) {
            if (compareItems(playerInventory.getItems(), newItem)) {
                items.replace(newItem, items.get(newItem) + 1);
                if(playerInventory.getCapacity() == 10) addItemToInventoryMessage("1", newItem);
            } else {
                items.put(newItem, 1);
                if(playerInventory.getCapacity() == 10) addItemToInventoryMessage("2", newItem);
            }
            playerInventory.setItems(items);
            playerInventory.setCapacity(playerInventory.getCapacity() - 1);
        } else {
            addItemToInventoryMessage("3", newItem);
        }
        return playerInventory;
    }

    public static Inventory removeItemFromInventory(Inventory inventory, Item itemToRemove){
        inventory.getItems().replace(itemToRemove, inventory.getItems().get(itemToRemove) - 1);
        inventory.setCapacity(inventory.getCapacity() + 1);
        if (inventory.getItems().get(itemToRemove) < 1) {
            inventory.getItems().remove(itemToRemove);
        }
        return inventory;
    }

}
