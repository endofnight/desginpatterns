package com.coding.strategypattern.duck_example.quackbehaviors;

import com.coding.strategypattern.duck_example.IQuackBehavior;

public class IQuack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("to bolo quack quack ...");
    }
}
