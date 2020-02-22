package com.coding.strategypattern.character_weapon_example.weaponbehaviors;

import com.coding.strategypattern.character_weapon_example.IWeaponBehavior;

/**
 * Sword IMPLEMENTS IWeaponBehavior
 */
public class SwordBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword is mightier...");
    }
}
