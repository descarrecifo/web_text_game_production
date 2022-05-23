package com.company.service;

import com.company.model.Item;
import com.company.model.Player;
import com.company.view.EquipmentView;

import static com.company.service.CharacterService.setPlayerTotalCharacteristics;

// Check numbers items Equipment and add items Equipment <= 10
public class EquipmentService {
    public static void equippingPlayer(Player player, Item item) {
//        if((player.getEquipmentHabilities().getNumItemsEquipment())==10){
//            System.out.println("*******************************");
//            System.out.println("You have reached a maximum of 10 equipped items.");
//            System.out.println("*******************************");
//        } else {
        player.getEquipment().setQuantityEquippedItems(player.getEquipment().getQuantityEquippedItems() + 1);
        player.getEquipment().getEquipments().put(String.valueOf(player.getEquipment().getQuantityEquippedItems()), item);
        setEquipmentTotalCharacteristics(player,player.getEquipment().getQuantityEquippedItems());
//        }
    }

    public static void setEquipmentTotalCharacteristics(Player player, int indexItemEquipment) {
        player.getEquipment().setTotalStrenght(player.getEquipment().getEquipments().get(String.valueOf(indexItemEquipment)).getStrength() + player.getEquipment().getTotalStrenght());
        player.getEquipment().setTotalDefense(player.getEquipment().getEquipments().get(String.valueOf(indexItemEquipment)).getDefense() + player.getEquipment().getTotalDefense());
        player.getEquipment().setTotalSpeed(player.getEquipment().getEquipments().get(String.valueOf(indexItemEquipment)).getSpeed() + player.getEquipment().getTotalSpeed());
        setPlayerTotalCharacteristics(player);
    }
}
