package com.company.compound;

/**
 * Created by GP on 7/27/2016.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
