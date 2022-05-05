package com.company.service;

import com.company.model.Character;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.view.FightView.fightingMessages;
import static com.company.view.IOView.optionsMainMenu;

public class FightService {

    public static void fightDevelopment(NPC enemy, Player player) {
        //TODO change the for-loop to a while(true)
        if (player.getSpeed() <= enemy.getSpeed()) {
            outerloop1:
            for (int i = 0; i < 10; i++) {
                boolean success = attackSuccess(enemy, player);
                if (success) {
                    fightingMessages("1", enemy, player);
                    player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
                    fightingMessages("3", enemy, player);
                    //System.out.println(player.getHealthPoints());
                    fightResult(enemy, player);
                    break outerloop1;
                } else {
                    fightingMessages("5", enemy, player);
                    for (int j = 0; j < 10; j++) {
                        success = attackSuccess(enemy, player);
                        if (success) {
                            fightingMessages("2", enemy, player);
                            enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
                            fightingMessages("4", enemy, player);
                            //System.out.println(enemy.getHealthPoints());
                            fightResult(enemy, player);
                            break outerloop1;
                        }
                        fightingMessages("7", enemy, player);
                    }
                }
            }
        } else {
            outerloop2:
            for (int i = 0; i < 10; i++) {
                boolean success = attackSuccess(enemy, player);
                if (success) {
                    fightingMessages("2", enemy, player);
                    enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
                    fightingMessages("4", enemy, player);
                    //System.out.println(enemy.getHealthPoints());
                    fightResult(enemy, player);
                    break outerloop2;
                } else {
                    fightingMessages("6", enemy, player);
                    for (int j = 0; j < 10; j++) {
                        success = attackSuccess(enemy, player);
                        if (success) {
                            fightingMessages("1", enemy, player);
                            player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
                            fightingMessages("3", enemy, player);
                            //System.out.println(player.getHealthPoints());
                            fightResult(enemy, player);
                            break outerloop2;
                        }
                        fightingMessages("8", enemy, player);
                    }
                }
            }
        }
    }

    public static void fightResult(NPC enemy, Player player) {
        if (player.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
        else if (enemy.getHealthPoints() <= 0) {
            player.setLevel(player.getLevel() + 1);
            fightingMessages("9", enemy, player);
            player.setHealthPoints(player.getHealthPoints() + 50);
            player.setStrength(player.getStrength() + 5);
            player.setDefense(player.getDefense() + 5);
            player.setSpeed(player.getSpeed() + 5);
            fightingMessages("10", enemy, player);
            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
        } else {
            fightingMessages("11", enemy, player);
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
