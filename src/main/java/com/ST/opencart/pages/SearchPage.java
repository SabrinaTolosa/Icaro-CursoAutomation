package com.ST.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SearchPage extends BasePage {


    private By productList = By.xpath("//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']");
    private By agregarFavoritoBtn= By.xpath("//button[@data-original-title='Add to Wish List']");
    private By favoritoBtn= By.xpath("//span[text()='Wish List (1)']");

    private By agregarCarritoBtn= By.xpath("//span[text()='Add to Cart']");
    private By carritoBtn= By.xpath("//span[text()=' 1 item(s) - $122.00']");

    public SearchPage (WebDriver driver) {
        super(driver);

    }

    public WebElement getProductos() {
        WebElement productsElem = wait.until(ExpectedConditions.visibilityOfElementLocated(productList));
        return productsElem;
    }

    public void agregarFavorito (){
        WebElement favoritoBtnElem = wait.until(ExpectedConditions.elementToBeClickable(agregarFavoritoBtn));
        favoritoBtnElem.click();
    }

    public boolean isVisibleFavorito (){
        return isDisplayed(favoritoBtn);
    }
    public void agregarCarrito (){
        WebElement carritoBtnElem = wait.until(ExpectedConditions.elementToBeClickable(agregarCarritoBtn));
        carritoBtnElem.click();
    }

    public boolean isVisibleCarrito (){
        return isDisplayed(carritoBtn);
    }
}
