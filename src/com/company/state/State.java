package com.company.state;

/**
 * Created by GP on 6/18/2016.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
