package com.company.view;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static com.company.frontcontroller.FrontController.mainLoopController;

public class IOView {

    public static void mainLoopView() {
        Scanner reader = new Scanner(System.in);
        while (true) {
            mainMenu();
            String optionMenuMain = reader.nextLine();
            switch (optionMenuMain) {

                case "1" -> mainLoopController("1");
                case "2" -> {
                    break;
                }
                default -> System.out.println("Opcion invalida \n");
                }
            }
        }


    public static void mainMenu(){
        System.out.println("****************************************************");
        System.out.println("1- Nueva partida");
        System.out.println("2- Salir");
        System.out.println("****************************************************");
    }
}
