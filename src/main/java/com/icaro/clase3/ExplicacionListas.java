package com.icaro.clase3;

import java.util.ArrayList;
import java.util.List;

public class ExplicacionListas {
    public static void main(String[] args) {

        List<String> listaDeString = new ArrayList<>();
        listaDeString.add("Hola");

        String cadena = "Chau";

        listaDeString.add(cadena);

        System.out.println("Posicion 0: " + listaDeString.get(0));
        System.out.println("Posicion 1: " + listaDeString.get(1));
//        System.out.println("Posicion 2: " + listaDeString.get(2));

        System.out.println();

        System.out.println("Lista: " + listaDeString);

        System.out.println("Tamaño lista: " + listaDeString.size());

    }

}
