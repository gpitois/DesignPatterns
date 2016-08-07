package com.company;

/**
 * Created by GP on 3/12/2016.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.printf("John ordered a " + pizza.getName());
    }
}
