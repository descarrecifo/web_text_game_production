package com.company.view;

public class View {

    //Main Menu
    public static void mainMenuView() {
        System.out.println("****************************************************");
        System.out.println("1- Nueva partida");
        //System.out.println("****************************************************");
        System.out.println("2- Salir");
        System.out.println("****************************************************");
    }

    // Menu New Game

    public static void menuNewGameView() {
        System.out.println("****************************************************");
        System.out.println("1- Lucha");
        System.out.println("2- Inventario");
        //System.out.println("****************************************************");
        System.out.println("3- Salir");
        System.out.println("****************************************************");
    }

    //  Game Over or Menu Exit
    public static void gameFinishView(){
        //Exit program
        System.out.println("Esperamos verte pronto, aventurero!");
        System.exit(0);

    }
}
