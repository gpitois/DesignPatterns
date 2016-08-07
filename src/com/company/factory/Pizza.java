package com.company.factory;

import java.util.ArrayList;

/**
 * Created by GP on 3/12/2016.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Baking for 25 minutes");
    }

    void cut() {
        System.out.println("Cutting the pizza in diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in box");
    }

    public String getName() {
        return name;
    }
}
