package com.company.command;

/**
 * Created by GP on 3/22/2016.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(location + "Ceiling Fan is High");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(location + "Ceiling Fan is Medium");
    }

    public void low() {
        speed = LOW;
    }

    public void off() {
        speed = OFF;
        System.out.println(location + "Ceiling Fan is Off");
    }

    public int getSpeed() {
        return speed;
    }
}
