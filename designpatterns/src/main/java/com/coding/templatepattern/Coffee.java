package com.coding.templatepattern;

public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Add milk and sugar");
    }

    @Override
    protected void brew() {
        System.out.println("Drip Coffee through filter");
    }
}
