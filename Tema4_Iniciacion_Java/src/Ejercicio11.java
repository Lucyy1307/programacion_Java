import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        double a, b, c, x_1, x_2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe los numeros en orden");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double dis = Math.pow(b, 2) + (-4 * a * c);

        if (a != 0 && dis > 0) {
            x_1 = (-b + Math.sqrt(dis)) / (2 * a);
            x_2 = (-b - Math.sqrt(dis)) / (2 * a);
            System.out.println("Soluciones x1 = " + x_1 + " y x2 = " + x_2);
        }
        if (a != 0 && dis == 0) {
            x_1 = -b / (2 * a);
            System.out.println("Solucion doble = " + x_1);
        }
        if (a != 0 && dis < 0) {
            System.out.println("No existen soluciones");
        }
        if (a == 0 && b != 0) {
            x_1 = -c / b;
            System.out.println("La solución es = " + x_1);
        }
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("No tiene solución");
        }
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Todos los números son solución");
        }
    }
}
