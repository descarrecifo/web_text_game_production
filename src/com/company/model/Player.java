package com.company.model;

import java.util.HashMap;

public class Player extends Character {
    private Inventory inventory;
    private Equipment equipment;


    public Player(String name, int level, Inventory inventory, Equipment equipment, int maxHealthPoints, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money){
        super(name, level, maxHealthPoints, healthPoints, strength, defense, speed, dexterity, charClass, money);
        this.inventory = inventory;
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
