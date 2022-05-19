package com.company.service;

import com.company.model.Character;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.view.FightView.fightingMessages;
import static com.company.view.IOView.*;

public class FightService {

    public static void initialTurn(NPC enemy, Player player, boolean turn) {
        while (true) {
            if (player.getSpeed() <= enemy.getSpeed()) {
                if (turn) {
                    enemyTurn(enemy, player);
                } else {
                    playerTurn(enemy, player);
                }
            } else {
                if (turn) {
                    playerTurn(enemy, player);
                } else {
                    enemyTurn(enemy, player);
                }
            }
        }
    }

    public static void enemyTurn(NPC enemy, Player player) {
        if (attackSuccess(enemy, player)) {
            fightingMessages("1", enemy, player);
            player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
            fightingMessages("3", enemy, player);
//            System.out.println(player.getHealthPoints());
            fightResult(enemy, player, "player");
        } else {
            fightingMessages("5", enemy, player);
            fightResult(enemy, player, "player");
        }
    }

    public static void playerTurn(NPC enemy, Player player) {
        if (attackSuccess(player, enemy)) {
            fightingMessages("2", enemy, player);
            enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
            fightingMessages("4", enemy, player);
//            System.out.println(enemy.getHealthPoints());
            fightResult(enemy, player, "enemy");
        } else {
            fightingMessages("6", enemy, player);
            fightResult(enemy, player, "enemy");
        }
    }

    public static void fightResult(NPC enemy, Player player, String nextTurn) {
        if (player.getHealthPoints() <= 0) mainLoopView();
        else if (enemy.getHealthPoints() <= 0) {
            levelUp(player);
            fightingMessages("9", enemy, player);
            fightingMessages("10", enemy, player);
            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
            gameLoopView(player);
        } else {
//            fightingMessages("11", enemy, player);
            switch (nextTurn){
                case "enemy" -> enemyTurn(enemy, player);
                case "player" -> playerTurn(enemy, player);
            }
        }
    }

    public static boolean attackSuccess(Character attacker, Character defender) {
        Random r = new Random();
        int dexterityDif = attacker.getDexterity() - defender.getDexterity();
        double maxValue = 15 - dexterityDif / 2;
        double probability;
        if (maxValue <= 0) probability = r.nextDouble(1 - maxValue) + maxValue;
        else probability = r.nextDouble(maxValue - 1) + 1;
        double result = 7.5 + dexterityDif / 2;
        return (result >= probability);
    }

    public static int fightDamage(Character attacker, Character defender) {
        return (attacker.getStrength() * (attacker.getStrength() / defender.getDefense()) + 5);
    }

    public static void levelUp(Player player){
        player.setLevel(player.getLevel() + 1);
        player.setHealthPoints(player.getHealthPoints() + 50);
        player.setStrength(player.getStrength() + 5);
        player.setDefense(player.getDefense() + 5);
        player.setSpeed(player.getSpeed() + 5);
        player.setSpeed(player.getDexterity() + 5);
    }

    public static int valueGained(){
        Random r = new Random();
        return r.nextInt(5-1)+1;
    }

}
