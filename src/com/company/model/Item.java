package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Item {
    private String name;
    private String type;
    private String description;
    private int price;
    //ArrayList<String> characteristic;
    //www3schools.com/java/java_hashmap.asp
     HashMap<String,String> itemHabilities;


    public Item(String name , String type , String description , int price , HashMap<String, String> itemHabilities) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.itemHabilities = itemHabilities;
    }

    public Item(String name, String type, String description, int price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.itemHabilities = new HashMap<>();
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

    public HashMap<String, String> getItemHabilities() {
        return itemHabilities;
    }

    public void setItemHabilities(HashMap<String, String> itemHabilities) {
        this.itemHabilities = itemHabilities;
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
