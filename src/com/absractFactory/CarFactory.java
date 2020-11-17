package com.absractFactory;

public class CarFactory implements  Factory{
    @Override
    public Car getCarByFactory() {
    return  null;
    }
    @Override
    public Plane getPlaneByFactory() {
        return new Airplane();
    }
}
