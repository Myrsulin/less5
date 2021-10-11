package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss boss1 = new Boss();
        boss1.setHealth(150);
        boss1.setDamage(200);
        boss1.setDefenseType(250);
        System.out.println(boss1);

        System.out.println(Arrays.toString(createHeroes()));
    }

    private static Hero[] createHeroes() {

        Hero h1 = new Hero(150, 250);
        Hero h2 = new Hero(250, 250);
        Hero h3 = new Hero(250, 250, "Заглушка");

        Hero hero [] = {h1, h2, h3};

        return hero;
    }
}
