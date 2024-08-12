package com.nttdata.stepDefinition;

import com.nttdata.steps.DashboardStep;
import com.nttdata.steps.LoginStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class LoginStepDef {

    @Steps
    LoginStep loginStep;

    @Steps
    DashboardStep dashboardStep;

    @Given("estoy en la aplicación de SauceLabs me voy al menu y me logeo")
    public void estoyEnLaAplicaciónDeSauceLabsMeVoyAlMenuYMeLogeo() {

        loginStep.navegation();
    }

    @And("inicio sesión con mi usuario {string} y clave {string}")
    public void inicioSesiónConMiUsuarioYClave(String usuario, String clave) {
        loginStep.username(usuario);
        loginStep.password(clave);
    }

    @And("hago clic en LOGIN")
    public void hagoClicEnLOGIN() {
        loginStep.Ingresar();
    }

    @Then("valido el login OK")
    public void validoElLoginOK() {
        dashboardStep.validoProductos();
    }
}
