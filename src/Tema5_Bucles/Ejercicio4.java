package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número hasta el que quieres contar");
        int n = sc.nextInt();

        for (int i = 0 ; i <= n; i += 1){
            System.out.println(i);
        }

    }
}
