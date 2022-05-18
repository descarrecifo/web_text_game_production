
package com.company.view;

import com.company.model.Player;

import java.util.concurrent.atomic.AtomicInteger;

import static com.company.utils.Utilities.*;

public class EquippmentView {

    public static void showEquippmentView(Player player) {
        System.out.println(player.getEquipment());
        if(!player.getEquipment().isEmpty()){
            AtomicInteger i = new AtomicInteger(1);
            System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                       " + BRONZE_UNDERLINED + "EQUIPMENT" + ANSI_RESET + "                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);

            player.getEquipment().forEach((k, v) -> {

                System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + " " + i.getAndIncrement() + ". Name: " + YELLOW_BRIGHT
                        + v.getInventoryName() + ANSI_RESET + " | Quantity: x" + YELLOW_BRIGHT  + ANSI_RESET + "               " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n"
                        + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Description: " + YELLOW_BRIGHT + v.getDescription() + ANSI_RESET + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                if (v.getItemHabilities().get("attack") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Attack: " + YELLOW_BRIGHT + v.getItemHabilities().get("attack") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                if (v.getItemHabilities().get("defense") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Defense: " + YELLOW_BRIGHT + v.getItemHabilities().get("defense") + "                                        " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                if (v.getItemHabilities().get("speed") != 0) {
                    System.out.format(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "    Speed: " + YELLOW_BRIGHT + v.getItemHabilities().get("speed") + "                                         " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "\n");
                }
                System.out.println(ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET + "                                                      " + ANSI_BRONZE_BACKGROUND + " " + ANSI_RESET);
            });
            System.out.println(ANSI_BRONZE_BACKGROUND + "                                                        " + ANSI_RESET);
            System.out.println(" ");
        } else {
            System.out.println("Equippment is empty");
        }
    }
}

