package com.company.view;

import com.company.model.NPC;
import com.company.model.Player;

import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;

public class CharacterView {
    public static void showCharacter(Player player) {
        System.out.println(ANSI_BRONZE_BACKGROUND+"                             "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"         "+BRONZE_UNDERLINED+"CHARACTER"+ANSI_RESET+"         "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Name: "+YELLOW_BRIGHT+player.getName()+ANSI_RESET+" | Money: "+YELLOW_BRIGHT+player.getMoney()+ANSI_RESET+"     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Level: "+YELLOW_BRIGHT+player.getLevel()+ANSI_RESET+" | Class: "+YELLOW_BRIGHT+player.getCharClass()+ANSI_RESET+"  "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Life Points: "+YELLOW_BRIGHT+ player.getHealthPoints()+ANSI_RESET+"          "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Strength: "+YELLOW_BRIGHT+player.getStrength()+ANSI_RESET+"              "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Defense: "+YELLOW_BRIGHT+player.getDefense()+ANSI_RESET+"               "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Speed: "+YELLOW_BRIGHT+player.getSpeed()+ANSI_RESET+"                 "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" Dexterity: "+YELLOW_BRIGHT+player.getDexterity()+ANSI_RESET+"             "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                             "+ANSI_RESET);
        System.out.println(" ");
    }

    public static void showClass(){
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"    "+BRONZE_UNDERLINED+"CLASSES"+ANSI_RESET+"     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 1- Warrior     "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 2- Mage        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 3- Hunter      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" 4- Monk        "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                  "+ANSI_RESET);
        System.out.println("Choose a class");
    }

    public static void moneyMessage(String value, Player player, NPC enemy){
        switch (value) {
            case "1" -> System.out.println("You gained "+enemy.getMoney()+" coins! Now you have "+player.getMoney()+" coins.");
        }
    }
}
