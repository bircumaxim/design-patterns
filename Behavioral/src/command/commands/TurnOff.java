package command.commands;

import command.Command;
import command.ElectroincDevice;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class TurnOff implements Command {

    private ElectroincDevice device;

    public TurnOff(ElectroincDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
        device.on();
    }
}
