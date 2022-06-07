package com.company.view;

import com.company.controller.ShopController;
import com.company.model.EquippableItem;
import com.company.model.Inventory;
import com.company.model.Player;
import com.company.service.ShopService;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.service.ShopService.itemPriceCalculation;
import static com.company.utils.Utilities.*;
import static com.company.view.IOView.gameLoopView;

public class ShopView {
    static Scanner reader = new Scanner(System.in);
    public static void menuShopView() {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                    " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "            " + BRONZE_UNDERLINED + ANSI_BOLD + "SHOP" + ANSI_RESET + "             " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1- Buy                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2- Sell                     " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 0- Return to back Menu           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                    " + ANSI_RESET);
    }
    public static void showShopInventoryLoop(Inventory shopInventory, int value){
        AtomicInteger i = new AtomicInteger(1);
        shopInventory.getItems().forEach((item) -> {
            item.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + item.getName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + item.getQuantity() + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + item.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Price: " + YELLOW_BRIGHT + ((value == 1) ? itemPriceCalculation(1, item) : itemPriceCalculation(2, item)) + ANSI_RESET + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
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
    public static void showShopInventory(Inventory shopInventory, int value) {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                     " + BRONZE_UNDERLINED + ANSI_BOLD + "SHOP INVENTORY" + ANSI_RESET + "                   " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        showShopInventoryLoop(shopInventory,value);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(" ");
    }

    public static void buyingAndSelling(Inventory shopInventory, Player player, int value) {
        while (true) {
            if (value != 1) showShopInventory(player.getInventory(), value);
            else showShopInventory(shopInventory,value);

            String option = ask(reader, "Choose an item number to " + ((value != 1) ? "sell" : "buy") + ". Press 0 to return to Shop Menu");
            try {
                if (Integer.parseInt(option) == 0) break;
                else {
                    int quantity = Integer.parseInt(ask(reader, "How many items do you want to " + ((value != 1) ? "sell" : "buy") + "?"));
                    if (quantity < 1) {
                        System.out.println("The quantity needs to be at least 1");
                    } else {
                        if (value == 1) {
                            ShopService.shopping(1, shopInventory, Integer.parseInt(option), player, quantity);
                        } else {
                            ShopService.shopping(2, shopInventory, Integer.parseInt(option), player, quantity);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Unknown option. Try again");
            }
        }
    }

    public static void shopping(Player player) {
        while (true) {
            menuShopView();
            String option = ask(reader, "Choose an option");
            switch (option) {
                case "1": {
                    ShopController.shopping(player, 1);
                    break;
                }
                case "2": {
                    ShopController.shopping(player, 2);
                    break;
                }
                case "0": {
                    gameLoopView(player);
                    break;
                }
                default: {
                    System.out.println("Unknown option. Try again");
                    break;
                }
            }
        }
    }

    public static void shopMessage(int value, String itemName, int price, int quantity) {
        switch (value) {
            case 1: {
                System.out.println("The chosen object is " + YELLOW_BRIGHT + itemName + ANSI_RESET + ", its quantity is " + YELLOW_BRIGHT + quantity + ANSI_RESET + " and its price is " + YELLOW_BRIGHT + price + ANSI_RESET);
                break;
            }
            case 2: {
                System.out.println("You don't have enough money for buy " + YELLOW_BRIGHT + quantity + ANSI_RESET + ((quantity == 1) ? " unit " : " units ") + "of " + YELLOW_BRIGHT + itemName + ANSI_RESET);
                break;
            }
            case 3: {
                System.out.println("You don't have " + YELLOW_BRIGHT + quantity + ANSI_RESET + ((quantity == 1) ? " unit " : " units ") + "of " + YELLOW_BRIGHT + itemName + ANSI_RESET + " to sell.");
                break;
            }
        }
    }
}
