package com.easyFactory;

public class Factory {
    public BMW createBWM(int type){
        switch (type) {
            case 320:
                return new BMW320();
            case 523:
                return new BMW520();
            default:
                break;
        }
        return null;
    }
}
