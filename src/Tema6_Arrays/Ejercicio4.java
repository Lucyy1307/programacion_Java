package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[20];
        int suma = 0, resta = 0;

        for (int i = 0; i < 20; i++) {
            number[i] = sc.nextInt();

            if (number[i] < 0) {
                resta = resta + number[i];
            }
            if (number[i] > 0) {
                suma = suma + number[i];
            }

        }
        System.out.println("Números positivos = " + suma + ", " + "Números Negativos = " + resta);
    }
}
