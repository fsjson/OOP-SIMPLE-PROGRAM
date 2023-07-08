package com.latihanoop;

public class Home{

    // membuat attribute
    public String warnaRumah = "merah";

    //membuat behavior

    public void gantiCetRumah(String cetRumah){

        cetRumah = "biru";
        warnaRumah = cetRumah;
        System.out.println(warnaRumah);

    }

}
