package com.company.service;

import com.company.model.Player;

public class CharacterService {
    public static void habilitiesPlayerWithItems(Player player) {

        // sum total items with strenght Player
        player.setTotalStrength(player.getEquipmentHabilities().getSumStrenghtEquipment() + player.getStrength());

        // sum total items with defense Player
        player.setTotalDefense(player.getEquipmentHabilities().getSumDefenseEquipment() + player.getDefense());

        // sum total items with speed Player
        player.setTotalSpeed(player.getEquipmentHabilities().getSumSpeedEquipment() + player.getSpeed());
    }
}
