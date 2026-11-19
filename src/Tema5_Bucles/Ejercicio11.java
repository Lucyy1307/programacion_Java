package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args){
        int par = 0;
        int impar = 0;

        for(int i = 0; i<=200; i++){
            if (i%2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("Numeros pares = " + par);
        System.out.println("Numeros impares = " + impar);
    }
}