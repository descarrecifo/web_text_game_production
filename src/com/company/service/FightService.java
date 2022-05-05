package com.company.service;

import com.company.model.Character;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.view.IOView.optionsMainMenu;

public class FightService {

    public static void fightDevelopment(NPC enemy, Player player) {
        //TODO change the for-loop to a while(true)
        if (player.getSpeed() <= enemy.getSpeed()) {
            outerloop1:
            for (int i = 0; i < 10; i++) {
                boolean success = attackSuccess(enemy, player);
                if (success) {
                    System.out.println("Your enemy successes their attack!");
                    player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
                    System.out.println("The enemy makes you " + fightDamage(enemy, player) + " points of damage!");
                    System.out.println(player.getHealthPoints());
                    fightResult(enemy, player);
                    break outerloop1;
                } else {
                    System.out.println("Your enemy has failed, now is your turn!");
                    for (int j = 0; j < 10; j++) {
                        success = attackSuccess(enemy, player);
                        if (success) {
                            System.out.println("You successes your attack!");
                            enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
                            System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
                            System.out.println(enemy.getHealthPoints());
                            fightResult(enemy, player);
                            break outerloop1;
                        }
                        System.out.println("You have failed, try again!");
                    }
                }
            }
        } else {
            outerloop2:
            for (int i = 0; i < 10; i++) {
                boolean success = attackSuccess(enemy, player);
                if (success) {
                    System.out.println("You successes your attack!");
                    enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
                    System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
                    System.out.println(enemy.getHealthPoints());
                    fightResult(enemy, player);
                    break outerloop2;
                } else {
                    System.out.println("You have failed, now is your enemy's turn!");
                    for (int j = 0; j < 10; j++) {
                        success = attackSuccess(enemy, player);
                        if (success) {
                            System.out.println("Your enemy successes their attack!");
                            player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
                            System.out.println("The enemy makes you " + fightDamage(enemy, player) + " points of damage!");
                            System.out.println(player.getHealthPoints());
                            fightResult(enemy, player);
                            break outerloop2;
                        }
                        System.out.println("Your enemy has failed, they will try again!");
                    }
                }
            }
        }
    }

    public static void fightResult(NPC enemy, Player player) {
        if (player.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
        else if (enemy.getHealthPoints() <= 0) {
            player.setLevel(player.getLevel() + 1);
            System.out.println("You have leveled up! Your level is now " + player.getLevel());
            player.setHealthPoints(player.getHealthPoints() + 50);
            player.setStrength(player.getStrength() + 5);
            player.setDefense(player.getDefense() + 5);
            player.setSpeed(player.getSpeed() + 5);
            System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense() + ", your speed is "
                    + player.getSpeed() + " and you have " + player.getHealthPoints() + " HP");
            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
        } else {
            System.out.println("You need to attack again");
            fightDevelopment(enemy, player);
        }
    }

    public static boolean attackSuccess(Character attacker, Character defender) {
        Random r = new Random();
        int result = r.nextInt(15 - 1) + 1;
        return ((attacker.getDexterity() - defender.getDexterity()) > result);
    }

    public static int fightDamage(Character attacker, Character defender) {
        return (attacker.getStrength() * (attacker.getStrength() / defender.getDefense()) + 5);
    }

}
