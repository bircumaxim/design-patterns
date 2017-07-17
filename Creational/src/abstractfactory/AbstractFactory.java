package abstractfactory;

/**
 * Created by bircumaxim on 11/14/2016.
 */
public abstract class AbstractFactory {
    protected abstract AbstractProductA createProductA();
    protected abstract AbstractProductB createProductB();
}
