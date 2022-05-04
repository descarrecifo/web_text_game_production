package com.company.service;

import com.company.model.Character;
import com.company.model.NPC;
import com.company.model.Player;

import java.util.Random;

import static com.company.controller.CharacterController.createPlayer;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.view.IOView.optionsMainMenu;

public class FightService {

    public static void fightResult(NPC enemy, Player player, int playerLevel) {

        int enemyDamage = (enemy.getStrength() * (enemy.getStrength() / player.getDefense()))+5;

        int playerDamage = (player.getStrength() * (player.getStrength() / enemy.getDefense()))+5;
        if (player.getSpeed() <= enemy.getSpeed()) {
            player.setHealthPoints(player.getHealthPoints() - enemyDamage);
            System.out.println("The enemy makes you " + enemyDamage + " points of damage!");
            System.out.println(player.getHealthPoints());
            enemy.setHealthPoints(enemy.getHealthPoints() - playerDamage);
            System.out.println("You makes " + playerDamage + " points of damage to your enemy!");
            System.out.println(enemy.getHealthPoints());
        }else{
            enemy.setHealthPoints(enemy.getHealthPoints() - playerDamage);
            System.out.println("You makes " + playerDamage + " points of damage to your enemy!");
            System.out.println(enemy.getHealthPoints());
            player.setHealthPoints(player.getHealthPoints() - enemyDamage);
            System.out.println("The enemy makes you " + enemyDamage + " points of damage!");
            System.out.println(player.getHealthPoints());
        }


        if (player.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
        else if (enemy.getHealthPoints() <= 0) {
            player.setLevel(player.getLevel()+1);
            System.out.println("You have leveled up! Your level is now " + player.getLevel());
            player.setHealthPoints(player.getHealthPoints() + 50);
            player.setStrength(player.getStrength() + 5);
            player.setDefense(player.getDefense() + 5);
            player.setSpeed(player.getSpeed() + 5);
            System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense()+", your speed is "
                    +player.getSpeed()+" and you have "+player.getHealthPoints()+" HP");
            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
        } else{
            System.out.println("You need to attack again");
            fightResult(enemy, player, playerLevel);
        }
    }

//    public static int enemyLevel(Character player) {
//        int playerLevel = player.getLevel();
//        int enemyLevel;
//
//        if (playerLevel <= 5) {
//            enemyLevel = playerLevel;
//        } else {
//            enemyLevel = new Random().nextInt(((playerLevel + 1) - (playerLevel - 1)) + 1) + playerLevel;
//        }
//        return enemyLevel;
//    }
//
//    public static void fightDevolving(NPC enemy, Player player, int playerLevel) {
//        if (player.getSpeed() <= enemy.getSpeed()) {
////            for (int i = 0; i < 10; i++) {
////                if (attackSuccessLoop(enemy, player, player, enemy, playerLevel) == true) {
////                    damageVerification(enemy, player, player, enemy, playerLevel);
////                } else {
////                    if (attackSuccessLoop(player, enemy, player, enemy, playerLevel) == true) {
////                        damageVerification(player, enemy, player, enemy, playerLevel);
////                    }
////                }
////            }
//            damageVerification(enemy, player, player, enemy, playerLevel);
//
////            if(attackSuccessLoop(enemy, player,  player, enemy, playerLevel) == true){
////                damageVerification(enemy, player, player, enemy, playerLevel);
////            }else{
////                if(attackSuccessLoop(player, enemy,  player, enemy, playerLevel) == true){
////                    damageVerification(player, enemy, player, enemy, playerLevel);
////                }else{
////                    System.out.println("The 2 had failed!");
////                }
////            }
//        } else {
////            for (int i = 0; i < 10; i++) {
////                if (attackSuccessLoop(player, enemy, player, enemy, playerLevel) == true) {
////                    damageVerification(player, enemy, player, enemy, playerLevel);
////                } else {
////                    if (attackSuccessLoop(enemy, player, player, enemy, playerLevel) == true) {
////                        damageVerification(enemy, player, player, enemy, playerLevel);
////                    }
////                }
////            }
//            damageVerification(player, enemy, player, enemy, playerLevel);
//        }
////            if (attackSuccess(player, enemy)) {
////                player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
////                System.out.println("The enemy makes you " + fightDamage(enemy, player) + " points of damage!");
////                System.out.println(player.getHealthPoints());
////                if (player.getHealthPoints() <= 0) fightResult(enemy, player, playerLevel);
////                else {
////                    if (attackSuccess(enemy, player)) {
////                        enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
////                        System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
////                        System.out.println(enemy.getHealthPoints());
////                        fightResult(enemy, player, playerLevel);
////                    }else{
////                        System.out.println("Your enemy missed their attack!");
////                        fightDamage(player, enemy);
////                    }
////                }
////            }
////            else{
////                System.out.println("You missed your attack!");
////                fightDamage(enemy, player);
////            }
////        } else {
////            if (attackSuccess(enemy, player)) {
////                enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
////                System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
////                System.out.println(enemy.getHealthPoints());
////                if (enemy.getHealthPoints() <= 0) fightResult(enemy, player, playerLevel);
////                else {
////                    if (attackSuccess(player, enemy)) {
////                        player.setHealthPoints(player.getHealthPoints() - fightDamage(enemy, player));
////                        System.out.println("The enemy makes you " + fightDamage(enemy, player) + " points of damage!");
////                        System.out.println(player.getHealthPoints());
////                        fightResult(enemy, player, playerLevel);
////                    }else{
////                        System.out.println("You missed your attack!");
////                        fightDamage(enemy, player);
////                    }
////                }
////            }else{
////                System.out.println("Your enemy missed their attack!");
////                fightDamage(player, enemy);
////            }
////        }
//    }
//
//    public static void fightResult(NPC enemy, Player player, int playerLevel) {
//        if (player.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
//        else if (enemy.getHealthPoints() <= 0) {
//            player.setLevel(player.getLevel() + 1);
//            System.out.println("You have leveled up! Your level is now " + player.getLevel());
//            player.setHealthPoints(player.getHealthPoints() + 50);
//            player.setStrength(player.getStrength() + 5);
//            player.setDefense(player.getDefense() + 5);
//            player.setSpeed(player.getSpeed() + 5);
//            System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense() + ", your speed is "
//                    + player.getSpeed() + " and you have " + player.getHealthPoints() + " HP");
//            player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
//        } else {
//            System.out.println("You need to attack again");
//            fightDevolving(enemy, player, playerLevel);
//        }
//    }
//
//    public static boolean attackSuccess(Character attacker, Character defender) {
//        Random r = new Random();
//        int result = r.nextInt(10 - 1) + 1;
//        return ((attacker.getDexterity() - defender.getDexterity()) > result);
//    }
//
//    public static boolean attackSuccessLoop(Character attacker, Character defender, Player player, NPC enemy, int playerLevel){
////        while (true){
//            if (attackSuccess(attacker, defender)) {
//                return true;
////                System.out.println("The attacker success the attack");
////                damageVerification(attacker, defender, player, enemy, playerLevel);
//            }else{
//                return false;
////                System.out.println("The defender success the attack");
////                damageVerification(defender, attacker, player, enemy, playerLevel);
//            }
////            break;
////        }
//    }
//
//    public static int fightDamage(Character attacker, Character defender){
//        return (defender.getHealthPoints() - (attacker.getStrength() * (attacker.getStrength() / defender.getDefense())) + 5);
//    }
//
//    public static void damageVerification(Character attacker, Character defender, Player player, NPC enemy, int playerLevel){
//        int damage = fightDamage(attacker, defender);
//        defender.setHealthPoints(defender.getHealthPoints() - fightDamage(attacker, defender));
//        System.out.println(attacker.getName()+" makes " + damage + " points of damage!");
//        System.out.println(attacker.getHealthPoints());
//        fightResult(enemy, player, playerLevel);
////        if(attacker.equals(player)){
////            if (attacker.getHealthPoints() <= 0) optionsMainMenu(createPlayer());
////            else if (defender.getHealthPoints() <= 0) {
////                player.setLevel(playerLevel++);
////                System.out.println("You have leveled up! Your level is now " + player.getLevel());
////                player.setHealthPoints(player.getHealthPoints() + 50);
////                player.setStrength(player.getStrength() + 5);
////                player.setDefense(player.getDefense() + 5);
////                System.out.println("You're stronger! Now your strength is " + player.getStrength() + ", your defense is " + player.getDefense()+" and you have "+player.getHealthPoints()+" HP");
////                player.setInventory(addItemToInventory(player.getInventory().getItems(), player.getInventory()));
////            } else{
////                System.out.println("You need to attack again");
////                damageVerification( attacker,  defender,  player,  enemy,  playerLevel);
////            }
////        }else{
////            if (enemy.getHealthPoints() <= 0) fightResult(enemy, player, playerLevel);
////            else {
////                if (attackSuccess(enemy, player)) {
////                    enemy.setHealthPoints(enemy.getHealthPoints() - fightDamage(player, enemy));
////                    System.out.println("You makes " + fightDamage(player, enemy) + " points of damage to your enemy!");
////                    System.out.println(enemy.getHealthPoints());
////                    fightResult(enemy, player, playerLevel);
////                }else{
////                    System.out.println("Your enemy missed their attack!");
////                    fightDamage(player, enemy);
////                }
////            }
////        }
//    }
}
