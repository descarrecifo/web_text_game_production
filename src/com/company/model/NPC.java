package com.company.model;

public class NPC extends Character {
    private Item treasure;

    public NPC(String name, int level, Item treasure, int maxHealthPoints, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money) {
        super(name, level, maxHealthPoints, healthPoints, strength, defense, speed, dexterity, charClass, money);
        this.treasure = treasure;
    }

    public Item getTreasure() {
        return treasure;
    }

    public void setTreasure(Item treasure) {
        this.treasure = treasure;
    }
}
