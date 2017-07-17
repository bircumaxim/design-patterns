package abstractfactory.Factories;

import abstractfactory.AbstractFactory;
import abstractfactory.AbstractProductA;
import abstractfactory.AbstractProductB;
import abstractfactory.Products.ProductA1;
import abstractfactory.Products.ProductB1;

/**
 * Created by bircumaxim on 11/14/2016.
 */
public class Factory1 extends AbstractFactory {
    @Override
    protected AbstractProductA createProductA() {
        return new ProductA1("ProductA1");
    }

    @Override
    protected AbstractProductB createProductB() {
        return new ProductB1("ProductB1");
    }
}
