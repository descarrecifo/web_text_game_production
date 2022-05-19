package com.company.controller.view;

import com.company.model.Item;
import com.company.model.Player;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.service.InventoryService.equippingObject;
import static com.company.utils.Utilities.*;

public class InventoryView {
    public static void showInventory(Player player) {
        AtomicInteger i = new AtomicInteger(1);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                       " + BRONZE_UNDERLINED + "INVENTORY" + ANSI_RESET + "                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        player.getInventory().getItems().forEach((k, v) -> {
            k.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + k.getInventoryName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + v + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + k.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            if (k.getStrength() != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + k.getStrength()+ "                                         "  + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getDefense() != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + k.getDefense() + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getSpeed() != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + k.getSpeed() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        });
//                "key: %s, value: %d%n", k, v));
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(" ");
        System.out.println("Choose an item number to equip. Press 0 to return to Game Menu");
    }

    public static void addItemToInventoryMessage(String value, Item newItem) {
        switch (value) {
            case "1" -> System.out.println("Same item: " + YELLOW_BRIGHT + newItem.getName() + ANSI_RESET);
            case "2" -> System.out.println("New item: " + YELLOW_BRIGHT + newItem.getName() + ANSI_RESET);
            case "3" -> System.out.println("Your inventory is full, you can't get more items");
        }
    }

    public static void inventoryUseItem(Player player) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            showInventory(player);
            try{
                String option = reader.nextLine();
                if (Integer.parseInt(option) == 0) break;
                else equippingObject(player, Integer.parseInt(option));
            }
            catch(NumberFormatException e) {
                System.out.println("NullPointerException thrown!");
            }


        }
    }
}

