package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, negative;
        negative = 0;
        num = 0;
        System.out.print("Escribe un número ");

        for (int i = 10; i > 0; i--) {
            System.out.print("= ");
            num++;
            if (sc.nextInt()< 0) {
                negative++;

            }
        }
        System.out.println("Hay " +negative+ " números negativos");
        System.out.println("Hay " +(num-negative)+ " números positivos");
    }
}
