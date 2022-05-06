package com.company.controller;

import com.company.model.NPC;
import com.company.model.Player;

import static com.company.controller.CharacterController.createEnemyPlaceholder;
//import static com.company.service.FightService.fightDevelopment;
import static com.company.service.FightService.initialTurn;

public class FightController {

    public static Player fighting(Player player) {
        NPC enemy = createEnemyPlaceholder();
        System.out.println("Your enemy is a "+enemy.getName());
//        fightDevelopment(enemy, player);
        initialTurn(enemy, player, true);
        return player;
    }
}


