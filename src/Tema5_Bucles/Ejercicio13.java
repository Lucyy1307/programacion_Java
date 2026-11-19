package Tema5_Bucles;

import java.util.Scanner;

public class Ejercicio13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reponse;
        boolean letter = false;



        while (!letter){
            System.out.println((int)(Math.random()*100));
            reponse = sc.nextLine();
            reponse = reponse.toLowerCase();
            letter = reponse.contains("s") && reponse.contains("i");

            if (letter){
                System.out.println("Si hombre que he acertado, voy a por una loteria");
            }
            else{
                System.out.println("My bad");
            }
        }
    }
}
