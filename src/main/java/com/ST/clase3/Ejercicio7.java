package com.ST.clase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;

        List<Integer> Ingresos = new ArrayList<>();
        do {
            System.out.println("Ingrese un numero y para finalizar ingresar 1000: ");
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();


            if (numero <= 500) {

                Ingresos.add(numero);
                System.out.println("Lista de numeros ingresados: " + Ingresos);
                System.out.println("El tamaño de la lista es: " + Ingresos.size());
            } else {
                System.out.println("El numero ingresado debe ser menor que 501");
            }


        }
        while (numero!=1000);

        if(Ingresos.size() <10){
            System.out.println("Se ingresaron pocos numeros");
        }
        else{
            System.out.println("Se excedio la cantida de ingresos");
        }
    }
}
