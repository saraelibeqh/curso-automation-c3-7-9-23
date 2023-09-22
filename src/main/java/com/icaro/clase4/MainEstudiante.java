package com.icaro.clase4;

public class MainEstudiante {

    public static void main(String[] args) {

        P1Estudiante sara = new P1Estudiante(10,"Sara", "Quintero", 6.7f);

        P1Estudiante pepe = new P1Estudiante(); //se puede eliminar este constructor vacio

        System.out.println("ID: " + sara.getId());
        System.out.println("Nombre: " + sara.getNombre());
        System.out.println("Apellido: " + sara.getApellido());
        System.out.println("Promedio: " + sara.getPromedio());

        sara.setPromedio(7.5f);

        System.out.println("Promedio: " + sara.getPromedio());



    }
}
