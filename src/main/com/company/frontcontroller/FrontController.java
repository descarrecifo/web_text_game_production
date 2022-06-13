package main.com.company.frontcontroller;

import main.com.company.model.Player;
import main.com.company.controller.FightController;
import main.com.company.view.InventoryView;
import main.com.company.view.ShopView;

import static main.com.company.view.CharacterView.character;
import static main.com.company.view.CharacterView.createCharacter;
import static main.com.company.view.CraftView.crafting;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1": {
                createCharacter();
                break;
            }
        }
    }

    public static void gameLoopController(String value, Player player) {
        switch (value) {
            case "1": {
                FightController.fighting(player);
                break;
            }
            case "2": {
                InventoryView.inventoryUseItem(player);
                break;
            }
            case "3": {
                character(player);
                break;
            }
            case "4": {
                ShopView.shopping(player);
                break;
            }
            case "5": {
                crafting(player);
                break;
            }
        }
    }
}
