package com.company.frontcontroller;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> System.out.println("");
            default -> System.out.println("Invalid option\n");
        }
    }
}
