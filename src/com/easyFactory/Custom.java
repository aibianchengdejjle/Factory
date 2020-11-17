package com.easyFactory;


public class Custom {
        public  static  void main(String []ar){
            Factory factory=new Factory();
            BMW bwm320 = factory.createBWM(320);

            BMW bmw520=factory.createBWM(520);
        }
}
