package com.coding.strategypattern.duck_example;

/**
 * A Strategy Pattern defines a family of algorithms and encapsulates each one (like IQuackBehavior and IFlyBehavior),
 * and makes them interchangeable. Strategy lets algorithms vary differently from the clients that use it.
 */
public abstract class ADuck {
    IFlyBehavior flyBehavior; // this is composition
    IQuackBehavior quackBehavior; // this is composition

    public ADuck() {

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
