package com.ST.clase6;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoldadoTest {

    @Test
    public void pelearTest() {
        Soldado soldado = new Soldado(60);
        soldado.pelear(30);
        Assert.assertEquals(soldado.getSalud(), 45, "Error en el valor de la salud");

    }

    @Test
    public void morirTest() {
        Soldado soldado = new Soldado(50);
        soldado.pelear(500);
        Assert.assertTrue(soldado.estaMuerto());

    }
    @Test
    public void nomorirTest() {
        Soldado soldado = new Soldado(50);
        soldado.pelear(10);
        Assert.assertFalse(soldado.estaMuerto());

    }
    @Test
    public void descansarTest(){
        Soldado soldado=new Soldado(80);
        soldado.descansar();
        Assert.assertEquals(soldado.getSalud(),90);

    }
}

