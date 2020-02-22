package com.coding.strategypattern.character_weapon_example.weaponbehaviors;

import com.coding.strategypattern.character_weapon_example.IWeaponBehavior;

/**
 * Bow and Arrow IMPLEMENTS IWeaponBehavior
 */
public class BowAndArrowBehavior implements IWeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Use borrow and arrow to hit fish's eye...");
    }
}
