package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean negative = false;

        System.out.print("Escribe un número ");

        for (int i = 10; i > 0; i--) {
            System.out.print("= ");
            num = sc.nextInt();
            if (num < 0) {
                negative = true;
            }
        }
        if (negative){
            System.out.println("Hay un número negativo");
        }
        else{
            System.out.println("No existen números negativos entre los seleccionados");
        }
    }
}
