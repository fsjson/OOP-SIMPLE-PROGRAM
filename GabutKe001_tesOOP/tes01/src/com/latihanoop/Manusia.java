package com.latihanoop;

public class Manusia {

    // attribute

    public String nama;
    public int tinggiBadan;
    public int beratBadan;
    public int umur;

    public void setIdentity(String namaManusia,
                            int tb,
                            int bB,
                            int umurManusia) {

        nama = namaManusia;
        tinggiBadan = tb;
        beratBadan = bB;
        umur = umurManusia;

    }

    // method

    public void makan(String makananFav){
        System.out.println( nama + " suka makan : " + makananFav);
    }

    public void menikah(String namaPasangan){
        System.out.println(nama + "Menikah dengan cinta sejatinya," + namaPasangan);
    }

    public void melakukanHobi(String hobi){
        System.out.println( nama + " suka melakukan : " + hobi);
    }

}
