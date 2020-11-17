package com.factory;

public class BMWfactory implements interfaceCar {
    @Override
    public Car getCarByFactory() {
        return  new BMW();
    }
}
