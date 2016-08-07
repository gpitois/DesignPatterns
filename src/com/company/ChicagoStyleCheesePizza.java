package com.company;

/**
 * Created by GP on 3/12/2016.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Cheese Pizza";
        dough = "Extra thick crust";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella");
    }

    void cut() {
        System.out.println("Cutting the Pizza into square slices");
    }
}
