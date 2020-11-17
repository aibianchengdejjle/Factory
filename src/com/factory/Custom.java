package com.factory;

public class Custom {
    public  static  void  main(String []a){
        BMWfactory bmWfactory=new BMWfactory();
        Car carByFactory = bmWfactory.getCarByFactory();
        carByFactory.getCar();
        BencFactory bencFactory=new BencFactory();
        Car carByFactory1 = bencFactory.getCarByFactory();
        carByFactory1.getCar();
    }
}
