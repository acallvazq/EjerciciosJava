package ejercicio1;

import entrada.Input;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int numero = Input.integer("Escriba un numero entero: ");

        if(numero%2 == 0) System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }
}