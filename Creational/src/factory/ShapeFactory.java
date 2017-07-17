package factory;

import factory.shapes.Circle;
import factory.shapes.NullShape;
import factory.shapes.Square;
import factory.shapes.Triangle;

/**
 * Created by bircumaxim on 11/14/2016.
 */

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType){
        switch (shapeType) {
            case TRIANGLE:
                return new Triangle();
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            default:
                return new NullShape();
        }
    }


    public Shape createShape(){
        return new NullShape();
    }
}

enum ShapeType{
    TRIANGLE,
    CIRCLE,
    SQUARE
}
