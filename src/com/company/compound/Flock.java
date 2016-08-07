package com.company.compound;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by GP on 6/30/2016.
 */
public class Flock implements Quackable {
//    Observable observable;
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }

    public Flock() {
//        observable = new Observable(this);
    }

    @Override
    public void registerObserver(Observer observer) {
        System.out.println(quackers.size() + " many quackers");
        for (Object quacker1 : quackers) {
            Quackable quacker = (Quackable) quacker1;
            quacker.registerObserver(observer);
        }
        System.out.println("Flock has registered observer");
    }

    @Override
    public void notifyObservers() {
    }
}
