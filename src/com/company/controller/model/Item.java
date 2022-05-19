package com.company.controller.model;

public class Item {
    private String name;
    private String inventoryName;
    private String type;
    private String description;
    private int price;
    private int index;
    private int strength; // additional attack
    private int speed ;   // additional speed
    private int defense;  // additional defense

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Item(){
    }

    public Item(String name , String inventoryName , String type , String description , int price, int strength,int defense,int speed){
        this.name = name;
        this.inventoryName = inventoryName;
        this.type = type;
        this.description = description;
        this.price = price;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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
                ", price=" + price + '\'' +
                ", index=" + index +
                '}';
    }
}
