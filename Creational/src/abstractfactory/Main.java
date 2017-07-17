package abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = FactoryMaker.getFactory(FactoryType.A);
        AbstractProductA product= factory.createProductA();
    }
}
