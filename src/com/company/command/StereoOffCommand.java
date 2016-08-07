package com.company.command;

/**
 * Created by GP on 3/22/2016.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void undo() {

    }

    @Override
    public void execute() {
        stereo.off();
    }
}
