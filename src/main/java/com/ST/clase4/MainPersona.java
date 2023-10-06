package com.ST.clase4;

public class MainPersona {
    public static void main(String[] args) {
        Persona persona= new Persona("Marina", "Marinita");
        Alumno alumno= new Alumno("Pepe", "Pepito", "ABC", 7);
        Profesor profesor=new Profesor("Pato", "Patito");

        persona.getApellido();
        alumno.getApellido();
        profesor.AgregarAlumno(alumno);
    }
}

