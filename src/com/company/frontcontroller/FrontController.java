package com.company.frontcontroller;

import com.company.model.Player;
import com.company.view.CharacterView;

import static com.company.controller.FightController.fighting;
import static com.company.view.IOView.*;
import static com.company.view.InventoryView.inventoryUseItem;


public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> createCharacter();
        }
    }

    public static void gameLoopController(String value , Player player) {
        switch (value) {
            case "1" -> fighting(player);
            case "2" -> inventoryUseItem(player);
            case "3" -> CharacterView.menuCharacterChoose(player);
        }
    }



}