
package com.company.view;

import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

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
                case "1" -> createCharacter();
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
                case "2" -> mainLoopController("2", player);
                case "3" -> {
                    System.out.println("Return to Main Menu");
                    optionsMainMenu();
                }
                default -> System.out.println("Unknown command. Try again");
            }
        }
    }

    public static void createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Character");
        String name = Utilities.ask(scanner, "Name?");
        OptionsChar(name);
    }


    public static void OptionsChar(String name) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            showClass();
            String opchar = reader.nextLine();

            switch (opchar) {
                case "1" -> createPlayer(name, "Warrior");
                case "2" -> createPlayer(name, "Mage");
                case "3" -> createPlayer(name, "Hunter");
                default -> System.out.println("Invalid option");
            }

        }

    }

    //  Game Over or Menu Exit
    public static void gameFinishView() {
        //Exit program
        System.out.println("We hope to see you soon, adventurer!");
        System.exit(0);
    }

}
