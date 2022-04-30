package com.company;
import static com.company.view.IOView.mainLoopView;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

import static com.company.controller.FightController.fightResult;
import static com.company.controller.InventoryController.addItemToInventory;
import static com.company.service.FightService.enemyLevel;
import static com.company.service.InventoryService.createItem;

public class Main {

    public static void main(String[] args) {

        //we are starting the main loop
        mainLoopView();

    }
}
