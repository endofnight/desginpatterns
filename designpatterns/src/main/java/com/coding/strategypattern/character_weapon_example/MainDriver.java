package com.coding.strategypattern.character_weapon_example;

public class MainDriver {
    public static void main(String[] args) {
        King akbar = new King();
        Queen jodha = new Queen();

        akbar.fight();
        jodha.fight();
    }
}
