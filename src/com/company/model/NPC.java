package com.company.model;
import com.company.model.Item;

public class NPC extends Character {
 private Item treasure;

    public NPC(String name, int level, Item treasure, int healthPoints, int attack, int defense, int speed, int dexterity, String charClass) {
        super(name, level, healthPoints, attack, defense, speed, dexterity, charClass);
        this.treasure = treasure;
    }
}
