package com.ST.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
    private By title = By.xpath("//div[@id='logo']/h1/a");
    private By search = By.name("search");
    private By carrousel = By.id("slideshow0");

    private By myAccountBtn = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']"); //a[contains(@href, 'account/login')]

    private By registerBtn = By.xpath("//a[text()='Register']");

    private By searchBtn = By.xpath("//button[@class='btn btn-default btn-lg']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void ingresarAlLogin() {
        click(myAccountBtn);
        click(loginBtn);
    }

    public void ingresarAlRegistro() {
        click(myAccountBtn);
        click(registerBtn);
    }

    public String getTitulo() {
        return getText(title);
    }

    public Boolean buscadorEsVisible() {
        return isDisplayed(search);
    }

    public Boolean carrouselEsVisible() {
        return isDisplayed(carrousel);
    }

    public void buscarProducto (String nombre){
        WebElement searchElem = wait.until(ExpectedConditions.visibilityOfElementLocated(search));
        searchElem.sendKeys(nombre);
        WebElement searchBtnElem = wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
        searchBtnElem.click();
    }
}