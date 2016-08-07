package com.company.command;

/**
 * Created by GP on 3/22/2016.
 */
public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Stereo is on");
    }

    public void off() {
        System.out.println(location + " Stereo is off");
    }

    public void setCD() {
        System.out.println(location + " CD is set");
    }

    public void setVolume(int volume) {
        System.out.println(location + " Volume is set to " + volume);
    }
}
