package com.ST.stepDefinitions;

import com.ST.hooks.Hooks;
import com.ST.opencart.pages.AccountPage;
import com.ST.opencart.pages.RegisterPage;
import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class RegisterDefinitions {
    private RegisterPage registerPage;
    private AccountPage accountPage;

    public RegisterDefinitions() {
        this.registerPage = new RegisterPage(Hooks.getDriver());
        this.accountPage = new AccountPage(Hooks.getDriver());
    }

    @Cuando("el usuario se registra con nombre {string}, apellido {string}, email {string}, telefono {string} y pass {string}")
    public void elUsuarioSeRegistraConNombreApellidoEmailTelefonoYPass(String nombre,
                                                                       String apellido,
                                                                       String email,
                                                                       String telefono,
                                                                       String password) {
        registerPage.completarFormulario(nombre, apellido, email, telefono, password);
    }

    @Entonces("se verifica que la cuenta se creo correctamente")
    public void seVerificaQueLaCuentaSeCreoCorrectamente() {
        Assert.assertEquals(accountPage.getTitulo(), "Account");
        Assert.assertTrue(accountPage.descriptionIsDisplayed());
    }

    @Cuando("el usuario se registra con datos validos")
    public void elUsuarioSeRegistaConDatosValidos() {
        Faker faker= new Faker();
        
        registerPage.completarFormulario(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().phoneNumber(),
                faker.internet().password()
        );

    }

//    @Entonces("se verifica el mensaje de error {string}")
//    public void seVerificaElMensajeDeError(String mensaje) {
//        Assert.assertEquals(accountPage.getMensajeDeError(), mensaje);
//    }
}

