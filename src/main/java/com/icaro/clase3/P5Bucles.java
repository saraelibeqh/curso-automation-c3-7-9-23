package com.icaro.clase3;

public class P5Bucles {
    public static void main(String[] args) {

        //WHILE
        int contadorWhile = 0;

        while (contadorWhile < 5){ //se prueba con < y <= y el contador inicializado en 1
            System.out.println("Hola Mundo");

            contadorWhile = contadorWhile + 1;
//      Otras formas de colocar el contador
//            contadorWhile+=1;
//            contadorWhile++;
        }

        /* Ciclo infinito sino coloco el contador +1
        while (contadorWhile < 5){
            System.out.println("Hola Mundo");

//            contadorWhile = contadorWhile + 1;
        }
         */
        System.out.println();
        //DO-WHILE
        int contadotDoWhile = 0;

        do{
            System.out.println("Hola Mundo");
            contadotDoWhile += 1;
        } while (contadotDoWhile < 5);

        System.out.println();

        for (int i = 0 ; i<5 ; i++){
            System.out.println("Hola Mundo");
        }


    }
}
