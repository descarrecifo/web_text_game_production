package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;

import com.company.service.InventoryService.*;

import java.util.HashMap;

import static com.company.service.InventoryService.createItem;

public class InventoryController {

    public static void addItemToInventory(HashMap<Item, Integer> items, Inventory playerInventory){
        if(playerInventory.getCapacity()>0){
           // compareItems(items, );
//            if(compareItems(playerInventory, createItem())){
//                items.put(createItem(), 1);
//                playerInventory.setItems(items);
//                playerInventory.setCapacity(playerInventory.getCapacity()-1);
//            }else {
//                items.put(createItem(), 1);
//                playerInventory.setItems(items);
//                playerInventory.setCapacity(playerInventory.getCapacity()-1);
//            }
        }else{
            System.out.println("Your inventory is full, you can't get more items");
        }
        System.out.println(playerInventory);
    }

}
