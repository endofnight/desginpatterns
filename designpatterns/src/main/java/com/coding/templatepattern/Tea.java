package com.coding.templatepattern;

public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Add Lemon and Ginger");
    }

    @Override
    protected void brew() {
        System.out.println("Steep Tea ");
    }
}
