package com.company.controller.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import java.util.HashMap;

import static com.company.service.InventoryService.compareItems;
import static com.company.service.InventoryService.createItem;
import static com.company.view.InventoryView.addItemToInventoryMessage;

public class InventoryController {

    public static Inventory addItemToInventory(HashMap<Item, Integer> items, Inventory playerInventory) {
        Item newItem = createItem();
        if (playerInventory.getCapacity() > 0) {
            if (compareItems(playerInventory.getItems(), newItem)) {
                items.replace(newItem, items.get(newItem) + 1);
                addItemToInventoryMessage("1", newItem);
            } else {
                items.put(newItem, 1);
                addItemToInventoryMessage("2", newItem);
            }
            playerInventory.setItems(items);
            playerInventory.setCapacity(playerInventory.getCapacity() - 1);
        } else {
            addItemToInventoryMessage("3", newItem);
        }
        return playerInventory;
    }

}
