package com.company.model;

public class Character {
    private String name,
            charClass;
    private int level,
            experiencePoints,
            healthPoints,
            manaPoints,
            strength,
            defense,
            speed,
            dexterity,
            money,
            totalStrength,
            totalDefense,
            totalSpeed,
            totalHealthPoints;

    public Character() {
    }

    public Character(String name) {
        this.name = name;
    }

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Character(String name, int level, String charClass) {
        this.name = name;
        this.level = level;
        this.charClass = charClass;
    }

    public Character(String name, int level, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.dexterity = dexterity;
        this.charClass = charClass;
        this.money = money;
    }

    public int getTotalStrength() {
        return totalStrength;
    }

    public void setTotalStrength(int totalStrength) {
        this.totalStrength = totalStrength;
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

    public int getTotalHealthPoints() {
        return totalHealthPoints;
    }

    public void setTotalHealthPoints(int totalHealthPoints) {
        this.totalHealthPoints = totalHealthPoints;
    }

    public Character(String name, int level, String charClass, int experiencePoints, int healthPoints, int manaPoints, int strength, int defense, int speed, int dexterity, int money) {
        this.level = level;
        this.charClass = charClass;
        this.experiencePoints = experiencePoints;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.dexterity = dexterity;
        this.money = money;
    }

    public String getName() {
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

    public int getHealthPoints() {
        return healthPoints;
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

    public int getDexterity() {
        return dexterity;
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

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
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

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
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
                ", healthPoints=" + healthPoints +
                ", manaPoints=" + manaPoints +
                ", strength=" + strength +
                ", defense=" + defense +
                ", speed=" + speed +
                ", dexterity=" + dexterity +
                ", money=" + money +
                '}';
    }
}
