package com.company.view;

import com.company.model.Item;
import com.company.model.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.*;

public class InventoryView {
    public static void showInventory(Player player) {
        AtomicInteger i = new AtomicInteger(1);
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                                        "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                       "+BRONZE_UNDERLINED+"INVENTORY"+ANSI_RESET+"                      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                                      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        player.getInventory().getItems().forEach((k, v) -> System.out.format(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+" "+ i.getAndIncrement() + ". Name: " +YELLOW_BRIGHT
                + k.getInventoryName() +ANSI_RESET+ " | Quantity: x" +YELLOW_BRIGHT+ v+ANSI_RESET+"               "+ ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"\n"
                + ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"    Description: "+YELLOW_BRIGHT + k.getDescription()+ANSI_RESET+ ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"\n"
                +ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                                                      "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"\n"+"Attack: "
                +k.getItemHabilities().get("attack")+" Defense "+k.getItemHabilities().get("defense")+" Speed "+k.getItemHabilities().get("speed")));
//                "key: %s, value: %d%n", k, v));
        System.out.println(ANSI_BRONZE_BACKGROUND+"                                                        "+ANSI_RESET);
        System.out.println(" ");
             }

    public static void addItemToInventoryMessage(String value, Item newItem){
        switch (value) {
            case "1" -> System.out.println("Same item: " +YELLOW_BRIGHT+ newItem.getName()+ANSI_RESET);
            case "2" -> System.out.println("New item: " +YELLOW_BRIGHT+ newItem.getName()+ANSI_RESET);
            case "3" -> System.out.println("Your inventory is full, you can't get more items");
        }
    }
}

