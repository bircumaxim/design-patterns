package command;

import command.commands.TurnOff;
import command.commands.TurnOn;
import command.commands.VolumeDown;
import command.commands.VolumeUp;

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
