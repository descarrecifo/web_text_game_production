package com.company.controller.model;

import com.company.model.Character;
import com.company.model.Equipment;
import com.company.model.Inventory;
import com.company.model.Item;

import java.util.HashMap;

public class Player extends Character {
    private Inventory inventory;
    private Equipment equipmentHabilities;
    HashMap<String, com.company.model.Item> equipment;

    public Player(String name, int level, Inventory inventory, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass,HashMap <String, com.company.model.Item> equipment){
        super(name, level, healthPoints, strength, defense, speed, dexterity, charClass);
        this.inventory = inventory;
        this.equipment = new HashMap<>();
        this. equipmentHabilities = new Equipment();
    }

    public Equipment getEquipmentHabilities() {
        return equipmentHabilities;
    }

    public void setEquipmentHabilities(Equipment equipmentHabilities) {
        this.equipmentHabilities = equipmentHabilities;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public HashMap<String, com.company.model.Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<String, Item> equipment) {
        this.equipment = equipment;
    }
}
