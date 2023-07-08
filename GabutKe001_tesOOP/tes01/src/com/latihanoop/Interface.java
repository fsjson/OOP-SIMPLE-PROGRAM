package com.latihanoop;

class Bmx implements Bicycle {
    int gear = 1;
    int speed = 0;

    // The compiler will now require that methods
    // changeCadence, changeGear, speedUp, and applyBrakes
    // all be implemented. Compilation will fail if those
    // methods are missing from this class.

    public void changeGear(int newValue){
        gear = newValue;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println( "speed: " + speed + "\ngear:" + gear);
    }

}