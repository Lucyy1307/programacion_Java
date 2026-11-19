package Tema5_Bucles;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quinientos = 0, doscientos = 0, cien = 0, cincuenta = 0, veinte = 0, diez = 0, cinco = 0;
        double money, diff;

        System.out.print("Introduce la cantidad de dinero = ");
        money = sc.nextDouble();
        diff = money;
        money = (int) money;

        while (money % 5 != 0) {
            money--;
        }

        diff = diff - money;

        while (money >= 500) {
            money -= 500;
            quinientos++;
        }
        while (money >= 200) {
            money -= 200;
            doscientos++;
        }
        while (money >= 100) {
            money -= 100;
            cien++;
        }
        while (money >= 50) {
            money -= 50;
            cincuenta++;
        }
        while (money >= 20) {
            money -= 20;
            veinte++;
        }
        while (money >= 10) {
            money -= 10;
            diez++;
        }
        while (money >= 5) {
            money -= 5;
            cinco++;
        }
        System.out.print("Serían ");
        if (quinientos != 0) {
            System.out.print(quinientos + " Billetes de 500 ; ");
        }
        if (doscientos != 0) {
            System.out.print(doscientos + " Billetes de 200 ; ");
        }
        if (cien != 0) {
            System.out.print(cien + " Billetes de 100 ; ");
        }
        if (cincuenta != 0) {
            System.out.print(cincuenta + " Billetes de 50 ; ");
        }
        if (veinte != 0) {
            System.out.print(veinte + " Billetes de 20 ; ");
        }
        if (diez != 0) {
            System.out.print(diez + " Billetes de 10 ; ");
        }
        if (cinco != 0) {
            System.out.print(cinco + " Billetes de 5 ; ");
        }

        if (diff % 5 != 0) {
            System.out.printf(" y %.2f", diff );
            System.out.print(" sobrantes  ");
        }

    }
}
