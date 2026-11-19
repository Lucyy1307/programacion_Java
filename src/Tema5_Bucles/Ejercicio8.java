package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative, cont;
        double num = -300;
        negative = 0;
        cont = 0;
        System.out.print("Escribe un número ");

        while (num != 0) {
            System.out.print("= ");
            cont++;

            num = sc.nextInt();

            if (num< 0) {
                negative++;
            }
        }

        System.out.println("Hay " +negative+ " números negativos");
        System.out.println("Hay " +(int)(num-negative)+ " números positivos");
    }
}