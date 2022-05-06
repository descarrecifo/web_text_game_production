package com.company.view;

import com.company.model.NPC;
import com.company.model.Player;

import static com.company.service.FightService.fightDamage;

public class FightView {

    public static void fightingMessages(String value, NPC enemy, Player player) {
        switch (value) {
            case "1" -> System.out.println("Your enemy successes their attack!");
            case "2" -> System.out.println("You successes your attack!");
            case "3" -> System.out.println("The enemy makes you " + fightDamage(enemy, player) + " points of damage!");
            case "4" -> System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
            case "5" -> System.out.println("Your enemy has failed, now is your turn!");
            case "6" -> System.out.println("You have failed, now is your enemy's turn!");
            case "7" -> System.out.println("You have failed, try again!");
            case "8" -> System.out.println("Your enemy has failed, they will try again!");
            case "9" -> System.out.println("You have leveled up! Your level is now " + player.getLevel());
            case "10" -> System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense() + ", your speed is "
                            + player.getSpeed() + " and you have " + player.getHealthPoints() + " HP");
            case "11" -> System.out.println("You need to attack again");
        }
    }
}
