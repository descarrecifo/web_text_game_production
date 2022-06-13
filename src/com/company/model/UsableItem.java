package com.company.model;

public class UsableItem extends Item{
    String use;
    int value;

    public UsableItem(){

    }
    public UsableItem(String use, int value) {
        this.use = use;
        this.value = value;
    }

    public UsableItem(String name, String type, String description, int price, int quantity, String use, int value) {
        super(name, type, description, price, quantity);
        this.use = use;
        this.value = value;
    }
}
