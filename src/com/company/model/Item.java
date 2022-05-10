package com.company.model;

import java.util.HashMap;

public class Item {
    private String name;
    private String inventoryName;
    private String type;
    private String description;
    private int price;
    private HashMap<String, Integer> itemHabilities;
    private int index;

    public Item(){
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Item(String name , String inventoryName , String type , String description , int price , HashMap<String, Integer> itemHabilities){
        this.name = name;
        this.inventoryName = inventoryName;
        this.type = type;
        this.description = description;
        this.price = price;
       // this.itemHabilities = new HashMap<String, Integer>();
        this.itemHabilities = itemHabilities;
    }

    public HashMap<String, Integer> getItemHabilities() {
        return itemHabilities;
    }

    public void setItemHabilities(HashMap<String, Integer> itemHabilities) {
        this.itemHabilities = itemHabilities;
    }



    public String getName() {
        return name;
    }

    public String getInventoryName() { return inventoryName; }

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

    public void setInventoryName(String inventoryName) { this.inventoryName = inventoryName; }

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
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Item item = (Item) o;

        if (!name.equals(item.name)) {
            return false;
        }
        if (!type.equals(item.type)) {
            return false;
        }
        if (!description.equals(item.description)) {
            return false;
        }
        if (price != (item.price)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 42 * result + price;
        return result;
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
