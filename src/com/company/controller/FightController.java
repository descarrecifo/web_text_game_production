package com.company.controller;

import com.company.model.Character;

public class FightController {

    public static void fightResult(int level, Character player) {

        if(level>player.getLevel()){
            System.out.println("The enemy is stronger than you. You lose!");
        }else{
            System.out.println("You are stronger than your enemy. You win!");
        }
    }
}


