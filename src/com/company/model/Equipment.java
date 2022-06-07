package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Equipment {
    private int quantityEquippedItems,
            totalDefense,
            totalSpeed,
            totalStrenght;
    private List<Item> equipments;

    public Equipment(int totalStrenght, int totalDefense, int totalSpeed, int quantityEquippedItems, List<Item> equipments) {
        this.totalStrenght = totalStrenght;
        this.totalDefense = totalDefense;
        this.totalSpeed = totalSpeed;
        this.quantityEquippedItems = quantityEquippedItems;
        this.equipments = new ArrayList<>();

    }

    public int getQuantityEquippedItems() {
        return quantityEquippedItems;
    }

    public void setQuantityEquippedItems(int quantityEquippedItems) {
        this.quantityEquippedItems = quantityEquippedItems;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public void setTotalDefense(int totalDefense) {
        this.totalDefense = totalDefense;
    }

    public int getTotalSpeed() {
        return totalSpeed;
    }

    public void setTotalSpeed(int totalSpeed) {
        this.totalSpeed = totalSpeed;
    }

    public int getTotalStrenght() {
        return totalStrenght;
    }

    public void setTotalStrenght(int totalStrenght) {
        this.totalStrenght = totalStrenght;
    }

    public List<Item> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Item> equipments) {
        this.equipments = equipments;
    }
}
