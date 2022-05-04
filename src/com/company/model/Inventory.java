package com.company.model;

import java.util.HashMap;

public class Inventory {
    private HashMap<Item, Integer> items;
    private int capacity;

    public Inventory(HashMap<Item, Integer> items, int capacity) {
        this.items = new HashMap<>();
        this.capacity = capacity;
    }

    public HashMap<Item, Integer> getItems() {
        return items;
    }

    public int getCapacity() { return capacity; }

    public void setItems(HashMap<Item, Integer> items) {
        this.items = items;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Inventory{" +
                "items=" + items +
                ", capacity=" + capacity +

                '}';
    }
}
