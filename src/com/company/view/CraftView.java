package com.company.view;

import com.company.model.Player;

import java.util.Scanner;

import static com.company.controller.CraftController.crafting;
import static com.company.utils.Utilities.*;

public class CraftView {

    public static void craftMenuView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"             "+BRONZE_UNDERLINED+ANSI_BOLD+"CRAFTING MENU"+ANSI_RESET+"              "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                    "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Health potion                         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Golem arm                             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Golem leg                             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Golem head                            "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Golem body                            "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println("Choose what item you want to craft. Press 0 to return to Game Menu");
    }

    public static void craftingOption(Player player){
        Scanner reader = new Scanner(System.in);
        while (true){
            craftMenuView();
            String option = reader.nextLine();
            try {
                if (Integer.parseInt(option) == 0) break;
                else crafting(player, Integer.parseInt(option));
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
    }
}
