package command;

/**
 * Created by bircumaxim on 11/18/2016.
 */
public class Main {
    public static void main(String[] args) {
        ElectroincDevice tv = new TVset();
        RemoteControl remoteControl = new RemoteControlBuilder(tv)
                .addTurnOnCommand()
                .addTurnOffCommand()
                .addVolumeUpCommand()
                .addVolumeDownCommand()
                .build();

        remoteControl.pressOnButton();
        remoteControl.pressVolumeUpButton();
        remoteControl.pressVolumeUpButton();
    }
}
