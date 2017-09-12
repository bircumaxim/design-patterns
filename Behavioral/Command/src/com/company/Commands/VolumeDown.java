package com.company.Commands;

import com.company.Command;
import com.company.ElectroincDevice;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class VolumeDown implements Command {

    private ElectroincDevice device;

    public VolumeDown(ElectroincDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeDown();
    }

    @Override
    public void undo() {
        device.volumeUp();
    }
}
