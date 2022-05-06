package com.company.frontcontroller;

import com.company.model.Player;

import static com.company.controller.FightController.fighting;
import static com.company.view.InventoryView.showInventory;

public class FrontController {
    public static void mainLoopController(String value, Player player) {
//       Player player;
//       isCreated() ? player = fighting(player)  : player = createPlayer();
        switch (value) {
            case "1" -> fighting(player);
            case "2" -> showInventory(player);
        }
    }

//    public static boolean isCreated(){
//        Player player = null;
//        if(player == null){
//            return false;
//        }else{
//            return true;
//        }
//    }
}
