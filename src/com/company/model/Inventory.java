package com.company.model;

import java.util.HashMap;

public class Inventory {
    private int capacity;
    private HashMap<Item, Integer> items;

    public Inventory(HashMap<Item, Integer> items, int capacity) {
        this.items = new HashMap<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Item, Integer> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                ", capacity=" + capacity +
                '}';
    }
}
