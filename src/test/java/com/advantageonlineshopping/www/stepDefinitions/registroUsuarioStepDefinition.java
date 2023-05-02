package com.advantageonlineshopping.www.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.RegistroUsuarioStep;

public class registroUsuarioStepDefinition {

    @Steps
    RegistroUsuarioStep registroUsuarioStep;

    @Given("^que estoy en el home de advantage shopping$")
    public void queEstoyEnElHomeDeAdvantageShopping() {
        registroUsuarioStep.abrirAdvantage();
    }


    @When("^realizo el registro de un nuevo usuario$")
    public void realizoElRegistroDeUnNuevoUsuario() {
        registroUsuarioStep.navegarFormularioRegistro();
        registroUsuarioStep.llenarFormularioRegistro();
        registroUsuarioStep.realizarRegistro();

    }

    @Then("^Valido que usuario se creo y cierro la pagina$")
    public void validoQueUsuarioSeCreoYCierroLaPagina() {
        registroUsuarioStep.validarRegistroUsuario();
    }
}
