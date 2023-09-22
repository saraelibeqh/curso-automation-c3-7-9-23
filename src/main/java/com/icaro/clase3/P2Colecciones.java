package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;

public class P2Colecciones {
    public static void main(String[] args) {
         int[] arrayDeEnteros = new int[3];

         //ARRAYS
         arrayDeEnteros[0] = 20;
         arrayDeEnteros[1] = 500;
         arrayDeEnteros[2] = 10000;

        System.out.println("Posicion 0: " + arrayDeEnteros[0]);

        int variable = arrayDeEnteros[1];
        System.out.println("La Posicion 1 tiene " + variable);
        System.out.println("Posicion 2: "+ arrayDeEnteros[2]);
//        System.out.println("Posicion 3: "+ arrayDeEnteros[3]);

        //LISTAS
        List<String> listaDeString = new ArrayList<>();

        listaDeString.add("Hola");
        listaDeString.add("Soy");
        listaDeString.add("Sara");

        System.out.println("Posicion 0: " + listaDeString.get(0));
        System.out.println("Posicion 1: " + listaDeString.get(1));
        System.out.println("Posicion 2: " + listaDeString.get(2));

        System.out.println("Datos de la lista:" + listaDeString);

//        System.out.println("Posicion 3: " + listaDeString.get(3));
        listaDeString.remove(1);
        System.out.println("datos de la lista: "+ listaDeString);


    }
}
