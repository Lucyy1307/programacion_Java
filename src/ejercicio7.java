import java.util.Scanner;

public class ejercicio7 {
    public static void main (String[]args) {
        double num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce 3 números independientemente = ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        if (num1 >num2){
            if (num1 >num3){
                System.out.println(num1);
                System.out.println(Math.max(num2, num3));
                System.out.println(Math.min(num2, num3));
            }
            else{
                System.out.println(num3);
                System.out.println(Math.max(num1, num2));
                System.out.println(Math.min(num1, num2));
            }
        }
        else{
            if (num2 >num3){
                System.out.println(num2);
                System.out.println(Math.max(num1, num3));
                System.out.println(Math.min(num1, num3));
            }
            else{
                System.out.println(num3);
                System.out.println(Math.max(num2, num1));
                System.out.println(Math.min(num2, num1));
            }
        }
    }
}