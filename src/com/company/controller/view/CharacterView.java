package com.company.controller.view;

import com.company.model.Player;
import com.company.view.EquipmentView;
import com.company.view.IOView;
import com.company.view.IOView.*;

import java.util.Scanner;

import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;

public class CharacterView {
    public static void showCharacter(Player player) {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                             "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"         "+BRONZE_UNDERLINED+"CHARACTER"+ANSI_RESET+"         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Name: "+YELLOW_BRIGHT+player.getName()+ANSI_RESET+"               "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Level: "+YELLOW_BRIGHT+player.getLevel()+ANSI_RESET+" | Class: "+YELLOW_BRIGHT+player.getCharClass()+ANSI_RESET+"  "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Life Points: "+YELLOW_BRIGHT+ player.getHealthPoints()+ANSI_RESET+"          "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Strength: "+YELLOW_BRIGHT+player.getStrength()+"(" + player.getEquipmentHabilities().getSumStrenghtEquipment() +")"+ANSI_RESET+"              "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Defense: "+YELLOW_BRIGHT+player.getDefense()+"(" + player.getEquipmentHabilities().getSumDefenseEquipment() +")"+ANSI_RESET+"               "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Speed: "+YELLOW_BRIGHT+player.getSpeed()+"(" + player.getEquipmentHabilities().getSumSpeedEquipment() +")"+ANSI_RESET+"                 "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Dexterity: "+YELLOW_BRIGHT+player.getDexterity()+ANSI_RESET+"             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println("");
        EquipmentView.showItemsEquipmentPlayer(player);
    }

    public static void showClass(){
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"    "+BRONZE_UNDERLINED+"CLASSES"+ANSI_RESET+"     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Warrior     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Mage        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Hunter      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println("Choose a class");
    }


    // SubMenu Character
    public static void menuCharacterChoose(Player player) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("*******************************************");
            System.out.println("MENU CHARACTER");
            System.out.println("");
            System.out.println("1- Details Character");
            System.out.println("2- Equipment");
            System.out.println("");
            System.out.println("0- Return back menu");
            System.out.println("*******************************************");
            String valueChoose = scanner.nextLine();
            switch (valueChoose) {
                case "1" -> {
                    showCharacter(player);
                    System.out.println("Press any key to return to Menu Character Choose");
                    scanner.nextLine();
                    menuCharacterChoose(player);
                    break;

                }
                case "2" -> {
                    EquipmentView.showEquipmentView(player);
                    System.out.println("Press any key to return to Menu Character Choose");
                    scanner.nextLine();
                    menuCharacterChoose(player);
                    break;
                }
                case "0" -> {
                    IOView.gameLoopView(player);
                    break;
                }
                default -> System.out.println("Unknown command. Try again");
            }
        }
    }


}
