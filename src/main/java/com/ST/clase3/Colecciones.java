package com.ST.clase3;

import java.util.ArrayList;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        //Arrays
        int [] ArraysDeEnteros = new int[3];
        ArraysDeEnteros [0]= 20;
        ArraysDeEnteros [1]= 30;
        ArraysDeEnteros [2]= 40;

        System.out.println("La posicion 0 tiene: "+ArraysDeEnteros[0]);
        System.out.println("La posicion 1 tiene: "+ArraysDeEnteros[1]);
        System.out.println("La posicion 2 tiene: "+ArraysDeEnteros[2]);

        //Listas
        List<String> ListaDeString= new ArrayList<>();
        ListaDeString.add("Hola");
        ListaDeString.add("soy");
        ListaDeString.add("Sabri");

        System.out.println("La posicion 0: "+ListaDeString.get(0));
        System.out.println("La posicion 1: "+ListaDeString.get(1));
        System.out.println("La posicion 2: "+ListaDeString.get(2));

        System.out.println("Datos de la lista: "+ ListaDeString);

        ListaDeString.remove(1);
        System.out.println("Datos de la lista: "+ ListaDeString);

        System.out.println("Tamaño de la lista: "+ListaDeString.size());

    }
}
