package com.company.view;

import com.company.model.*;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.service.InventoryService.equippingOrUsingObject;
import static com.company.utils.Utilities.*;

public class InventoryView {








    public static void showInventory(Player player) {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                       " + BRONZE_UNDERLINED + ANSI_BOLD + "INVENTORY" + ANSI_RESET + "                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        showInventoryLoop(player);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println();
        System.out.println("Choose an item number to equip or use. Press 0 to return to Game Menu");
    }


    public static void showInventoryLoop(Player player){
        AtomicInteger i = new AtomicInteger(1);
        player.getInventory().getItems().forEach(     (item) -> { item.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + item.getName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + item.getQuantity() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + item.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            if (item.getClass() == EquippableItem.class){
                if(((EquippableItem) item).getStrength() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + ((EquippableItem) item).getStrength()  + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            if (item.getClass() == EquippableItem.class){
                if (((EquippableItem) item).getDefense() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + ((EquippableItem) item).getDefense() + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            if (item.getClass() == EquippableItem.class) {
                if (((EquippableItem) item).getSpeed() != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + ((EquippableItem) item).getSpeed() + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
            }
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        });
    }

    public static void addItemToInventoryMessage(String value, Item newItem) {
        switch (value) {
            case "1": {
                System.out.println("Same item: " + YELLOW_BRIGHT + newItem.getName() + ANSI_RESET);
                break;
            }
            case "2": {
                System.out.println("New item: " + YELLOW_BRIGHT + newItem.getName() + ANSI_RESET);
                break;
            }
            case "3": {
                System.out.println("Your inventory is full, you can't get more items");
                break;
            }
        }
    }

    public static void inventoryUseItem(Player player) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            showInventory(player);
            String option = reader.nextLine();
            try {
                if (Integer.parseInt(option) == 0) break;
                else equippingOrUsingObject(player, Integer.parseInt(option));
            } catch (Exception e) {
                System.out.println("Unknown option. Try again");
            }
        }
    }

    public static void inventoryMessage(int value, Item item) {
        switch (value) {
            case 1: {
                System.out.println("The chosen object is: " + YELLOW_BRIGHT + item.getName() + ANSI_RESET);
                break;
            }
            case 2: {
                System.out.println("You cannot use or equip this item.");
                break;
            }
        }
    }
}

