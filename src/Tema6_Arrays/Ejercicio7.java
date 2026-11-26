package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q, i=0, min, max;

        System.out.println("Escribe el primer número");
        p=sc.nextInt();
        System.out.println("Escribe el segundo número");
        q=sc.nextInt();

        max = Math.max(p,q);
        min = Math.min(p,q);
        int[] number = new int[(max-min)+1];
        number[0] = min;
        System.out.println(number[0]);

        while (min<max){
            i++;
            min += 1;
            number[i] = min;
            System.out.println(number[i]);

        }
    }
}
