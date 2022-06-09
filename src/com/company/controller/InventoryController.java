package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;

import java.util.List;

import static com.company.service.InventoryService.compareItems;
import static com.company.view.InventoryView.addItemToInventoryMessage;

public class InventoryController {

    public static Inventory addItemToInventory(List<Item> items, Inventory inventory, Item newItem) {
        if (inventory.getCapacity() == 0) addItemToInventoryMessage("3", newItem);
        else  {
            if (compareItems(inventory.getItems(), newItem)) {
                items.add(newItem);
                newItem.setQuantity(1);
                inventory.setCapacity(inventory.getCapacity()-1);
//                items.replace(newItem, items.get(newItem) + 1);
                if(inventory.getCapacity() == 10) addItemToInventoryMessage("1", newItem);
            } else {
                newItem.setQuantity(newItem.getQuantity()+1);
                inventory.setCapacity(inventory.getCapacity()-1);
                if(inventory.getCapacity() == 10) addItemToInventoryMessage("2", newItem);
            }
            inventory.setItems(items);
            inventory.setCapacity(inventory.getCapacity() - 1);
        }
        return inventory;
    }

    public static Inventory removeItemFromInventory(Inventory inventory, Item itemToRemove){
        itemToRemove.setQuantity(itemToRemove.getQuantity()-1);
        inventory.setCapacity(inventory.getCapacity() + 1);
        if (itemToRemove.getQuantity() < 1) inventory.getItems().remove(itemToRemove);
        return inventory;
    }
}
