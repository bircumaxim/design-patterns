package com.company.Factories;

import com.company.AbstractFactory;
import com.company.AbstractProductA;
import com.company.AbstractProductB;
import com.company.Products.ProductA1;
import com.company.Products.ProductB1;


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
