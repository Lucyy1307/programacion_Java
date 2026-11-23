package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int max = -999;

        for (int i = 0; i < 10; i++){
            numbers[i] = sc.nextInt();
            for(int number : numbers){
                max = Math.max(max,number);
            }
        }
        System.out.println(max);
    }
}
