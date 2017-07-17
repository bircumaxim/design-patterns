package factory.shapes;

import factory.Shape;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class Circle implements Shape {
    @Override
    public void render() {
        System.out.println("I am a circle !!!");
    }
}
