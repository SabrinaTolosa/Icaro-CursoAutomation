package com.ST.opencart;


import com.ST.opencart.pages.HomePage;
import com.ST.opencart.pages.LoginPage;
import com.ST.opencart.pages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {

    @Test
    public void login() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        //1)
        getDriver().get("https://opencart.abstracta.us/");

        // 2) y 3)
        homePage.ingresarAlLogin();

        // 4)
        loginPage.login("sabri81@gmail.com", "casita5050");

        // 5)
        Assert.assertEquals(myAccountPage.getTitulo(), "My Account");
    }

}
