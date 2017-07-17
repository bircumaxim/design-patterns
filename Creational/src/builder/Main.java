package builder;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        Car ford = new FordBuilder()
                .setModel("Fiesta")
                .setWeight(30000)
                .setEngineType("V6")
                .setMP3(true);

        ford.DisplayCarInfo();
    }
}
