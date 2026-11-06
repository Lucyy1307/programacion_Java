import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args){
        double lado_1, lado_2, lado_3, angulo_1, angulo_2, angulo_3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe cuanto miden los lados  a continuación = ");
        lado_1 = sc.nextDouble();
        System.out.print("= ");
        lado_2 = sc.nextDouble();
        System.out.print("= ");
        lado_3 = sc.nextDouble();

        if (lado_1 <= 0 || lado_2 <= 0 || lado_3 <= 0){
            System.exit(0);
        }
        

    }
}
