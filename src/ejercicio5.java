// shift f6 -- cambia las variables
// control alt L -- pone to bonico
// control shift -- mover lineas de código
//control shift F10 -- ejecutar el archivo
//control z -- deshacer
//control shift z -- rehacer

import java.util.Scanner;

public class ejercicio5 {
    public static void main (String[]args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Escribe tu edad = ");
        int edad =  sc.nextInt();


        if  (edad >= 18) {

            System.out.print("Eres mayor de edad puedes acceder");
        }
        else{
            System.out.print("Eres menor de edad no puedes acceder");
        }
    }
}