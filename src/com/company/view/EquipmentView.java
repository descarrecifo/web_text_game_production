
package com.company.view;

import com.company.model.Player;
import com.company.service.EquipmentService;

import static com.company.utils.Utilities.*;

public class EquipmentView {

    public static void showEquipmentView(Player player) {

        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "         " + BRONZE_UNDERLINED + "EQUIPMENT" + ANSI_RESET + "         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"                           "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
        if (player.getEquipment().getQuantityEquippedItems() == 0)
            System.out.println("You don't have any equipment");
        else {
            for (int i = 1; i <= player.getEquipment().getQuantityEquippedItems(); i++) {
                System.out.println(ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET+"You have a " + YELLOW_BRIGHT+ player.getEquipment().getEquipments().get(String.valueOf(i)).getName()+ANSI_RESET+" "+ANSI_BRONZE_BACKGROUND+" "+ANSI_RESET);
            }
        }
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
    }

//        public static void showEquipmentPlayer (Player player){
//            // indexItemEquipment is index number Items Equipment
//            int indexItemEquipment = player.getEquipmentHabilities().getNumItemsEquipment();
//
//            System.out.println("*******************************************");
//
//            System.out.println("Add characteristics " + player.getEquipment().get(String.valueOf(indexItemEquipment)).getName());
//            System.out.println("Add Strenght: " + player.getEquipment().get(String.valueOf(indexItemEquipment)).getStrength());
//            System.out.println("Add Defense:  " + player.getEquipment().get(String.valueOf(indexItemEquipment)).getDefense());
//            System.out.println("Add Speed:    " + player.getEquipment().get(String.valueOf(indexItemEquipment)).getSpeed());
//
//            // Sum value of items habilities equipment to total
//            EquipmentService.sumHabilitiesEquipment(player, indexItemEquipment);
//
//            // Show Resum
//            showItemsEquipmentPlayer(player);
//        }

        // Show Sum habilities Items of Equipment
//        public static void showItemsEquipmentPlayer (Player player){
//            System.out.println("********************************************  ");
//            System.out.println("*** Resum: Increased skills due to items ***  ");
//            System.out.format("    Additional strength total per item: " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumStrenghtEquipment() + ANSI_RESET + "\n");
//            System.out.format("    Additional defense total per item:  " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumDefenseEquipment() + ANSI_RESET + "\n");
//            System.out.format("    Additional speed total per item:    " + YELLOW_BRIGHT + player.getEquipmentHabilities().getSumSpeedEquipment() + ANSI_RESET + "\n");
//            System.out.println("********************************************  ");
//        }
    }

