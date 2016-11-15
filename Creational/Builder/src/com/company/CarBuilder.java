package com.company;

import com.oracle.webservices.internal.api.message.PropertySet;

import java.beans.Introspector;
import java.lang.reflect.TypeVariable;

/**
 * Created by bircumaxim on 11/15/2016.
 */
public abstract class CarBuilder implements Car{
    protected String Name;
    protected String Model;
    protected String EngineType;
    protected Boolean MP3;
    protected Integer Weight;

    public CarBuilder setName(String name) {
        Name = name;
        return this;
    }

    public CarBuilder setModel(String model) {
        Model = model;
        return this;
    }

    public CarBuilder setEngineType(String engineType) {
        EngineType = engineType;
        return this;
    }

    public CarBuilder setMP3(Boolean MP3) {
        this.MP3 = MP3;
        return this;
    }

    public CarBuilder setWeight(Integer weight) {
        Weight = weight;
        return this;
    }

    public void DisplayCarInfo(){
        System.out.println(Name + " " + Model);
        System.out.println("Engine: " + EngineType);
        System.out.println("Has MP3: " + MP3);
        System.out.println("Weight: " + Weight + "kg");
    }
}
