package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] numbers = new int[10];
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(numbers[0] +numbers[1] +numbers[2]+numbers[3]+numbers[4]+numbers[5]+numbers[6]+numbers[7]+numbers[8]+numbers[9]);
    }
}
