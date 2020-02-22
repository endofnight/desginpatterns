package com.coding.strategypattern.duck_example.flybehaviors;

import com.coding.strategypattern.duck_example.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly high ...");
    }
}
