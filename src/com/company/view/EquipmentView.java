
package com.company.view;

import com.company.model.Player;


public class EquipmentView {

    public static void showEquipmentView(Player player) {

        System.out.println();
        System.out.println("EQUIPMENT");
        System.out.println();
        if (player.getEquipment().getQuantityEquippedItems() == 0)
            System.out.println("You don't have any equipment");
        else {
            for (int i = 1; i <= player.getEquipment().getQuantityEquippedItems(); i++) {
                System.out.println("You have a " + player.getEquipment().getEquipments().get(String.valueOf(i)).getName());
            }
        }
        System.out.println();
    }
}

