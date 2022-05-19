package com.company.controller.model;

public class Equipment {
    private int sumStrenghtEquipment;
    private int sumDefenseEquipment;
    private int sumSpeedEquipment;
    private int numItemsEquipment;

    public Equipment() {
        this.sumStrenghtEquipment = 0;
        this.sumDefenseEquipment=0;
        this.sumSpeedEquipment=0;
        this.numItemsEquipment=0;

    }

    public int getNumItemsEquipment() {        return numItemsEquipment;
    }

    public void setNumItemsEquipment(int numItemsEquipment) {
        this.numItemsEquipment = numItemsEquipment;
    }

    public int getSumStrenghtEquipment() {
        return sumStrenghtEquipment;
    }

    public void setSumStrenghtEquipment(int sumStrenghtEquipment) {
        this.sumStrenghtEquipment = sumStrenghtEquipment;
    }

    public int getSumDefenseEquipment() {
        return sumDefenseEquipment;
    }

    public void setSumDefenseEquipment(int sumDefenseEquipment) {
        this.sumDefenseEquipment = sumDefenseEquipment;
    }

    public int getSumSpeedEquipment() {
        return sumSpeedEquipment;
    }

    public void setSumSpeedEquipment(int sumSpeedEquipment) {
        this.sumSpeedEquipment = sumSpeedEquipment;
    }
}
