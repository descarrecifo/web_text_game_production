package com.company.model;

public class Item {
    private String description,
            name,
            type;
    private int defense,
            index,
            price,
            speed,
            strength;
    boolean equippable,
            usable;

    public Item() {
    }


    public Item(String name, String type, String description, int price, int strength, int defense, int speed, boolean equippable, boolean usable) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.equippable = equippable;
        this.usable = usable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isEquippable() {
        return equippable;
    }

    public void setEquippable(boolean equippable) {
        this.equippable = equippable;
    }

    public boolean isUsable() {
        return usable;
    }

    public void setUsable(boolean usable) {
        this.usable = usable;
    }

    @Override
    public boolean equals(Object o) {
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
    public int hashCode() {
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
                ", index=" + index + '\'' +
                ", equippable=" + equippable + '\'' +
                ", usable=" + usable + '\'' +
                '}';
    }
}
