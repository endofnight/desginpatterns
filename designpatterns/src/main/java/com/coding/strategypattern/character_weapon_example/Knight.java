package com.coding.strategypattern.character_weapon_example;

import com.coding.strategypattern.character_weapon_example.weaponbehaviors.KnifeBehavior;

/**
 * Knight IS-A Character
 */
public class Knight extends ACharacter {

    public Knight() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Knight's use this to fight:");
        weaponBehavior.useWeapon();
    }
}
