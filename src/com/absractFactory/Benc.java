package com.absractFactory;

import com.factory.Car;

public class Benc implements Car {
    @Override
    public void getCar() {
        System.out.println("奔驰");
    }
}
