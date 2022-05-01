
package com.company.view;

import java.util.Scanner;
import static com.company.view.View.*;


public class IOView {

    // Options Main Menu
    public static void optionsMainMenu() {
        Scanner reader = new Scanner(System.in);

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
                    System.out.println("Opcion invalida Menu Principal");
                }
            }
        }
    }
    // Options Menu New Game
    public static void OptionsMenuNewGame() {
        Scanner reader = new Scanner(System.in);

        while (true) {
            menuNewGameView();
            String keyMenuNewGame = reader.nextLine();

            switch (keyMenuNewGame) {

                case "1" -> {
                    System.out.println("Opciones Lucha");
                    System.out.println("OK. Volvemos a Menu principal");
                    optionsMainMenu(); //return
                }

                case "2" -> {
                    System.out.println("Opciones Inventario");
                    System.out.println("OK. Volvemos a Menu principal");
                    optionsMainMenu(); //return
                }
                case "3" -> {
                    System.out.println("Volvemos al menu principal");
                    optionsMainMenu(); //return


                }
                default -> {
                    System.out.println("Opcion invalida Menu Juego. Reinténtalo");
                    OptionsMenuNewGame();
                }
            }
        }

    }


}

