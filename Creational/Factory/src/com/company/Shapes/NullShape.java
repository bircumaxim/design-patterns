package com.company.Shapes;

import com.company.Shape;

/**
 * Created by bircumaxim on 11/14/2016.
 */

public class NullShape implements Shape {
    @Override
    public void render() {
        System.out.println("There is no such shape !!!.");
    }
}
