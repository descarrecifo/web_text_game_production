package com.company.controller;

import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;

import java.util.HashMap;

import static com.company.service.InventoryService.compareItems;
import static com.company.service.InventoryService.createItem;
import static com.company.view.ShopView.buying;

public class ShopController {

    public static void shoppingSystem(Player player, int value) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory shopInventory = new Inventory(items, 100);
        for(int i = 0; i<100; i++){
            Item newItem = createItem();
            if (compareItems(shopInventory.getItems(), newItem)) {
                items.replace(newItem, items.get(newItem) + 1);
            } else {
                items.put(newItem, 1);
            }
            shopInventory.setItems(items);
            shopInventory.setCapacity(shopInventory.getCapacity() - 1);
        }
        int price;
        if (value == 1) {
            buying(shopInventory);
        } else {
            System.out.println(shopInventory);
        }
    }
}
