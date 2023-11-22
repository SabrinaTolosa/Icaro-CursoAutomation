package com.ST.TrabajoPractico.Ejercicio1;

import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        int num1;
        int num2;
        String letra;
        float resultado=0;

        Scanner teclado = new Scanner(System.in);
        Calculadora calculadora=new Calculadora();

        for(int i=0; i<5;i++){

            System.out.println("Ingrese el primer número: ");
            num1 = teclado.nextInt();

            System.out.println("Ingrese el segundo número: ");
            num2 = teclado.nextInt();

            System.out.println("Ingrese una de las siguientes opciones: ");
            System.out.println("S para sumar: ");
            System.out.println("R para restar: ");
            System.out.println("M para multiplicar: ");
            System.out.println("D para dividir: ");


            letra =teclado.next();

            switch (letra) {
                case "S":
                    resultado=calculadora.suma(num1,num2);
                    break;
                case "R":
                    resultado=calculadora.resta(num1,num2);
                    break;
                case "M":
                    resultado=calculadora.multiplicacion(num1,num2);
                    break;
                case "D":
                    resultado=calculadora.division(num1,num2);
                    break;
                default:
                    System.out.println("Debe ingresar alguna de las 4 letras del menú de opciones");
            }
            System.out.println("El resultado es: " + resultado);

            if (resultado<0){
                System.out.println("Tene cuidado, el resultado es negativo");
            } else if (resultado<10000) {
                System.out.println("Resultado dentro de los limites");
            }
            else {
                System.out.println("Eror, resultado muy grande");
            }
        }

    }
}
