package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe en numero del cual quieres el factorial");
        long n = sc.nextLong();
        long l = n;
        long cont = n;

        do{
            n = n * (l-i);
            i += 1;
        }while (i < cont);

        System.out.println(n);
    }
}
