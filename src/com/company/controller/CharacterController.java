package com.company.controller;

import com.company.model.Character;
import com.company.model.Inventory;
import com.company.model.Item;
import com.company.model.Player;
import com.company.utils.Utilities;

import java.util.HashMap;
import java.util.Scanner;

import static com.company.view.IOView.OptionsMenuNewGame;
//import static com.company.view.Menu.chooseCharClass;
import static com.company.view.IOView.optionsMainMenu;
import static com.company.view.Menu.menuNewGameView;

public class

CharacterController {

    public static void createPlayer(String name , String charclass) {
        HashMap<Item, Integer> items = new HashMap<>();
        Inventory playerInventory = new Inventory(items, 10);

        switch (charclass){
            case "Guerrero" -> {Player player = new Player("Player", 1, playerInventory);
                Item newItem = new Item("Tunic", "cloth", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }

            case "Mago" ->  {Player player = new Player("Player", 1, playerInventory);
                Item newItem = new Item("Tunic1", "cloth2", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }

            case "Cazador" ->  {Player player = new Player("Player", 1, playerInventory);
                Item newItem = new Item("Tunic2", "cloth3", "A simple tunic", 2);
                items.put(newItem, 1);
                player.getInventory().setItems(items);
                OptionsMenuNewGame(player);
            }
        }


    }

    /*public static void createCharacter(Scanner scanner){
        System.out.println("Create Character");
        String name = Utilities.ask(scanner,"Name?");
        chooseCharClass();

        String charClass= Utilities.ask(scanner,"CharClass?");
        System.out.println("Eres " + name + " un " + charClass + "." + " Preparate para tu gran aventura!");


    }*/

}
