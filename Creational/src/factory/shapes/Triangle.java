package factory.shapes;

import factory.Shape;

/**
 * Created by bircumaxim on 11/14/2016.
 */

public class Triangle implements Shape {
    @Override
    public void render() {
        System.out.println("I am a triangle.");
    }
}
