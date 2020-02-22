package com.coding.strategypattern.character_weapon_example;

import com.coding.strategypattern.character_weapon_example.weaponbehaviors.SwordBehavior;

/**
 * King IS-A Character
 */
public class King extends ACharacter {

    public King() {
        weaponBehavior = new SwordBehavior();
    }


    @Override
    public void fight() {
        System.out.print("King's use this to fight:");
        weaponBehavior.useWeapon();
    }
}
