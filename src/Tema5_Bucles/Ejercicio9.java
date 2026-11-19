package Tema5_Bucles;

public class Ejercicio9 {
    static void main(String[] args) {
        int suma = 0 , producto = 1;
        for(int i = 1 ; i <=  10; i++){
            suma = suma + i;
            producto= producto * i;
        }
        System.out.println("La suma = " + suma);
        System.out.println("El producto = " + producto);

    }
}
