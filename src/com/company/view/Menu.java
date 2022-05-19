package com.company.view;
import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

import static com.company.utils.Utilities.*;

public class Menu{

    //Main Menu
    public static void mainMenuView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"             "+BRONZE_UNDERLINED+"MAIN MENU"+ANSI_RESET+"              "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                    "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- New Game                        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 0- Exit                            "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println("Choose an option");
    }

    // Menu New Game
    public static void menuNewGameView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"            "+BRONZE_UNDERLINED+"MAIN GAME"+ANSI_RESET+"             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                  "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Fight                         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Inventory                     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Character                     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 0- Return to Main Menu           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println("Choose an option");
    }

}
