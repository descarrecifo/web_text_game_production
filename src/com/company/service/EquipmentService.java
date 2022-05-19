package com.company.service;

import com.company.model.Item;
import com.company.model.Player;
import com.company.view.EquipmentView;

// Check numbers items Equipment and add items Equipment <= 10
public class EquipmentService {
    public static void equippingPlayer(Player player , Item item) {
        if((player.getEquipmentHabilities().getNumItemsEquipment())==10){
            System.out.println("*******************************");
            System.out.println("You have reached a maximum of 10 equipped items.");
            System.out.println("*******************************");
        } else {
            // add index number items equipment
            player.getEquipmentHabilities().setNumItemsEquipment(player.getEquipmentHabilities().getNumItemsEquipment()+1);

            // show number items equipment
            System.out.println("Num items equipment: "+ player.getEquipmentHabilities().getNumItemsEquipment());

            // add item to equipment
            player.getEquipment().put(String.valueOf(player.getEquipmentHabilities().getNumItemsEquipment()), item);

            // show equipment
            EquipmentView.showEquipmentPlayer(player);
        }
    }

// Sum total strenght, defense and speed
    public static void sumHabilitiesEquipment(Player player, int indexItemEquipment) {
        // add attack to total strenght
        player.getEquipmentHabilities().setSumStrenghtEquipment(player.getEquipment().get(String.valueOf(indexItemEquipment)).getStrength() + player.getEquipmentHabilities().getSumStrenghtEquipment());

        // add defense to total defense
        player.getEquipmentHabilities().setSumDefenseEquipment(player.getEquipment().get(String.valueOf(indexItemEquipment)).getDefense() + player.getEquipmentHabilities().getSumDefenseEquipment());

        // add speed to total speed
        player.getEquipmentHabilities().setSumSpeedEquipment(player.getEquipment().get(String.valueOf(indexItemEquipment)).getSpeed() + player.getEquipmentHabilities().getSumSpeedEquipment());
    }
}
