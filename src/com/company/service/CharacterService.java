package com.company.service;

import com.company.model.NPC;
import com.company.model.Player;

import static com.company.view.CharacterView.moneyMessage;

public class CharacterService {

    public static void addingMoney(Player player, NPC enemy){
        player.setMoney(player.getMoney() + enemy.getMoney());
        if(enemy.getMoney()>0) moneyMessage("1", player, enemy);
    }

    public static void setPlayerTotalCharacteristics(Player player) {
        player.setTotalStrength(player.getEquipment().getTotalStrenght() + player.getStrength());
        player.setTotalDefense(player.getEquipment().getTotalDefense() + player.getDefense());
        player.setTotalSpeed(player.getEquipment().getTotalSpeed() + player.getSpeed());
    }
}
