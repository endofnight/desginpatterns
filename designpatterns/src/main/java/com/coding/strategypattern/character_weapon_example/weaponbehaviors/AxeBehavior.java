package com.coding.strategypattern.character_weapon_example.weaponbehaviors;

import com.coding.strategypattern.character_weapon_example.IWeaponBehavior;

/**
 * Axe IMPLEMENTS IWeaponBehavior
 */
public class AxeBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe cuts the opponent into pieces...");
    }
}
