package com.ST.stepDefinitions;

import com.ST.hooks.Hooks;
import com.ST.opencart.pages.LoginPage;
import com.ST.opencart.pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario ingresa credenciales validas")
    public void elUsuarioIngresaCredencialesValidas() {
        loginPage.login(Hooks.getConfigValue("username"), Hooks.getConfigValue("password"));
    }

    @Entonces("se valida que el usuario se encuentra en su cuenta")
    public void seValidaQueElUsuarioSeEncuentraEnSuCuenta() {
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }
}

