package factory;

import java.util.Scanner;

/**
 * Created by bircumaxim on 11/15/2016.
 */

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("\nCircle 1");
            System.out.println("Square 2");
            System.out.println("Triangle 3");
            System.out.print("Create new shape: ");
            switch (scanner.nextInt()){
                case 1:
                    Shape shape = shapeFactory.createShape(ShapeType.CIRCLE);
                    shape.render();
                    break;
                case 2:
                    shape = shapeFactory.createShape(ShapeType.SQUARE);
                    shape.render();
                    break;
                case 3:
                    shape = shapeFactory.createShape(ShapeType.TRIANGLE);
                    shape.render();
                    break;
                default:
                    shape = shapeFactory.createShape();
                    shape.render();
                    break;
            }
        }
    }
}
