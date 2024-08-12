package com.nttdata.stepDefinition;

import com.nttdata.steps.CatalogoOrderStep;
import com.nttdata.steps.DashboardStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class CatalogOrderStepDef {

    @Steps
    DashboardStep dashboardStep;

    @Steps
    CatalogoOrderStep catalogoOrderStep;

    @Given("estoy en la aplicación de SauceLabs voy al menu de orden")
    public void estoyEnLaAplicaciónDeSauceLabsVoyAlMenuDeOrden() {
    }

    @And("ordeno de forma decendente")
    public void ordenoDeFormaDecendente() {
        catalogoOrderStep.ordenList();
    }

    @Then("valido que carguen correctamente la galeria")
    public void validoQueCarguenCorrectamenteLaGaleria() {
        dashboardStep.validoProductos();
    }
}
