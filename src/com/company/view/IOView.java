
package com.company.view;

import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.frontcontroller.FrontController.gameLoopController;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.BRONZE_UNDERLINED;
import static com.company.view.CharacterView.showClass;
import static com.company.view.Menu.*;


import static com.company.frontcontroller.FrontController.mainLoopController;

public class IOView {

    public static void mainLoopView() {
        Scanner reader = new Scanner(System.in);

        while (true) {

            mainMenuView();
            String keyMenuMain = reader.nextLine();
            switch (keyMenuMain) {
                case "1" -> mainLoopController("1");
                case "2" -> finishGameView();
                default -> System.out.println("Unknown command. Try again");
            }
        }
    }

    public static void gameLoopView(Player player) {

        Scanner reader = new Scanner(System.in);

        while (true) {
            menuNewGameView();
            String keyMenuNewGame = reader.nextLine();

            switch (keyMenuNewGame) {

                case "1" -> gameLoopController("1", player);
                case "2" -> gameLoopController("2", player);
                case "3" -> gameLoopController("3", player);
                case "4" -> gameLoopController("4", player);
                case "5" -> mainLoopView();
                default -> System.out.println("Unknown command. Try again");
            }
        }
    }

    public static void createCharacter() {
        Scanner reader = new Scanner(System.in);
        System.out.println("          " + BRONZE_UNDERLINED + "CHARACTER CREATION" + ANSI_RESET);
        String name = Utilities.ask(reader, "What's your name?");
        charClassElection(name);
    }


    public static void charClassElection(String name) {
        Scanner reader = new Scanner(System.in);
        while (true) {
            showClass();
            String charClassOption = reader.nextLine();

            switch (charClassOption) {
                case "1" -> createPlayer(name, "Cleric");
                case "2" -> createPlayer(name, "Mage");
                case "3" -> createPlayer(name, "Monk");
                case "4" -> createPlayer(name, "Paladin");
                case "5" -> createPlayer(name, "Ranger");
                case "6" -> createPlayer(name, "Warrior");
                default -> System.out.println("Invalid option");
            }

        }
    }

    //  Game Over or Menu Exit
    public static void finishGameView() {
        //Exit program
        System.out.println("We hope to see you soon, adventurer!");
        System.exit(0);
    }
}
