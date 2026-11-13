import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[]args){
        double realPrice, price, discount ;

        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe el precio real = ");
        realPrice = sc.nextDouble();

        System.out.print("Escribe el precio de venta = ");
        price = sc.nextDouble();

        discount = (realPrice - price) * 100 / realPrice;

        System.out.printf("El descuento aplicado es del %.2f %%" ,discount );

    }
}
