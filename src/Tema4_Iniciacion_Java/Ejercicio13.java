package Tema4_Iniciacion_Java;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        final String BIBLIOTECA = "TRWAGMYFPDXBNJZSQVHLCKE";
        int  number, position;
        String dni;
        char letter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI");
        dni = sc.nextLine();
        number = Integer.parseInt(dni.chars(0,1,2,3,4,5,6));

        letter = dni.charAt(8);
        position = number % 23;

        if (letter == BIBLIOTECA.charAt(position)) {
            System.out.println("DNI correcto");
        } else {
            System.out.println("Dni incorrecto debería tener la siguiente letra = " + BIBLIOTECA.charAt(position));
        }
    }
}
