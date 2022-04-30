package com.company.view;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IOView {


    public static void mainLoopView() {
        Scanner reader = new Scanner(System.in);
        while (true) {
            mainMenu();
            String optionMenuMain = reader.nextLine();
            switch (optionMenuMain) {

                case "1" -> System.out.println("Opcion 1");
                case "2" -> System.out.println("Opcion 2");
                default -> {
                    System.out.println("Opcion invalida \n");
                }
            }
        }
    }

    public static void mainMenu(){
        System.out.println("****************************************************");
        System.out.println("1- Nueva partida");
        //System.out.println("****************************************************");
        System.out.println("2- Salir");
        System.out.println("****************************************************");
    }
}
