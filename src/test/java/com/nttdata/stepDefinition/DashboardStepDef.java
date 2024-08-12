package com.nttdata.stepDefinition;

import com.nttdata.steps.AddProductsStep;
import com.nttdata.steps.CarritoStep;
import com.nttdata.steps.DashboardStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class DashboardStepDef {

    @Steps
    private DashboardStep dashboardStep;

    @Steps
    private AddProductsStep addProductsStep;
    
    @Steps
    private CarritoStep carritoStep;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        dashboardStep.validoProductos();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String producto) {
        addProductsStep.addCar(producto,unidades);

    }

    @Then("valido el carrito de compra actualice correctamente con {string}")
    public void validoElCarritoDeCompraActualiceCorrectamente(String producto) {
        carritoStep.validateProductInCart(producto);
        carritoStep.navigate(addProductsStep);
    }
}
