import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        double lado_1, lado_2, lado_3, mayor, medio, menor;
        int truncado_1, truncado_2;
        boolean rectangulo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe cuanto miden los lados  a continuación = ");
        lado_1 = sc.nextDouble();
        System.out.print("= ");
        lado_2 = sc.nextDouble();
        System.out.print("= ");
        lado_3 = sc.nextDouble();

        if (lado_1 <= 0 || lado_2 <= 0 || lado_3 <= 0 || lado_1 == lado_2 + lado_3 || lado_2 == lado_1 + lado_3 || lado_3 == lado_2 + lado_1) {
            System.out.println("Datos imposibles, finalizando ejecucion");
            System.exit(0);
        }

        mayor = Math.max(lado_1, Math.max(lado_2, lado_3));
        menor = Math.min(lado_1, Math.min(lado_2, lado_3));

        if (lado_1 < lado_2 || lado_1 < lado_3) {
            medio = Math.max(lado_1, Math.min(lado_2, lado_3));
        } else {
            medio = Math.min(lado_1, Math.max(lado_2, lado_3));
        }

        if (lado_1 == lado_2 && lado_2 == lado_3) {
            System.out.println("El triangulo es equilatero");
        } else {
            if (lado_1 == lado_2 || lado_2 == lado_3 || lado_3 == lado_1) {
                System.out.println("El triangulo es Isosceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }
        }

        truncado_1 = (int) Math.pow(mayor,2);
        medio = Math.pow(medio,2) + Math.pow(menor,2);
        truncado_2 = (int) medio;

        if (truncado_1 == truncado_2) {
            rectangulo = true;
            System.out.println("El triangulo es rectangulo");
        } else {
            System.out.println("El triangulo no es rectangulo");
        }


    }
}
