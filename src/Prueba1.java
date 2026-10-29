// shift f6 -- cambia las variables
// control alt L -- pone to bonico
// control shift -- mover lineas de código
//control shift F10 -- ejecutar el archivo
//control z -- deshacer
//control shift z -- rehacer

import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] ars) {

        Scanner entry = new Scanner(System.in);
        double side;

        System.out.print("Escribe cuanto vale el lado del cuadrado = ");
        side = entry.nextDouble();

        System.out.println(side * side);
    }
}
