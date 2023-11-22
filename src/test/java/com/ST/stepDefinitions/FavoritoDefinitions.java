package com.ST.stepDefinitions;

import com.ST.hooks.Hooks;
import com.ST.opencart.pages.HomePage;
import com.ST.opencart.pages.SearchPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class FavoritoDefinitions {

    private HomePage homePage;
    private SearchPage searchPage;

    public FavoritoDefinitions() {

        this.homePage = new HomePage(Hooks.getDriver());
        this.searchPage=new SearchPage(Hooks.getDriver());
    }

    @Y ("el usuario busca un producto")
    public void elUsuarioBuscaUnProducto() {
        homePage.buscarProducto("iMac");
    }
    @Y ("la pagina muestra los productos encontrados")
    public void laPaginaMuestraLosProductosEncontrados () {
        Assert.assertNotNull(searchPage.getProductos ());
    }
    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos (){
        searchPage.agregarFavorito();
    }
    @Entonces("se valida que se agrego a la lista de favoritos")
    public void seValidaQueSeAgregoALaListaDeFavoritos() {
        Assert.assertTrue(searchPage.isVisibleFavorito());
    }
}


