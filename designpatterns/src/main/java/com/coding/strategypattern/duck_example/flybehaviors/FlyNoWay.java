package com.coding.strategypattern.duck_example.flybehaviors;

import com.coding.strategypattern.duck_example.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
