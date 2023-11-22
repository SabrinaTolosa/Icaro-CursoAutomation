package com.ST.stepDefinitions;

import com.ST.hooks.Hooks;
import com.ST.opencart.pages.HomePage;
import com.ST.opencart.pages.SearchPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarritoDefinitions {
    private HomePage homePage;
    private SearchPage searchPage;

    public CarritoDefinitions() {

        this.homePage = new HomePage(Hooks.getDriver());
        this.searchPage=new SearchPage(Hooks.getDriver());
    }


    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito (){
        searchPage.agregarCarrito();
    }
    @Entonces("se valida que se agrego al carrito")
    public void seValidaQueSeAgregoAlCarrito() {
        Assert.assertTrue(searchPage.isVisibleCarrito());
    }
}

