package com.ST.clase6;

import com.ST.opencart.BaseTest;
import org.testng.annotations.Test;

public class PrimeraPruebaAutomationTest extends BaseTest {

    @Test
    public void abrirPagina() {

        getDriver().get("https://opencart.abstracta.us/");
    }

}
