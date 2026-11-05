import java.util.Scanner;

public class Implementar {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el primer número = ");
        num1 = sc.nextInt();

        System.out.print("Escribe el segundo número = ");
        num2 = sc.nextInt();

        System.out.println("El número mayor es = " + Math.max (num1 , num2));
        System.out.println("El número menor es = " + Math.min (num1 , num2));
    }
}