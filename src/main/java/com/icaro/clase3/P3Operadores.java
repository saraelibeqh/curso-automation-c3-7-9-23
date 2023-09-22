package com.icaro.clase3;

public class P3Operadores {
    public static void main(String[] args) {

        //Operadores aritmeticos
        int suma = 10 + 10;
        int resta = 10 - 10;
        int division = 10/10;
        int multi = 10*10;

        //Operadores relacionales
        boolean menor = 10<20;
        System.out.println(menor);

        boolean menorOIgual = 10<=10;
        System.out.println(menorOIgual);

        System.out.println('C' != 'M');

        //Operadores condicionales

        System.out.println((10<20) && (100>1));
        System.out.println((10<20) && (100<1));

        System.out.println(!true);
        System.out.println(!(10<20));

    }
}
