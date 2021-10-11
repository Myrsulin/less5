package com.company;

public class Boss {
    private int health;
    private int damage;
    private int defenseType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "health=" + health +
                ", damage=" + damage +
                ", defenseType=" + defenseType +
                '}';
    }

    public int getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(int defenseType) {
        this.defenseType = defenseType;
    }
}
