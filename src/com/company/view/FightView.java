package com.company.view;

import com.company.model.NPC;
import com.company.model.Player;

import static com.company.service.FightService.fightDamage;
import static com.company.utils.Utilities.ANSI_RESET;
import static com.company.utils.Utilities.YELLOW_BRIGHT;

public class FightView {

    public static void fightingMessages(String value, NPC enemy, Player player) {
        switch (value) {
            case "1" -> System.out.println("Your enemy successes their attack!");
            case "2" -> System.out.println("You successes your attack!");
            case "3" -> System.out.println("The enemy makes you " +YELLOW_BRIGHT+ fightDamage(enemy, player)+ " points "+ANSI_RESET +"of damage!");
            case "4" -> System.out.println("You makes " +YELLOW_BRIGHT+ fightDamage(player, enemy)+ " points "+ANSI_RESET +"of damage to your enemy!");
            case "5" -> System.out.println("Your enemy has failed, now is your turn!");
            case "6" -> System.out.println("You have failed, now is your enemy's turn!");
            case "7" -> System.out.println("You have failed, try again!");
            case "8" -> System.out.println("Your enemy has failed, they will try again!");
            case "9" -> System.out.println("You have leveled up! Your level is now " +YELLOW_BRIGHT+ player.getLevel()+ANSI_RESET);
            case "10" -> System.out.println("You're stronger! Now your strength is " +YELLOW_BRIGHT+ player.getStrength() +ANSI_RESET + ", your defense is "
                    +YELLOW_BRIGHT+ player.getDefense() +ANSI_RESET + ", your speed is "
                    +YELLOW_BRIGHT+ player.getSpeed() +ANSI_RESET + " and you have " +YELLOW_BRIGHT+ player.getHealthPoints() + " HP"+ANSI_RESET);
            case "11" -> System.out.println("You need to attack again");
        }
    }
}
