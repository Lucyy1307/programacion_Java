package Tema4_Iniciacion_Java;

import java.util.Scanner;

public class Swiches {
    public static void main(String[] args) {
        int num;
        double nume = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el caso que busques del 1 al 5");

        num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("hello world");

            case 2:
                System.out.println("Carla paliza e");
                break;

            case 3:
                System.out.println("im gonna Break your legs carla");

            case 4 :
                System.out.println("carla dedicate a otra cosa");

            default :
                System.out.println("CARLA CANTAR NO TE GUSTA?");
        }

        switch(num){
            case 1 -> System.out.println("6777777");
            case 4-> System.out.println("hola hola, caracola");
        }
    }
}