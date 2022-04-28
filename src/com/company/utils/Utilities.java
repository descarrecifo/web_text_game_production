package com.company.utils;

import java.util.Scanner;

public class Utilities {

    public static final String ANSI_RESET = "\u001B[0m", YELLOW_BRIGHT = "\033[0;93m", BRONZE_UNDERLINED = "\033[4;38;2;205;127;50m",
                               ANSI_BRONZE_BACKGROUND = "\033[48;2;205;127;50m", ANSI_BOLD = "\u001B[1m";

    public static String ask(Scanner scanner, String text) {
        System.out.println(text);
        return scanner.next();
    }
}