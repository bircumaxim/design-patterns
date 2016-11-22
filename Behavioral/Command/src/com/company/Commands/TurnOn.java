package com.company.Commands;

import com.company.Command;
import com.company.ElectroincDevice;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class TurnOn implements Command {

    private ElectroincDevice device;

    public TurnOn(ElectroincDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
