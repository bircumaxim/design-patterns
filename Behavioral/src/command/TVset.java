package command;

/**
 * Created by bircumaxim on 11/21/2016.
 */
public class TVset implements ElectroincDevice {

    int volume = 0;

    @Override
    public void on() {
        System.out.println("On");
    }

    @Override
    public void off() {
        System.out.println("Off");
    }

    @Override
    public void volumeUp() {
        System.out.println( volume++ );
    }

    @Override
    public void volumeDown() {
        if(volume >= 0)
            System.out.println( volume-- );
    }
}
