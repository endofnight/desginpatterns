package com.coding.strategypattern.duck_example;

import com.coding.strategypattern.duck_example.flybehaviors.FlyWithWings;
import com.coding.strategypattern.duck_example.quackbehaviors.IQuack;

public class PondDuck extends ADuck {

    public PondDuck() {
        quackBehavior = new IQuack();
        flyBehavior = new FlyWithWings();
    }

}
