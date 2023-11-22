package com.ST.opencart;

import com.ST.opencart.pages.AccountPage;
import com.ST.opencart.pages.HomePage;
import com.ST.opencart.pages.RegisterPage;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    @Test
    public void createAccount() {
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage (getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        Faker faker = new Faker();
        getDriver().get("https://opencart.abstracta.us/");

        homePage.ingresarAlRegistro ();
        registerPage.completarFormulario (
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password());

        Assert.assertEquals(accountPage.getTitulo(), "Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());

    }
}
