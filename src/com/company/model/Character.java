package com.company.model;

public class Character {
    private String charClass,
            name;
    private int defense,
            dexterity,
            charisma,
            experiencePoints,
            healthPoints,
            level,
            manaPoints,
            maxHealthPoints,
            maxManaPoints,
            money,
            speed,
            strength,
            totalCharisma,
            totalDefense,
            totalDexterity,
            totalHealthPoints,
            totalSpeed,
            totalStrength;


    public Character() {
    }

    public Character(String name, int level, int maxHealthPoints, int healthPoints, int strength, int defense, int speed, int dexterity, String charClass, int money) {
        this.name = name;
        this.level = level;
        this.maxHealthPoints = maxHealthPoints;
        this.healthPoints = healthPoints;
        this.strength = strength;
        this.defense = defense;
        this.speed = speed;
        this.dexterity = dexterity;
        this.charClass = charClass;
        this.money = money;
        this.totalStrength = strength;
        this.totalDefense = defense;
        this.totalSpeed = speed;
    }

    public String getCharClass() {
        return charClass;
    }

    public void setCharClass(String charClass) {
        this.charClass = charClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getManaPoints() {
        return manaPoints;
    }

    public void setManaPoints(int manaPoints) {
        this.manaPoints = manaPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getMaxManaPoints() {
        return maxManaPoints;
    }

    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
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

    public int getTotalCharisma() {
        return totalCharisma;
    }

    public void setTotalCharisma(int totalCharisma) {
        this.totalCharisma = totalCharisma;
    }

    public int getTotalDefense() {
        return totalDefense;
    }

    public void setTotalDefense(int totalDefense) {
        this.totalDefense = totalDefense;
    }

    public int getTotalDexterity() {
        return totalDexterity;
    }

    public void setTotalDexterity(int totalDexterity) {
        this.totalDexterity = totalDexterity;
    }

    public int getTotalHealthPoints() {
        return totalHealthPoints;
    }

    public void setTotalHealthPoints(int totalHealthPoints) {
        this.totalHealthPoints = totalHealthPoints;
    }

    public int getTotalSpeed() {
        return totalSpeed;
    }

    public void setTotalSpeed(int totalSpeed) {
        this.totalSpeed = totalSpeed;
    }

    public int getTotalStrength() {
        return totalStrength;
    }

    public void setTotalStrength(int totalStrength) {
        this.totalStrength = totalStrength;
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
