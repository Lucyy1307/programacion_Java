package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean hay10 = false;

        System.out.print("Escribe tu nota ");

        while (num != -1) {
            System.out.print("= ");
            num = sc.nextInt();
            if (num == 10) {
                hay10 = true;
            }

            if ((num < 0 || num>10) && num!= -1) {
                System.out.println("Número inválido");
            }
        }
        if (hay10){
            System.out.println("Hay un número 10");
        }
        else{
            System.out.println("No existe el 10 entre los seleccionados");
        }
    }
}
