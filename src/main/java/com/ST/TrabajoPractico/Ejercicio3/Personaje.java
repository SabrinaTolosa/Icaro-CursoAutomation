package com.ST.TrabajoPractico.Ejercicio3;

abstract public class Personaje {
    private int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }
    abstract public void entrenar();
}

