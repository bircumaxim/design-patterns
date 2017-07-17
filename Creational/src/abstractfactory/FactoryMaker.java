package abstractfactory;


import abstractfactory.Factories.Factory1;
import abstractfactory.Factories.Factory2;

/**
 * Created by bircumaxim on 11/14/2016.
 */
public class FactoryMaker{

    public static AbstractFactory getFactory(FactoryType factoryType){
       switch (factoryType){
           case A:
               return new Factory1();
           case B:
               return new Factory2();
           default:
               return null;
       }
    }
}

