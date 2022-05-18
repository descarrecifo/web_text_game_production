package com.company.frontcontroller;

import com.company.model.Player;
import com.company.view.EquippmentView;

import java.io.InputStream;
import java.util.Scanner;

import static com.company.controller.FightController.fighting;
import static com.company.view.CharacterView.showCharacter;
import static com.company.view.IOView.*;
import static com.company.view.InventoryView.inventoryUseItem;
import static com.company.view.EquippmentView.*;


public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> createCharacter();
        }
    }

    public static void gameLoopController(String value , Player player) {
        switch (value) {
            case "1" -> fighting(player);
            case "2" -> inventoryUseItem(player);
            case "3" -> menuCharacterChoose(player);
        }
    }

//    private static void menuCharacterChoose(Player player) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("MENU CHARACTER");
//            System.out.println("1- Details Character");
//            System.out.println("2- Equipment");
//            System.out.println("0- Return back menu");
//            String valueChoose = scanner.nextLine();
//            switch (valueChoose) {
//                case "1" -> {
//                    showCharacter(player);
//                    System.out.print("Press any key to return to Menu Character Choose");
//                    valueChoose = scanner.nextLine();
//                    menuCharacterChoose(player);
//                    break;
//
//                }
//                case "2" -> {
//                   // EquippmentView.showEquippmentView(player);
//                    System.out.println("Menu equipment");
//                    System.out.print("Press any key to return to  Menu Character Choose");
//                    valueChoose = scanner.nextLine();
//                    menuCharacterChoose(player);
//                    break;
//                }
//                case "0" -> {
//                    gameLoopView(player);
//                    break;
//                }
//                default -> System.out.println("Unknown command. Try again");
//            }
//        }
//    }

}