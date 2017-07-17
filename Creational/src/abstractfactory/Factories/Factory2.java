package abstractfactory.Factories;

import abstractfactory.AbstractFactory;
import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;
import abstractfactory.Products.ProductA2;
import abstractfactory.Products.ProductB2;

/**
 * Created by bircumaxim on 11/14/2016.
 */
public class Factory2 extends AbstractFactory {
    @Override
    protected AbstractProductA createProductA() {
        return new ProductA2("ProductA2");
    }

    @Override
    protected AbstractProductB createProductB() {
        return new ProductB2("ProductB2");
    }
}
