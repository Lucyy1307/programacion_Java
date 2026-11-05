import java.util.Scanner;

//salarynet = salarybrut -500;
//imp1 = salarynet * 0.75;

public class ejercicio10 {
    public static void main(String[] args) {
        double imp1, imp2, salarynet, salarybrut, price, mult;
        int hour;
        Scanner sc = new Scanner(System.in);

        imp2 = 0;
        imp1 = 0;
        mult = 1.5;

        System.out.println("Escribe tu nombre = ");
        String name = sc.next();

        System.out.println("¿Cuanto cobras la hora? =");
        price = sc.nextDouble();

        System.out.println("¿Cuantas horas semanales trabajas? =");
        hour = sc.nextInt();


        salarybrut = hour * price;

        if (hour > 35) {
            salarynet = 35 * price;
            hour = (hour - 35);
            mult = price * mult * hour;
            salarybrut = salarynet + mult;
        }

        if (salarybrut > 500 && salarybrut <= 900) {
            if (salarybrut > 900) {
                salarynet = salarybrut - 900;
                imp2 = salarynet * 0.45;
                imp1 = 400 * 0.25;
            } else {
                salarynet = salarybrut - 500;
                imp1 = salarynet * 0.75;
            }
        }

        salarynet = salarybrut - (imp1 + imp2);
        System.out.println("SALARIO BRUTO = " + salarybrut);
        System.out.println("SALARIO NETO = " + salarynet);
        System.out.println("Los impuestos son = " +(imp1 + imp2));

    }
}
