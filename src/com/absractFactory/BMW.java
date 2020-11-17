package com.absractFactory;

import com.factory.Car;

public class BMW implements  Car {

    @Override
    public void getCar() {
        System.out.println("来一辆bmw");
    }
}
