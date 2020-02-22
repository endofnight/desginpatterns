package com.coding.templatepattern;

/**
 * The Template Method defines the skeleton of an algorithm in a method, deferring some steps to subclasses
 * and allows subclasses. Template Method lets subclasses redefine certain steps of an without
 * changing the algorithm's structure.
 *
 * Questions:
 * 1.) is it possible to have no abstract method in the template pattern ?
 * 2.) what if I dont declare the template method "final" ?
 * 3.)
 */
public abstract class CaffeineBeverage {
    /**
     * This is our Template Method.
     * 1.) It serves as a Template for an algorithm (in this case a beverage making algo)
     * 2.) Each step of algorithm is represented by a method
     * 3.) Some methods are handled by this abstract class itself. E.g. boilWater() and pourInCup()
     * 4.) Some are to be handled by the subclasses. These should be declared ABSTRACT.
     * 5.) Note that the template method is declared "final".
     * 6.) Note, the steps are defined as a "sequence" in the template method.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boil Hot Water");
    }

    private void pourInCup() {
        System.out.println("Pour beverage in cup");
    }

}
