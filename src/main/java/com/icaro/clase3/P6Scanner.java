package com.icaro.clase3;

import java.util.Scanner;

public class P6Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresar un entero");
        int entero = scanner.nextInt();

        System.out.println("ingresar una cadena");
        String cadena = scanner.next();

        System.out.println("ingresar un flotante");
        float flotante = scanner.nextFloat();

        System.out.println("Entero ingresado: " + entero);
        System.out.println("Cadena ingresado: " + cadena);
        System.out.println("Flotante ingresado: " + flotante);

        scanner.close();


    }
}
