package com.coding.templatepattern;

import java.util.Arrays;

public class Duck implements Comparable<Duck> {

    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ADuck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck o) {
        if (this.weight > o.weight) {
            return 1;
        } else if (this.weight == o.weight) {
            return 0;
        } else
            return -1;
    }

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Puja", 118),
                new Duck("Jalpa", 116),
                new Duck("Sumu", 120)
        };
        
        display(ducks);
        Arrays.sort(ducks);
        System.out.println( "\n after sorting... \n");
        display(ducks);
        
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
