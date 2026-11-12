import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        final String BIBLIOTECA = "TRWAGMYFPDXBNJZSQVHLCKE";
        int n1, n2, n3, n4, n5, n6, n7, n8, number, position;
        String dni;
        char letter;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI");
        dni = sc.nextLine();

        n1 = (dni.charAt(0) - '0') * 10000000;
        n2 = (dni.charAt(1) - '0') * 1000000;
        n3 = (dni.charAt(2) - '0') * 100000;
        n4 = (dni.charAt(3) - '0') * 10000;
        n5 = (dni.charAt(4) - '0') * 1000;
        n6 = (dni.charAt(5) - '0') * 100;
        n7 = (dni.charAt(6) - '0') * 10;
        n8 = (dni.charAt(7) - '0');
        number = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8;

        letter = dni.charAt(8);
        position = number % 23;

        if(letter == BIBLIOTECA.charAt(position)) {
            System.out.println("DNI correcto");
        }else{
            System.out.println("Dni incorrecto debería tener la siguiente letra = " + BIBLIOTECA.charAt(position));
        }
    }
}
