package com.ST.clase4;

public class MainConstructor {
    public static void main(String[] args) {
        Constructor Jose= new Constructor(100 , "Jose", "Josesito", 5.4f);

        System.out.println("Id: "+ Jose.getId());
        System.out.println("Nombre: "+ Jose.getNombre());
        System.out.println("Apellido: "+ Jose.getApellido());
        System.out.println("Promedio: "+ Jose.getPromedio());

        Jose.setPromedio(7.3f);

        System.out.println("Promedio: "+ Jose.getPromedio());

    }
}

