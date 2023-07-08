package com.latihanoop;

import java.util.Scanner;

public class Math implements SimpleArithmeticProgram {

    // variable
    double c1;
    double c2;


    // create methods
    public void setArithmeticProgram() {

        // create object from Scanner Class
        Scanner scan = new Scanner(System.in);

        System.out.print("masukan angka pertama: ");
        double a = scan.nextDouble();

        System.out.print("masukan angka kedua: ");
        double b = scan.nextDouble();

        // assignment from object input user to variable

        // penjumlahan
        c1 = a + b;
        // pengurangan
        c2 = a - b;

        // call to printing
        System.out.print("\n");
        System.out.println("The result of Penjumlahan: \n" + a + " + " + b + " = " + c1);
        System.out.println("The result of Pengurangan: \n" + a + " - " + b + " = " + c2);

    }

}