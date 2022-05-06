package com.company.view;

import com.company.model.Item;
import com.company.model.Player;

public class InventoryView {
    public static void showInventory(Player player) {
        player.getInventory().getItems().forEach((k, v) -> System.out.format("Name: " + k.getName() + " | Quantity: x" + v + "\nDescription: " + k.getDescription() + "\n"));
//                "key: %s, value: %d%n", k, v));
    }

    public static void addItemToInventoryMessage(String value, Item newItem){
        switch (value) {
            case "1" -> System.out.println("Same item: " + newItem.getName());
            case "2" -> System.out.println("New item: " + newItem.getName());
            case "3" -> System.out.println("Your inventory is full, you can't get more items");
        }
    }
}
