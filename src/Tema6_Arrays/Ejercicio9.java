package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[100];
        int n,m=0,i = 0;
        int[] position = new int[0];

        for (int k = 0; k < number.length; k++) {
            number[k] = (int) (1 + Math.random() * 10);
        }

        System.out.println("Escribe el numero que del 1 al 10");
        n = sc.nextInt();
        System.out.print("Los valores estan en las posiciones : ");
        do{

            if (n == number[i]) {
                System.out.print(i + ", ");
            }
            i++;
        }while(i<(number.length));
    }
}
