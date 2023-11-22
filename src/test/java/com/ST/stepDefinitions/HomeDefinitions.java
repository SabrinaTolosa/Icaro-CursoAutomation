package com.ST.stepDefinitions;

import com.ST.hooks.Hooks;
import com.ST.opencart.pages.HomePage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class HomeDefinitions {
    private HomePage homePage;

    public HomeDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de opencart")
    public void queElUsuarioIngresaALaPaginaDeOpencart() {
        Hooks.getDriver().get(Hooks.getConfigValue("url"));
    }

    @Entonces("se valida que el usuario se encuentra en la home")
    public void seValidaQueElUsuarioSeEncuentraEnLaHome() {
        Assert.assertEquals(homePage.getTitulo(), "Your Store");
        Assert.assertTrue(homePage.buscadorEsVisible());
        Assert.assertTrue(homePage.carrouselEsVisible());
    }

    @Y("el usuario ingresa al login")
    public void elUsuarioIngresaAlLogin() {
        homePage.ingresarAlLogin();
    }

    @Y("el usuario ingresa a crear cuenta")
    public void elUsuarioIngresaACrearCuenta() {
        homePage.ingresarAlRegistro();
    }
}


