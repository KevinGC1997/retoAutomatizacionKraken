package com.advantageonlineshopping.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        tags = {"@registroUsuario"},
        features = "src/test/resources/feature/registroUsuario.feature",
        glue = "com.advantageonlineshopping.www.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class registroUsuarioRunner {
}
