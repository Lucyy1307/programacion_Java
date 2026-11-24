package Tema6_Arrays;

import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        int[] num = new int[20];
        int suma = 0;
        double resultado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe los números ");

        for (int i = 0; i< num.length;i++){
            System.out.print("= ");
            num[i] = sc.nextInt();
            suma = suma + num[i];
        }
        resultado = (double)suma/num.length;
        System.out.println("El resultado es = "+ resultado);
    }
}
