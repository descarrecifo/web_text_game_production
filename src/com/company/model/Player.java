package com.company.model;

import java.util.HashMap;

public class Player extends Character {
  private Inventory inventory;
  HashMap<String,Item> equipment;

    public Player(String name, int level, Inventory inventory) {
        super(name, level);
        this.inventory = inventory;
       // this.equipment = new HashMap<>();

    }



    public Player(String name, int level, Inventory inventory, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass,HashMap <String,Item> equipment){
        super(name, level, healthPoints, strength, defense, speed, dexterity, charClass);
        this.inventory = inventory;
        this.equipment = new HashMap<>();

    }





    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public HashMap<String, Item> getEquipment() {
        return equipment;
    }

    public void setEquipment(HashMap<String, Item> equipment) {
        this.equipment = equipment;
    }
}
