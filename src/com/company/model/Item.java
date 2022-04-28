package com.company.model;

import java.util.ArrayList;

public class Item {
    private String name;
    private String type;
    private String description;
    private int price;
    ArrayList<String> characteristic;

    public Item(String name, String type, String description, int price, ArrayList<String> characteristic) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.characteristic = characteristic;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
