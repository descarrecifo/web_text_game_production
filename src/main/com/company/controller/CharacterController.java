package main.com.company.controller;


import main.com.company.model.*;
import main.com.company.service.CharacterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static main.com.company.service.InventoryService.createItem;

public class CharacterController {

    public static Player createPlayer(String name, String charClass) {

        Player newPlayer = new Player();
        switch (charClass) {

//                newPlayer = CharacterService.createPlayer(items, newItem, player, playerInventory);

            }

        return newPlayer;
    }

    public static NPC createEnemyPlaceholder(int playerLevel) {
        NPC enemy;

        int value = new Random().nextInt((11 - 1) + 1);

        Item fur = new Item("Fur", "material", "The fur of an wild animal", 1, 1);
        Item clay = new Item("Clay", "material", "A handful of clay", 1, 1);

        switch (value) {
            case 1: {
                enemy = new NPC("Goblin", 5, createItem(), 20, 20, 20, 5, 25, 25, null, 5, 5, 0);
                break;
            }
            case 2: {
                enemy = new NPC("Wolf", 5, fur, 10, 10, 10, 15, 35, 5, "beast", 0, 5, 0);
                break;
            }
            case 3: {
                enemy = new NPC("Burglar", 5, createItem(), 25, 25, 15, 15, 15, 15, null, 20, 5, 0);
                break;
            }
            case 4: {
                enemy = new NPC("Witch", 5, createItem(), 20, 20, 10, 15, 25, 15, null, 5, 5, 0);
                break;
            }
            case 5: {
                enemy = new NPC("Ratman", 5, fur, 25, 25, 20, 10, 20, 10, "beast", 0, 5, 0);
                break;
            }
            case 6: {
                enemy = new NPC("Wild boar", 5, fur, 10, 10, 10, 10, 25, 10, "beast", 0, 5, 0);
                break;
            }
            case 7: {
                enemy = new NPC("Vampire", 5, createItem(), 40, 40, 20, 10, 15, 15, null, 10, 5, 0);
                break;
            }
            case 8: {
                enemy = new NPC("Wendigo", 5, fur, 25, 25, 25, 5, 25, 5, "beast", 0, 5, 0);
                break;
            }
            case 9: {
                enemy = new NPC("Golem", 5, clay, 45, 45, 35, 25, 10, 10, null, 0, 5, 0);
                break;
            }
            case 10: {
                enemy = new NPC("Cave lion", 5, fur, 15, 15, 15, 15, 25, 5, "beast", 0, 5, 0);
                break;
            }
            default: {
                enemy = new NPC("Soldier", 5, createItem(), 50, 50, 25, 15, 5, 20, null, 15, 5, 0);
                break;
            }
        }
        return enemy;
    }

}



