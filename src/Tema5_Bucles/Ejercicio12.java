package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        int resultado;

        System.out.print("Introduce la base = ");
        base = sc.nextInt();
        resultado = base;

        System.out.print("Introduce el exponente = ");
        exponente = sc.nextInt();


        while (exponente>1){
            resultado = resultado * (base );
            exponente --;
        }

        System.out.println(resultado);
    }
}
