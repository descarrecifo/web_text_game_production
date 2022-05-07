package com.company.frontcontroller;

import com.company.model.Player;

import static com.company.controller.FightController.fighting;
import static com.company.view.IOView.createCharacter;
import static com.company.view.IOView.finishGameView;
import static com.company.view.InventoryView.showInventory;

public class FrontController {
    public static void mainLoopController(String value) {
        switch (value) {
            case "1" -> createCharacter();
            case "2" -> finishGameView();
        }
    }
    public  static void gameLoopController(String value, Player player){
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
