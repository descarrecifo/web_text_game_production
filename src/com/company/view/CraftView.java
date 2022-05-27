package com.company.view;

import com.company.controller.CraftController;
import com.company.model.Player;

import java.util.Scanner;

import static com.company.utils.Utilities.*;

public class CraftView {

    public static void craftMenuView() {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                      " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "           " + BRONZE_UNDERLINED + ANSI_BOLD + "CRAFTING MENU" + ANSI_RESET + "            " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                    " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1- Health potion                   " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2- Golem arm                       " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 3- Golem leg                       " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 4- Golem head                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 5- Golem body                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 6- Leather                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 7- Leather helmet                  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 8- Leather gloves                  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 9- Leather boots                   " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 10- Leather armour                 " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                                      " + ANSI_RESET);
        System.out.println();
    }

    public static void crafting(Player player) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            craftMenuView();
            String option = ask(reader, "Choose what item you want to craft. Press 0 to return to back Menu");
            try {
                if (Integer.parseInt(option) == 0) break;
                else {
                    int quantity = Integer.parseInt(ask(reader, "How many items do you want to craft?"));
                    if (quantity < 1) {
                        System.out.println("The quantity needs to be at least 1");
                    } else CraftController.crafting(player, Integer.parseInt(option), quantity);
                }
            } catch (Exception e) {
                System.out.println("Unknown option. Try again");
            }
        }
    }

    public static void craftingMessages(int value, String craftedItemName, int inventoryQuantity, int necessaryQuantity, String ingredientName, int craftQuantity) {
        switch (value) {
            case 1: {
                System.out.println("You don't have enough ingredients, you need " + YELLOW_BRIGHT + (necessaryQuantity * craftQuantity - inventoryQuantity) + ANSI_RESET + " more of " + YELLOW_BRIGHT + ingredientName + ANSI_RESET + " to craft " + YELLOW_BRIGHT + craftQuantity + " " + craftedItemName + ANSI_RESET);
                break;
            }
        }
    }
}