
package com.company.view;

import com.company.model.Player;
import com.company.service.EquipmentService;

import static com.company.utils.Utilities.*;

public class EquipmentView {

    public static void showEquipmentView(Player player) {

        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "         " + BRONZE_UNDERLINED + "EQUIPMENT" + ANSI_RESET + "         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                           " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
        if (player.getEquipment().getQuantityEquippedItems() == 0)
            System.out.println("You don't have any equipment");
        else {
            for (int i = 1; i <= player.getEquipment().getQuantityEquippedItems(); i++) {
                System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "You have a " + YELLOW_BRIGHT + player.getEquipment().getEquipments().get(String.valueOf(i)).getName() + ANSI_RESET + " " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            }
        }
        System.out.println(ANSI_BRONZE_BACKGROUND + "                             " + ANSI_RESET);
    }
}

