package com.company;

import com.company.Commands.TurnOff;
import com.company.Commands.TurnOn;
import com.company.Commands.VolumeDown;
import com.company.Commands.VolumeUp;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class RemoteControlBuilder {

    private Command turnOn;
    private Command turnOff;
    private Command volumeUp;
    private Command volumeDown;

    private ElectroincDevice device;

    protected RemoteControlBuilder(ElectroincDevice device) {
        this.device = device;
    }


    public RemoteControlBuilder addTurnOnCommand() {
        this.turnOn = new TurnOn(device);
        return this;
    }

    public RemoteControlBuilder addTurnOffCommand() {
        this.turnOff = new TurnOff(device);
        return this;
    }

    public RemoteControlBuilder addVolumeUpCommand() {
        this.volumeUp = new VolumeUp(device);
        return this;
    }

    public RemoteControlBuilder addVolumeDownCommand() {
        this.volumeDown = new VolumeDown(device);
        return this;
    }

    public RemoteControl build(){
        return new RemoteControl(turnOn,turnOff,volumeUp,volumeDown);
    }
}
