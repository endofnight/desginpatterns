package com.coding.strategypattern.character_weapon_example;

/**
 * ACharater HAS-A Weapon Behavior
 */
public abstract class ACharacter {
    // this is COMPOSITION
    // because different characters can use different weapons
    // we have encapsulated it in the weaponBehavior Interface.
    // each client(character) will initialize its own weapon(class)
    //that implements IWeaponBehavior
    IWeaponBehavior weaponBehavior;

    //this is the constant behavior for all types of characters
    //hence this method is in abstract class...so that all the types of
    //characters get this behavior by default.
    public abstract void fight();

    public void setWeapon(IWeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
