package com.company.command;

/**
 * Created by GP on 3/25/2016.
 */
public class MacroCommandTest {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {lightOn, stereoOn};
        Command[] partyOff = {lightOff, stereoOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("Party On!");
        remoteControl.onButtonWasPushed(0);
        System.out.println("Party Off!");
        remoteControl.offButtonWasPushed(0);
    }

}
