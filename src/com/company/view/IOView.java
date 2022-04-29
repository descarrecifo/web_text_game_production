
package com.company.view;

import java.util.Scanner;


public class IOView {

    // Options Main Menu
    public static void OptionsMainMenu() {
        Scanner reader = new Scanner(System.in);

        while (true) {

            MainMenuPrint();
            String keyMenuMain = reader.nextLine();
            switch (keyMenuMain) {

                case "1" -> {
                    OptionsMenuNewGame();
                }

                case "2" -> {
                    GameFinishPrint();

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
            MenuNewGamePrint();
            String keyMenuNewGame = reader.nextLine();

            switch (keyMenuNewGame) {

                case "1" -> {
                    System.out.println("Opciones Lucha");
                    System.out.println("OK. Volvemos a Menu principal");
                    OptionsMainMenu(); //return
                }

                case "2" -> {
                    System.out.println("Opciones Inventario");
                    System.out.println("OK. Volvemos a Menu principal");
                    OptionsMainMenu(); //return
                }
                case "3" -> {
                    System.out.println("Volvemos al menu principal");
                    OptionsMainMenu(); //return


                }
                default -> {
                    System.out.println("Opcion invalida Menu Juego. Reinténtalo");
                    OptionsMenuNewGame();
                }
            }
        }

    }
    // Print Main Menu
    public static void MainMenuPrint() {
        System.out.println("****************************************************");
        System.out.println("1- Nueva partida");
        //System.out.println("****************************************************");
        System.out.println("2- Salir");
        System.out.println("****************************************************");
    }
    // Print Menu New Game
    public static void MenuNewGamePrint() {
        System.out.println("****************************************************");
        System.out.println("1- Lucha");
        System.out.println("2- Inventario");
        //System.out.println("****************************************************");
        System.out.println("3- Salir");
        System.out.println("****************************************************");
    }

    // Print Game Finish
    public static void GameFinishPrint(){
        //Exit program
        System.out.println("Esperamos verte pronto, aventurero!");
        System.exit(0);

    };
}

