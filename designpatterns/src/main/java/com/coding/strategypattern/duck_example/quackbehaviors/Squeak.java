package com.coding.strategypattern.duck_example.quackbehaviors;

import com.coding.strategypattern.duck_example.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I am nakli quack....i squeak ...");
    }
}
