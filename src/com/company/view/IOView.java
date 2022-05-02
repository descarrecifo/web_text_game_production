
package com.company.view;

import java.util.Scanner;
import static com.company.view.View.*;


public class IOView {
    static Scanner reader = new Scanner(System.in);
    // Options Main Menu
    public static void optionsMainMenu() {


        while (true) {

            mainMenuView();
            String keyMenuMain = reader.nextLine();
            switch (keyMenuMain) {

                case "1" -> {
                    OptionsMenuNewGame();
                }

                case "2" -> {
                    gameFinishView();

                }
                default -> {
                    System.out.println("Unknown command. Try again");
                }
            }
        }
    }
    // Options Menu New Game
    public static void OptionsMenuNewGame() {


        while (true) {
            menuNewGameView();
            String keyMenuNewGame = reader.nextLine();

            switch (keyMenuNewGame) {

                case "1" -> {
                    System.out.println("Fight options");
                    ShowFight();
                    pressKeyToContinue();
                    OptionsMenuNewGame();

                }

                case "2" -> {
                    System.out.println("Inventory options");
                    showInventory();
                    pressKeyToContinue();
                    OptionsMenuNewGame();
                    //System.out.println("Return main menu");
                    //optionsMainMenu(); //return
                }
                case "3" -> {
                    System.out.println("Return to Main Menu");
                    optionsMainMenu(); //return


                }
                default -> {
                    System.out.println("Unknown order. Try again");
                    OptionsMenuNewGame();
                }
            }
        }

    }
    // Key to continue. Key is residual
    private static void pressKeyToContinue() {
        String keyToContinue = reader.nextLine();
    }


}

