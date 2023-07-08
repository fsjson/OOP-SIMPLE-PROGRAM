package com.latihanoop;

interface Bicycle {

    //  wheel revolutions per minute
    public void speedUp(int increment);

    public void applyBrakes(int decrement);

    public void changeGear(int newValue);

}