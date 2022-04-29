package com.company.service;

import com.company.model.Character;

import java.util.Random;

public class FightService {

    public static int enemyLevel(Character player) {
        int playerLevel = player.getLevel();
        int enemyLevel;

       /* if (playerLevel <= 5) {
            enemyLevel = playerLevel;
        } else {*/
            enemyLevel = new Random().nextInt(((playerLevel + 1) - (playerLevel - 1))+1) + playerLevel;
        //}
        return enemyLevel;
    }
}
