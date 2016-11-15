package com.company.Factories;

import com.company.AbstractFactory;
import com.company.AbstractProductA;
import com.company.AbstractProductB;
import com.company.Products.ProductA2;
import com.company.Products.ProductB2;

/**
 * Created by bircumaxim on 11/14/2016.
 */
public class Factory2 extends AbstractFactory{
    @Override
    protected AbstractProductA createProductA() {
        return new ProductA2("ProductA2");
    }

    @Override
    protected AbstractProductB createProductB() {
        return new ProductB2("ProductB2");
    }
}
