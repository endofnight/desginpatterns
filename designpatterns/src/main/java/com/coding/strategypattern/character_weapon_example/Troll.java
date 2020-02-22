package com.coding.strategypattern.character_weapon_example;

import com.coding.strategypattern.character_weapon_example.weaponbehaviors.AxeBehavior;
/**
 * Troll IS-A Character
 */
public class Troll extends ACharacter {

    public Troll () {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Troll's use this to fight:");
        weaponBehavior.useWeapon();
    }
}
