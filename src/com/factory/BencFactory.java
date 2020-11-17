package com.factory;

public class BencFactory implements  interfaceCar {
    @Override
    public Car getCarByFactory() {
        return  new Benc();
    }
}
