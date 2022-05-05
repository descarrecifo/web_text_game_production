package com.company.service;

import com.company.model.Item;

import java.util.HashMap;
import java.util.Random;

public class InventoryService {

    public static Item createItem(){
        int value = new Random().nextInt((4-1)+1);


        Item reward = new Item();

        HashMap<String,String> valueInitals = new HashMap();
        valueInitals.put("attack","5");
        valueInitals.put("defense","3");
        valueInitals.put("speed","1");



        switch (value){
            case 1 -> {
                valueInitals.put("attack","5");
                valueInitals.put("defense","3");
                valueInitals.put("speed","1");
                reward = new Item("Tunic", "cloth", "A simple tunic", 2,valueInitals);
            }
            case 2 -> {
                valueInitals.put("attack" , "7");
                valueInitals.put("defense","4");
                valueInitals.put("speed","2");
                reward = new Item("Wooden stick", "weapon", "A simple stick made of wood", 1,valueInitals);
            }

            case 3 ->{
                    valueInitals.put("attack","10");
                    valueInitals.put("defense","5");
                    valueInitals.put("speed","4");
                    reward = new Item("Sword", "weapon", "A simple sword", 7,valueInitals);
            }
            default -> reward = new Item("Healing herb", "herb", "This herb has medicinal capabilities ", 1,valueInitals);
        }
        return reward;
    }

    public static boolean compareItems(HashMap<Item, Integer> items,Item newItemToAdd){
            return items.containsKey(newItemToAdd);

    }
}
