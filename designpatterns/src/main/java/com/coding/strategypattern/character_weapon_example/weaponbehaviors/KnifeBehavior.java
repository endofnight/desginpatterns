package com.coding.strategypattern.character_weapon_example.weaponbehaviors;

import com.coding.strategypattern.character_weapon_example.IWeaponBehavior;

/**
 * Knife IMPLEMENTS IWeaponBehavior
 */
public class KnifeBehavior implements IWeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("I can use Knife like butter...");
    }
}
