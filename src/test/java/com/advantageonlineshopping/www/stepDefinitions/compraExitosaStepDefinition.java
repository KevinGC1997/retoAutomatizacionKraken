package com.advantageonlineshopping.www.stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.CompraExistosaStep;
import steps.RegistroUsuarioStep;

public class compraExitosaStepDefinition {
    @Steps
    CompraExistosaStep compraExistosaStep = new CompraExistosaStep();

    @Steps
    RegistroUsuarioStep registroUsuarioStep = new RegistroUsuarioStep();

    @When("^Realizo inicio de sesion y valido que el inicio de sesion fue exitoso$")
    public void realizoInicioDeSesionYValidoQueElInicioDeSesionFueExitoso() {
       compraExistosaStep.iniciarSesion();
       registroUsuarioStep.validarRegistroUsuario();
    }

    @When("^Selecciono una laptop y valido el nombre$")
    public void seleccionoUnaLaptopYValidoElNombre() {
        compraExistosaStep.escogerLaptot();
        compraExistosaStep.validarTituloLaptot();
    }

    @When("^Agrego el carrito al carro y navego al pago$")
    public void agregoElCarritoAlCarroYNavegoAlPago() {
        compraExistosaStep.agregarCarritoIrCarrito();
    }

    @Then("^Valido que el nombre de la laptop sea la misma a la escogida y cierro la pagina$")
    public void validoQueElNombreDeLaLaptopSeaLaMismaALaEscogidaYCierroLaPagina() {
        compraExistosaStep.validarTituloLaptotEnCarrito();
    }
}
