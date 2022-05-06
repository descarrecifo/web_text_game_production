
package com.company.view;

import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

//import static com.company.controller.CharacterController.createCharacter;
import static com.company.controller.CharacterController.createPlayer;
import static com.company.view.Menu.*;


import static com.company.frontcontroller.FrontController.mainLoopController;

public class IOView {

    public static void optionsMainMenu() {
        Scanner reader = new Scanner(System.in);

        while (true) {

            mainMenuView();
            String keyMenuMain = reader.nextLine();
            switch (keyMenuMain) {

                //case "1" -> OptionsMenuNewGame(player);
                 case "1" -> {
                    createCharacter();

                }
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

                case "1" ->mainLoopController("1", player);
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
                    System.out.println("Return to Main Menu");
                    optionsMainMenu();
//                    System.out.println("Return to Main Menu");
//                     //return
                }
                default -> System.out.println("Unknown order. Try again");
            }
        }
    }


    public static void OptionsChar(String name) {

        Scanner reader = new Scanner(System.in);


        while (true) {
            System.out.println("Choose your class");
            System.out.println("******************");
            System.out.println("* 1-Guerrero     *");
            System.out.println("* 2-Mago         *");
            System.out.println("* 3-Cazador      *");
            System.out.println("******************");
            String opchar = reader.nextLine();


            switch (opchar) {
                case "1" ->  createPlayer(name,"Guerrero");


                case "2" -> createPlayer(name,"Mago");

                case "3" -> createPlayer(name,"Cazador");
            }

        }

    }
    //  Game Over or Menu Exit
    public static void gameFinishView(){
        //Exit program
        System.out.println("We hope to see you soon, adventurer!");
        System.exit(0);

    }
    public static void createCharacter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Character");
        String name = Utilities.ask(scanner,"Name?");
        OptionsChar(name);

        String charClass= Utilities.ask(scanner,"CharClass?");
        System.out.println("Eres " + name + "un" + charClass +  "Preparate para tu gran aventura!");


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

//
//    public static void mainMenu(){
//        System.out.println("****************************************************");
//        System.out.println("1- Nueva partida");
//        System.out.println("2- Salir");
//        System.out.println("****************************************************");
//    }
}
