package com.ST.clase4;

import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        Alumno alumno= new Alumno("Pepe","Pepito","ABC", 8);
        Profesor profesor= new Profesor("Juan", "Carlos");
        NoDocente nodocente= new NoDocente("Maria", "Magda");
        List<Persona> Listadepersonas= new ArrayList<>();

        Listadepersonas.add(alumno);
        Listadepersonas.add(profesor);
        Listadepersonas.add(nodocente);

    }
}

