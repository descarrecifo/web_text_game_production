package com.company.view;

import com.company.model.Inventory;
import com.company.model.Player;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static com.company.controller.ShopController.shoppingSystem;
import static com.company.service.ShopService.itemPriceCalculation;
import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.view.IOView.gameLoopView;

public class ShopView {

    public static void menuShopView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"            "+BRONZE_UNDERLINED+"SHOP"+ANSI_RESET+"             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                  "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Buy                         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Sell                     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Return to Main Menu           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println("Choose an option");
    }

    public static void showShopInventory(Inventory shopInventory){
        AtomicInteger i = new AtomicInteger(1);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                       " + BRONZE_UNDERLINED + "SHOP INVENTORY" + ANSI_RESET + "                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        shopInventory.getItems().forEach((k, v) -> {
            k.setIndex(i.intValue());
            System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                    + k.getInventoryName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT + v + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + k.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                    + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Price: " + YELLOW_BRIGHT + itemPriceCalculation(1, k) + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            if (k.getItemHabilities().get("attack") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + k.getItemHabilities().get("attack") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getItemHabilities().get("defense") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + k.getItemHabilities().get("defense") + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            if (k.getItemHabilities().get("speed") != 0) {
                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + k.getItemHabilities().get("speed") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
            }
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        });
//                "key: %s, value: %d%n", k, v));
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
        System.out.println(" ");
        System.out.println("Choose an item number to buy. Press 0 to return to Shop Menu");
    }

    public static void buying(Inventory shopInventory) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            showShopInventory(shopInventory);
            String option = reader.nextLine();
//            try {
//                if (Integer.parseInt(option) == 0) break;
//                else equippingObject(player, Integer.parseInt(option));
//            } catch (Exception e) {
//                System.out.println("Invalid option");
//            }
        }
    }

    public static void shopping(Player player){
        Scanner reader = new Scanner(System.in);
        while(true){
            menuShopView();
            String option = reader.nextLine();
            switch (option){
                case "1" -> shoppingSystem(player, 1);
                case "2" -> shoppingSystem(player, 2);
                case "3" -> gameLoopView(player);
                default -> System.out.println("Invalid option");
            }
        }
    }
}
