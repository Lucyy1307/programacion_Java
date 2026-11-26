package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[100];
        int real, n = 0;


        System.out.println("Introduce un número real");
        real = sc.nextInt();

        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

        for (int number : numbers){
            if (number == real) {
                n++;
            }
        }

        System.out.println("Los numeros iguales al tuyo son : " + n);
    }
}
