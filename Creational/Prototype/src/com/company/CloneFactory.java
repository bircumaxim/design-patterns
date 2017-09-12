package com.company;

import com.company.Shape;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public class CloneFactory {
    public Shape getClone(Shape shapeSample){
        return shapeSample.makeCopy();
    }

}
