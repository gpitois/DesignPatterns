package com.company.command;

/**
 * Created by GP on 3/20/2016.
 */
public class GarageDoorCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {

    }
}
