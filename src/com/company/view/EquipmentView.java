
package com.company.view;

import com.company.model.Player;
import com.company.service.EquipmentService;

import static com.company.utils.Utilities.*;

public class EquipmentView {

    // Show all Items habilities
    public static void showEquipmentView(Player player) {
        System.out.println("*******************************************");
        System.out.println("**************** EQUIPMENT ****************");

        // If Equipment is not empty
        if(player.getEquipmentHabilities().getNumItemsEquipment()>0){


            for(int i=1; i<= player.getEquipmentHabilities().getNumItemsEquipment(); i++){
                System.out.println("You have an "+player.getEquipment().get(String.valueOf(i)).getName());

            }
            System.out.println("*******************************************");
            System.out.println("    Additional attack total per item:   " + player.getEquipmentHabilities().getSumStrenghtEquipment());
            System.out.println("    Additional defense total per item:  " + player.getEquipmentHabilities().getSumDefenseEquipment());
            System.out.println("    Additional speed total per item:    "  + player.getEquipmentHabilities().getSumSpeedEquipment());

            // In the case, empty
        } else {

            System.out.println("Sorry! Equipment is empty");
        }
        System.out.println("*******************************************");
    }
    // Show habilities Item  and sum total habilities items
    public static void showEquipmentPlayer(Player player) {
        // indexItemEquipment is index number Items Equipment
        int indexItemEquipment= player.getEquipmentHabilities().getNumItemsEquipment();

        System.out.println("*******************************************");

        System.out.println("Add characteristics "+player.getEquipment().get(String.valueOf(indexItemEquipment)).getName());
        System.out.println("Add Strenght: "+player.getEquipment().get(String.valueOf(indexItemEquipment)).getStrength());
        System.out.println("Add Defense:  "+player.getEquipment().get(String.valueOf(indexItemEquipment)).getDefense());
        System.out.println("Add Speed:    "+player.getEquipment().get(String.valueOf(indexItemEquipment)).getSpeed());

        // Sum value of items habilities equipment to total
        EquipmentService.sumHabilitiesEquipment(player,indexItemEquipment);

        // Show Resum
        showItemsEquipmentPlayer(player);
    }

    // Show Sum habilities Items of Equipment
    public static void showItemsEquipmentPlayer(Player player){
        System.out.println("********************************************  ");
        System.out.println("*** Resum: Increased skills due to items ***  ");
        System.out.format("    Additional strength total per item: " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumStrenghtEquipment()  + ANSI_RESET + "\n");
        System.out.format("    Additional defense total per item:  " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumDefenseEquipment()+ ANSI_RESET + "\n");
        System.out.format("    Additional speed total per item:    " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumSpeedEquipment() + ANSI_RESET + "\n");
        System.out.println("********************************************  ");
    }
}

