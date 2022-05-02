
package com.company.view;

import com.company.model.Player;

import java.util.Scanner;
import static com.company.view.View.*;


import static com.company.frontcontroller.FrontController.mainLoopController;

public class IOView {

    public static void optionsMainMenu(Player player) {
        Scanner reader = new Scanner(System.in);

        while (true) {

            mainMenuView();
            String keyMenuMain = reader.nextLine();
            switch (keyMenuMain) {

                case "1" -> OptionsMenuNewGame(player);
                case "2" -> gameFinishView();
                default -> System.out.println("Unknown command. Try again");
            }
        }
    }

    public static void OptionsMenuNewGame(Player player) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            menuNewGameView();
            String keyMenuNewGame = reader.nextLine();

            switch (keyMenuNewGame) {

                case "1" -> mainLoopController("1", player);
//                case "1" -> {
//                    System.out.println("Fight options");
//                    ShowFight();
////                    pressKeyToContinue();
//                    OptionsMenuNewGame(player);
//
//                }

                case "2" -> mainLoopController("2", player);
//                case "2" -> {
//                    System.out.println("Inventory options");
//                    showInventory();
////                    pressKeyToContinue();
//                    OptionsMenuNewGame();
//                    //System.out.println("Return main menu");
//                    //optionsMainMenu(); //return
//                }
                case "3" -> {
                    System.out.println("Volvemos al menu principal");
                    return;
//                    System.out.println("Return to Main Menu");
//                    optionsMainMenu(); //return
                }
                default -> System.out.println("Unknown order. Try again");
            }
        }
    }
//    // Key to continue. Key is residual
//    private static void pressKeyToContinue() {
//        String keyToContinue = reader.nextLine();
//    }


//    }


//    public static void mainLoopView() {
//        Scanner reader = new Scanner(System.in);
//        while (true) {
//            mainMenu();
//            String optionMenuMain = reader.nextLine();
//            switch (optionMenuMain) {
//
//                case "1" -> mainLoopController("1");
//                case "2" -> {
//                    return;
//                }
//                default -> System.out.println("Opcion invalida \n");
//                }
//            }
//        }


    public static void mainMenu(){
        System.out.println("****************************************************");
        System.out.println("1- Nueva partida");
        System.out.println("2- Salir");
        System.out.println("****************************************************");
    }
}
