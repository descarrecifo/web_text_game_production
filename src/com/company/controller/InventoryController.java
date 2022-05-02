package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import java.util.HashMap;

import static com.company.service.InventoryService.compareItems;
import static com.company.service.InventoryService.createItem;

public class InventoryController {

    public static void showInventory(Player player){
        player.getInventory().getItems().forEach((k, v) -> System.out.format("Name: " + k.getName() + " | Quantity: x"+v+"\n"));
//                "key: %s, value: %d%n", k, v));
  }

    public static Inventory addItemToInventory(HashMap<Item, Integer> items, Inventory playerInventory){
        Item newItem = createItem();
        if(playerInventory.getCapacity()>0) {
            if(compareItems(playerInventory.getItems(), newItem)) {
                items.replace(newItem, items.get(newItem)+1);
                System.out.println("Same item: "+newItem.getName());
            }else{
                items.put(newItem, 1);
                System.out.println("New item: "+newItem.getName());
            }
            playerInventory.setItems(items);
            playerInventory.setCapacity(playerInventory.getCapacity()-1);
        }else{
            System.out.println("Your inventory is full, you can't get more items");
        }
        //System.out.println(playerInventory);
        return playerInventory;
    }

}
