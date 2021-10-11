package com.company;

public class Hero {
    private int health;
    private int Damage;
    private String SuperAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperAbility() {
        return SuperAbility;
    }

    public void setSuperAbility(String superAbility) {
        SuperAbility = superAbility;
    }

    public Hero(int health, int damage) {
        this.health = health;
        Damage = damage;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", Damage=" + Damage +
                ", SuperAbility='" + SuperAbility + '\'' +
                '}';
    }

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        Damage = damage;
        SuperAbility = superAbility;
    }
}
