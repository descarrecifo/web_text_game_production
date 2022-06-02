package com.company.model;

import java.util.HashMap;
import java.util.List;

public class Inventory {
    private int capacity;
    private List<Item> items;

    public Inventory(List<Item> items, int capacity) {
        this.items = items;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
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
