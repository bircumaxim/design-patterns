package command;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class RemoteControl {
    private final Command turnOn;
    private final Command turnOff;
    private final Command volumeUp;
    private final Command volumeDown;

    public RemoteControl(Command turnOn, Command turnOff, Command volumeUp, Command volumeDown) {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.volumeUp = volumeUp;
        this.volumeDown = volumeDown;
    }

    public void pressOnButton(){
        if(turnOn != null)
            turnOn.execute();
    }

    public void pressOffButton(){
        if(turnOff != null)
            turnOff.execute();
    }

    public void pressVolumeUpButton(){
        if(volumeUp != null)
            volumeUp.execute();
    }

    public void pressVolumeDownButton(){
        if(volumeDown != null)
            volumeDown.execute();
    }

}
