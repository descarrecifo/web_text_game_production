package com.company.model;

import java.util.HashMap;

public class Equipment {
    private int totalStrenght;
    private int totalDefense;
    private int totalSpeed;
    private int quantityEquippedItems;
    private HashMap<String,Item> equipments;

    public Equipment(int totalStrenght, int totalDefense, int totalSpeed, int quantityEquippedItems, HashMap<String,Item> equipments) {
        this.totalStrenght = totalStrenght;
        this.totalDefense = totalDefense;
        this.totalSpeed = totalSpeed;
        this.quantityEquippedItems = quantityEquippedItems;
        this.equipments = new HashMap<>();

    }

    public int getTotalStrenght() {return totalStrenght;}

    public void setTotalStrenght(int totalStrenght) {this.totalStrenght = totalStrenght;}

    public int getTotalDefense() {return totalDefense;}

    public void setTotalDefense(int totalDefense) {this.totalDefense = totalDefense;}

    public int getTotalSpeed() {return totalSpeed;}

    public void setTotalSpeed(int totalSpeed) {this.totalSpeed = totalSpeed;}

    public int getQuantityEquippedItems() {return quantityEquippedItems;}

    public void setQuantityEquippedItems(int quantityEquippedItems) {this.quantityEquippedItems = quantityEquippedItems;}

    public HashMap<String, Item> getEquipments() {return equipments;}

    public void setEquipments(HashMap<String, Item> equipments) {this.equipments = equipments;}
}
