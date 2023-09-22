package com.icaro.clase4;

import com.icaro.clase4.practica4.Alumno;
import com.icaro.clase4.practica4.Persona;
import com.icaro.clase4.practica4.Profesor;

public class MainPersonas {
    public static void main(String[] args) {

        Persona persona = new Persona("nombrePersona","apellidoPersona");

        Alumno alumno = new Alumno("abc", 7, "Gio", "Clark");
//        Alumno alumno2 = new Alumno("abc", 7, "Gio", "Clark");

        Profesor profesor = new Profesor("Jose","Messi");

        persona.getApellido();

        alumno.getNombre();

//        profesor.AgregarAlumno(alumno);


    }
}
