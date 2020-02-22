package com.coding.templatepattern;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();

       // tea.prepareRecipe();

        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        teaWithHook.prepareRecipe();

        coffeeWithHook.prepareRecipe();

    }
}
