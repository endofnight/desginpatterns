package com.coding.templatepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffeineBeverageWithHook {
    @Override
    public void addCondiments() {
        System.out.println("Add Lemon and Ginger");
    }

    @Override
    public void brew() {
        System.out.println("Steep Tea");
    }

    @Override
    public boolean customerWantsCondiments() {

        String customerInput = getCustomerInput();

        if (customerInput.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getCustomerInput() {
        String customerInput = null;
        System.out.println("Would you like add lemon and ginger in your tea ? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            customerInput = in.readLine();
        } catch (IOException e) {
            System.out.println(" IO error trying to read customer input \n" + e);
        }

        if (customerInput == null)
            return "No";
        
        return customerInput;
    }
}
