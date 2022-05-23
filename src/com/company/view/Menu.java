package com.company.view;

import static com.company.utils.Utilities.*;

public class Menu{

    public static void mainMenuView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"             "+BRONZE_UNDERLINED+ANSI_BOLD+"MAIN MENU"+ANSI_RESET+"              "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                    "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- New Game                        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 0- Exit                            "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                      "+ANSI_RESET);
        System.out.println("Choose an option");
    }

    public static void menuNewGameView() {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"            "+BRONZE_UNDERLINED+ANSI_BOLD+"MAIN GAME"+ANSI_RESET+"             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                  "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Fight                         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Inventory                     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Character                     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 4- Shop                          "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 5- Craft                         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 6- Return to Main Menu           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                    "+ANSI_RESET);
        System.out.println("Choose an option");
    }

}
