package com.company.view;

import jdk.swing.interop.SwingInterOpUtils;

public class View {

    //Main Menu
    public static void mainMenuView() {
        System.out.println("****************************************************");
        System.out.println("1- New Game");
        //System.out.println("****************************************************");
        System.out.println("2- Exit");
        System.out.println("****************************************************");
    }

    // Menu New Game

    public static void menuNewGameView() {
        System.out.println("****************************************************");
        System.out.println("1- Fight");
        System.out.println("2- Inventory");
        //System.out.println("****************************************************");
        System.out.println("3- Return ");
        System.out.println("****************************************************");
    }

    public static void ShowFight() {
        System.out.println("****************************************************");
        System.out.println("You fought an enemy");
        System.out.println("The result is ...");
        System.out.println("****************************************************");
        System.out.print("Press a key to return");
        //System.out.println("****************************************************");
    }

    public static void showInventory(){
        System.out.println("****************************************************");
        System.out.println("************************Item************************");
        System.out.println("Name: ");
        System.out.println("Type: ");
        System.out.println("Description: ");
        System.out.println("Price: ");
        System.out.println("Caracteristics: ");
        System.out.println("****************************************************");
        System.out.print("Press a key to return");

    }


    //  Game Over or Menu Exit
    public static void gameFinishView(){
        //Exit program
            System.out.println("We hope to see you soon, adventurer!");
        System.exit(0);

    }
}
