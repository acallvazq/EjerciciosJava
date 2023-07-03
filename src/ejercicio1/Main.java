package ejercicio1;

import entrada.Input;

public class Main {
    public static void main(String[] args) {
        int numero = Input.integer("Escriba un numero entero: ");

        if(numero%2 == 0) System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }
}