import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        double nota;

        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu nota = ");
        nota = sc.nextDouble();

        if (nota >= 5) {
            if (nota >= 6) {
                if (nota >= 7) {
                    if (nota >= 9) {
                        System.out.println("Tienes un sobresaliente");
                    }
                } else {
                    System.out.println("Tienes un notable");
                }
            } else {
                System.out.println("Tienes un bien");
            }
        } else {
            if (nota < 5) {
                System.out.println("Muy insuficiente");

                if (nota == 0) {
                    System.out.println("Muy deficiente");
                }
            }
        }
    }
}

