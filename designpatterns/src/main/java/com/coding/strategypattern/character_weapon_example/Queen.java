package com.coding.strategypattern.character_weapon_example;

import com.coding.strategypattern.character_weapon_example.weaponbehaviors.BowAndArrowBehavior;

/**
 * Queen IS-A Character
 */
public class Queen extends ACharacter {

    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("Queen's use this to fight:");
        weaponBehavior.useWeapon();
    }
}
