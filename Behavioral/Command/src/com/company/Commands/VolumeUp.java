package com.company.Commands;

import com.company.Command;
import com.company.ElectroincDevice;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class VolumeUp implements Command {

    private ElectroincDevice device;

    public VolumeUp(ElectroincDevice device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.volumeUp();
    }

    @Override
    public void undo() {
        device.volumeDown();
    }
}
