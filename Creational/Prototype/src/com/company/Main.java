package com.company;

import com.company.Shapes.Circle;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        CloneFactory shapeMaker = new CloneFactory();

        Circle circle = new Circle("Circle1");

        Circle circle2 = (Circle) shapeMaker.getClone(circle);

        circle.render();
        circle2.render();
    }
}
