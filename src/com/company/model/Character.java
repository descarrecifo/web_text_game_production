package com.company.model;

import com.sun.source.tree.ReturnTree;

public class Character {
    private String name;
    private int level;
    private String charClass;
    private int experiencePoints;
    private int lifePoints;
    private int manaPoints;
    private int strength;
    private int defense;
    private int speed;
    private int dextery;
    private int money;

    public Character(String name){
        this.name = name;
    }

    public Character(String name, int level){
        this.name = name;
        this.level = level;
    }

    public Character(String name, int level,String charClass){
        this.name = name;
        this.level = level;
        this.charClass = charClass;
    }

    public Character(String name,int level, String charClass, int experiencePoints, int lifePoints, int manaPoints, int strength, int defense, int speed, int dextery, int money) {
        this.level = level;
        this.charClass = charClass;
        this.experiencePoints = experiencePoints;
        this.lifePoints = lifePoints;
        this.manaPoints = manaPoints;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.dextery = dextery;
        this.money = money;
    }
    public  String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getCharClass() {
        return charClass;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDextery() {
        return dextery;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDextery(int dextery) {
        this.dextery = dextery;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name=" + name +
                "level=" + level +
                ", charClass='" + charClass + '\'' +
                ", experiencePoints=" + experiencePoints +
                ", lifePoints=" + lifePoints +
                ", manaPoints=" + manaPoints +
                ", strength=" + strength +
                ", defense=" + defense +
                ", speed=" + speed +
                ", dextery=" + dextery +
                ", money=" + money +
                '}';
    }
}
