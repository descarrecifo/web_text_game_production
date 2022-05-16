package com.company.view;

import com.company.model.Inventory;
import com.company.model.Player;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.controller.ShopController.shoppingSystem;
import static com.company.service.ShopService.itemPriceCalculation;
import static com.company.service.ShopService.shoppingAction;
import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.view.IOView.gameLoopView;

public class ShopView {

    public static void menuShopView() {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                    " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "            " + BRONZE_UNDERLINED + ANSI_BOLD + "SHOP" + ANSI_RESET + "             " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1- Buy                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2- Sell                     " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 3- Return to Main Menu           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                    " + ANSI_RESET);
        System.out.println("Choose an option");
    }

    public static void showShopInventory(Inventory shopInventory, int value) {
        AtomicInteger i = new AtomicInteger(1);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                    " + BRONZE_UNDERLINED + ANSI_BOLD + "SHOP INVENTORY" + ANSI_RESET + "                   " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        shopInventory.getItems().forEach((k, v) -> {
            k.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + k.getInventoryName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + v + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + k.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Price: " + YELLOW_BRIGHT + ((value == 1) ? itemPriceCalculation(1, k) : itemPriceCalculation(2, k)) + ANSI_RESET + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            if (k.getItemProperties().get("attack") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + k.getItemProperties().get("attack") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getItemProperties().get("defense") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + k.getItemProperties().get("defense") + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getItemProperties().get("speed") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + k.getItemProperties().get("speed") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        });
//                "key: %s, value: %d%n", k, v));
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(" ");
        System.out.println("Choose an item number to " + ((value != 1) ? "sell" : "buy") + ". Press 0 to return to Shop Menu");
    }

    public static void buyingAndSelling(Inventory shopInventory, Player player, int value) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            if (value == 1) showShopInventory(shopInventory, value);
            else showShopInventory(player.getInventory(), value);
            String option = reader.nextLine();
            try {
                if (Integer.parseInt(option) == 0) break;
                else {
                    int quantity = Integer.parseInt(ask(reader, "How many items do you want to " + ((value != 1) ? "sell" : "buy") + "?"));
                    if (quantity < 1) {
                        System.out.println("The quantity needs to be at least 1");
                        buyingAndSelling(shopInventory, player, value);
                    }
                    else {
                        if (value == 1) {
                            shoppingAction(1, shopInventory, Integer.parseInt(option), player, quantity);
                        } else {
                            shoppingAction(2, shopInventory, Integer.parseInt(option), player, quantity);
                        }
                        if (value == 1) showShopInventory(shopInventory, value);
                        else showShopInventory(player.getInventory(), value);

                    }
                }

            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }

    }

    public static void shopping(Player player) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            menuShopView();
            String option = reader.nextLine();
            switch (option) {
                case "1" -> shoppingSystem(player, 1);
                case "2" -> shoppingSystem(player, 2);
                case "3" -> gameLoopView(player);
                default -> System.out.println("Invalid option");
            }
        }
    }

    public static void shopMessage(int value, String itemName, int price, int quantity) {
        switch (value) {
            case 1 -> System.out.println("The chosen object is " + YELLOW_BRIGHT + itemName + ANSI_RESET + ", its quantity is " + YELLOW_BRIGHT + quantity + ANSI_RESET + " and its price is " + YELLOW_BRIGHT + price + ANSI_RESET);
            case 2 -> System.out.println("You don't have enough money for buy " + YELLOW_BRIGHT + quantity + ANSI_RESET + ((quantity == 1) ? " unit " : " units ") + YELLOW_BRIGHT + itemName + ANSI_RESET);
            case 3 -> System.out.println("You don't have "+quantity+" of "+itemName+" to sell.");
        }
    }
}
