package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        int[] number;
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Introduce el numero de veces que quieres que se repita");
        n = sc.nextInt();
        number = new int[n];
        System.out.println("Introduce el número que quieres repetir");
        m = sc.nextInt();

        for(int i = 0; i<n;i++){
            number[i] = m;
            System.out.println(number[i]);
        }
    }
}
