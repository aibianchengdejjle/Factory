package com.absractFactory;

public class Custom  {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Car carByFactory = carFactory.getCarByFactory();
        Plane planeByFactory = carFactory.getPlaneByFactory();
        carByFactory.getCar();
        planeByFactory.getPlane();
    }
}
