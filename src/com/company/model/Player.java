package com.company.model;

public class Player extends Character {
  private  Inventory inventory;

    public Player(String name, int level, Inventory inventory) {
        super(name, level);
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
