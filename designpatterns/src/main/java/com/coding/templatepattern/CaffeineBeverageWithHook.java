package com.coding.templatepattern;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * This is the "hook" method
     * @return
     */
    public boolean customerWantsCondiments() {
        return true; //by default it returns true.
    }

    public abstract void addCondiments();

    public abstract void brew();

    public void boilWater() {
        System.out.println("Boil Hot Water");
    }

    public void pourInCup() {
        System.out.println("Pour beverage in cup");
    }
}
