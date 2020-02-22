package com.coding.strategypattern.duck_example;

import com.coding.strategypattern.duck_example.ModelDuck;
import com.coding.strategypattern.duck_example.PondDuck;
import com.coding.strategypattern.duck_example.flybehaviors.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        PondDuck pondy = new PondDuck();
        System.out.println("********** Pond Duck *************");
        pondy.performFly();
        pondy.performQuack();

        ModelDuck model = new ModelDuck();
        System.out.println("************ Model Duck ************");
        model.performFly();
        model.performQuack();

        model.setFlyBehavior(new FlyWithWings());
        model.performFly();

    }
}
