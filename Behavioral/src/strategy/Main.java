package strategy;

public class Main {

    public static void main(String[] args) {
        Strategy[] algorithms = {new Algorithm1(), new Algorithm2()};
        for (Strategy algorithm : algorithms) {
            execute(algorithm);
        }
    }

    private static void execute(Strategy strategy) {
        strategy.solve();
    }
}
