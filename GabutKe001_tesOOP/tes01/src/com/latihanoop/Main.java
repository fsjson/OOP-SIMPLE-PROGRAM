package com.latihanoop;
public class Main {

    public static void main(String[] args) {

        Home myHome = new Home();

        // Call the methods on the Home object

        myHome.gantiCetRumah(myHome.warnaRumah);

        System.out.println("-------------------------");

        // call the methods on the Manusia object

        Manusia doni = new Manusia();
        doni.setIdentity("Doni",184,29,14);
        System.out.println("Nama            : " + doni.nama);
        System.out.println("Tinggi Badan    : " + doni.tinggiBadan);
        System.out.println("Berat Badan     : " + doni.beratBadan);
        System.out.println("Umur            : " + doni.umur);

        doni.makan("Bakso");
        doni.melakukanHobi("belajar");
        doni.menikah("Kaisya");

        System.out.println("-------------------------");

        // Interface

        // class Bmx
        Bmx BmxBicycle01 = new Bmx();
        BmxBicycle01.speedUp(100);
        BmxBicycle01.applyBrakes(40);
        System.out.println("Speed up    : " + BmxBicycle01.speed);
        BmxBicycle01.changeGear(2);

        BmxBicycle01.printStates();

        System.out.println("-------------------------");

        // class Math
        Math penjumlahanArtimatikSederhana = new Math();
        penjumlahanArtimatikSederhana.setArithmeticProgram();


    }

}

