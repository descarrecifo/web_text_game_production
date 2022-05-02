package com.company.model;
import com.company.model.Item;

public class NPC extends Character {
 private Item treasure;

    public NPC(String name, int level, Item treasure) {
        super(name, level);
        this.treasure = treasure;
    }
}
