package org.fasttrackit;

//inheritance or "is a" relationship

public class Car extends AutoVehicle {

    // instance variables

    int doorCount;


    public Car(Engine engine) {
        super(engine);
    }

//    constructor overloading
    public Car() {
        this (new Engine());
    }
}
