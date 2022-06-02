package com.company.view;

import com.company.model.NPC;
import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.Scanner;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.utils.Utilities.*;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.view.IOView.gameLoopView;
import static com.company.view.IOView.menuOption;

public class CharacterView {
    static Scanner reader = new Scanner(System.in);
    public static void showCharacter(Player player) {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "      " + BRONZE_UNDERLINED + ANSI_BOLD + "CHARACTERISTICS" + ANSI_RESET + "      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Name: " + YELLOW_BRIGHT + player.getName() + ANSI_RESET + " | Money: " + YELLOW_BRIGHT + player.getMoney() + ANSI_RESET + "     " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Level: " + YELLOW_BRIGHT + player.getLevel() + ANSI_RESET + " | Class: " + YELLOW_BRIGHT + player.getCharClass() + ANSI_RESET + "  " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Health Points: " + YELLOW_BRIGHT + player.getHealthPoints() + ANSI_RESET + "/" + YELLOW_BRIGHT + player.getMaxHealthPoints() + ANSI_RESET + "     " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Strength: " + YELLOW_BRIGHT + player.getStrength() + ((player.getEquipment().getTotalStrenght() != 0) ? " (" + ((player.getEquipment().getTotalStrenght() > 0) ? "+" : "") + player.getEquipment().getTotalStrenght() + ")" : "") + ANSI_RESET + "              " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Defense: " + YELLOW_BRIGHT + player.getDefense() + ((player.getEquipment().getTotalDefense() != 0) ? " (" + ((player.getEquipment().getTotalDefense() > 0) ? "+" : "") + player.getEquipment().getTotalDefense() + ")" : "") + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Speed: " + YELLOW_BRIGHT + player.getSpeed() + ((player.getEquipment().getTotalSpeed() != 0) ? " (" + ((player.getEquipment().getTotalSpeed() > 0) ? "+" : "") + player.getEquipment().getTotalSpeed() + ")" : "") + ANSI_RESET + "                 " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " Dexterity: " + YELLOW_BRIGHT + player.getDexterity() + ANSI_RESET + "             " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
    }

    public static void showClass() {
        System.out.println(ANSI_BRONZE_BACKGROUND + "                     " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "     " + BRONZE_UNDERLINED + ANSI_BOLD + "CLASSES" + ANSI_RESET + "       " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                   " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1- Cleric         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2- Mage           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 3- Monk           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 4- Paladin        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 5- Ranger         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 6- Rogue          " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 7- Warrior        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                     " + ANSI_RESET);
    }

    public static void moneyMessage(String value, Player player, NPC enemy) {
        switch (value) {
            case "1":
                System.out.println("You gained " + YELLOW_BRIGHT + enemy.getMoney() + ((enemy.getMoney() == 1) ? " coin" : " coins") + ANSI_RESET + "! Now you have " + YELLOW_BRIGHT + player.getMoney() + ((player.getMoney() == 1) ? " coin" : " coins") + ANSI_RESET + ".");
            case "2":
                System.out.println("Now you have " + YELLOW_BRIGHT + player.getMoney() + ((player.getMoney() == 1) ? " coin" : " coins") + ANSI_RESET + ".");
        }
    }

    public static void charMessage(String value) {
        switch (value) {
            case "1":
                System.out.println("Press any key to return to Character Menu");
        }
    }

    public static String baseText(Player player) {
        return "You are " + YELLOW_BRIGHT + player.getName() + ANSI_RESET + ", a " + YELLOW_BRIGHT + player.getCharClass() + ANSI_RESET + ". ";
    }

    public static void createCharacter() {
        System.out.println("          " + BRONZE_UNDERLINED + ANSI_BOLD + "CHARACTER CREATION" + ANSI_RESET);
        String name = Utilities.ask(reader, "What's your name?");
        charClassElection(name);
    }

    public static void charClassElection(String name) {
        Player player = new Player();
        while (true) {
            showClass();
            String charClassOption = Utilities.ask(reader, "What's your class?");

            switch (charClassOption.toLowerCase()) {
                case "1":
                case "cleric": {
                    player = createPlayer(name, "Cleric");
                    System.out.println("\n" + baseText(player) + "You served the gods for years; your piety gained their favour, and now you can pray them asking for help in your fight against evil haunting this kingdom.");
                    break;  }

                case "2":
                case "mage": {
                    player = createPlayer(name, "Mage");
                    System.out.println("\n" + baseText(player) + "You studied the magical arts all your life, you have an special sense for the supernatural, you will need that and all your willpower to face the evil of this land.");
                    break;  }

                case "3":
                case "monk": {
                    player = createPlayer(name, "Monk");
                    System.out.println("\n" + baseText(player) + "You trained a lot of years in a monastery in the Kalvahlah mountains, until you converted your body in a weapon; now you came back to civilization and will use your power to fight the evil");
                    break; }

                case "4":
                case "paladin": {
                    player = createPlayer(name, "Paladin");
                    System.out.println("\n" + baseText(player) + "You served the gods for years, but you know that prayers aren't enough to fight the evil, so you have an martial training as well. Now you are ready to save the kingdom.");
                    break;    }

                case "5":
                case "ranger": {
                    player = createPlayer(name, "Ranger");
                    System.out.println("\n" + baseText(player) + "You grew up in the wilderness, you know hoy to hunt, set traps and chase a prey. Now that the kingdom is in danger, you need to use that knowledge to save this land.");
                    break;     }

                case "6":
                case "rogue": {
                    player = createPlayer(name, "Rogue");
                    System.out.println("\n" + baseText(player) + "You grew up on the streets, you trust no one but yourself. However, now that the kingdom is in danger, you must face evil or there will be no one left to steal from.");
                    break;
                }

                case "7":
                case "warrior": {
                    player = createPlayer(name, "Warrior");
                    System.out.println("\n" + baseText(player) + "You were a skinny boy when you started your training, but after years you know to use a great variety of weapons. Now your kingdom needs you to save it from evil.");
                    break;
                }

                default:
                    System.out.println("Unknown option. Try again");
                    break;
            }
            System.out.println();
            gameLoopView(player);
        }

    }

    public static void characterMenu(){
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "         " + BRONZE_UNDERLINED + ANSI_BOLD + "CHARACTER" + ANSI_RESET + "         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 1- Details Character      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 2- Equipment              " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " 0- Return to Game Menu    " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
    }

    public static void character(Player player) {
        while (true) {
            characterMenu();
            String valueChoose = menuOption();
            switch (valueChoose) {
                case "1": {
                    showCharacter(player);
                    charMessage("1");
                    reader.nextLine();
                    break;
                }
                case "2": {
                    EquipmentView.showEquipmentView(player);
                    charMessage("1");
                    reader.nextLine();
                    break;
                }
                case "0": {
                    IOView.gameLoopView(player);
                    break;
                }
                default:
                    System.out.println("Unknown option. Try again");
                    break;
            }
        }
    }
}
