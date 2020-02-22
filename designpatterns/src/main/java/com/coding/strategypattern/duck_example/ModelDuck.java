package com.coding.strategypattern.duck_example;

import com.coding.strategypattern.duck_example.flybehaviors.FlyNoWay;
import com.coding.strategypattern.duck_example.quackbehaviors.IQuack;

public class ModelDuck extends ADuck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new IQuack();
    }
}
