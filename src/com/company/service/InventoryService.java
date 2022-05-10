package com.company.service;

import com.company.model.Item;

import java.util.HashMap;
import java.util.Random;

public class InventoryService {

    public static Item createItem() {
        int value = new Random().nextInt((5 - 1) + 1);

        Item reward = new Item();


        HashMap<String, Integer> itemHabilities = new HashMap<>();

        switch (value) {
            case 1 ->{
                itemHabilities.put("attack" , 5);
                itemHabilities.put("defense" , 4);
                itemHabilities.put("speed" , 1);
                reward = new Item("Tunic" , "Tunic         " , "cloth" , "A simple tunic                       " , 2 , itemHabilities);
            }
            case 2 -> {
                itemHabilities.put("attack" , 7);
                itemHabilities.put("defense" , 4);
                itemHabilities.put("speed" , 2);
                reward = new Item("Wooden stick" , "Wooden stick  " , "weapon" , "A simple stick made of wood          " , 1 , itemHabilities);
            }
            case 3 -> {

                itemHabilities.put("attack" , 10);
                itemHabilities.put("defense" , 5);
                itemHabilities.put("speed" , 4);
                reward = new Item("Sword" , "Sword         " , "weapon" , "A simple sword                       " , 7 , itemHabilities);
            }
            case 4 ->{
                itemHabilities.put("attack" , 5);
                itemHabilities.put("defense" ,3);
                itemHabilities.put("speed" , 1);
                reward = new Item("Bow" , "Bow           " , "weapon" , "A simple bow                         " , 4 , itemHabilities);
            }
            default ->{
                itemHabilities.put("attack" , 5);
                itemHabilities.put("defense" , 3);
                itemHabilities.put("speed" , 1);
                reward = new Item("Healing herb" , "Healing herb  " , "herb" , "This herb has medicinal capabilities " , 1 , itemHabilities);
            }
        }
        return reward;
    }

    public static boolean compareItems(HashMap<Item, Integer> items , Item newItemToAdd) {
        return items.containsKey(newItemToAdd);

    }
}








