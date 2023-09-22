package com.icaro.clase4.practica4;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {

    private List<Alumno> alumnos;
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
        this.alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

 /*   public void AgregarAlumno(Alumno alumno) {
        this.alumnos = add(alumno);
    }

  */
}
