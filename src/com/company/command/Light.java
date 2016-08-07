package com.company.command;

/**
 * Created by GP on 3/20/2016.
 */
public class Light {
    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light is on");
    }

    public void off() {
        System.out.println(location + " Light is off");
    }
}
