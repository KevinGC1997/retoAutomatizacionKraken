package steps;

import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.RegistroUsuarioPageObject;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;


import static pageObjects.RegistroUsuarioPageObject.txtCajasFormulario;
import static util.VariableGlobal.constante;

public class RegistroUsuarioStep extends KrakenWeb {

    RegistroUsuarioPageObject registroUsuarioPageObject = new RegistroUsuarioPageObject();

    @Step
    public void abrirAdvantage(){
        configuracionesIniciales();
        abrirNavegadorEn(registroUsuarioPageObject);
    }
    @Step
    public void navegarFormularioRegistro() {
        esperarVisibilidadDelObjeto(registroUsuarioPageObject.getBtnUsuario());
        click(registroUsuarioPageObject.getBtnUsuario());
        esperarVisibilidadDelObjeto(registroUsuarioPageObject.getBtnCrearNuevoUsuario());
        click(registroUsuarioPageObject.getBtnCrearNuevoUsuario());

    }
    @Step
    public static List<String> generarData() {
        Faker faker = new Faker();
        String nombre = faker.name().username().substring(1,10);
        String email = faker.internet().emailAddress();
        String contrasena = faker.internet().password(10,12,true);


        List<String> datos = new ArrayList<String>();
        datos.add(nombre);
        datos.add(email);
        datos.add(contrasena);
        datos.add(contrasena);


        return datos;
    }
    @Step
    public void llenarFormularioRegistro() {
        for (int i = 1; i <= constante.size(); i++){
        WebElement campos = getDriver().findElement(By.xpath(txtCajasFormulario.replace(
                "intPosicion",
                Integer.toString(i) )));
            System.out.println(constante);
            campos.sendKeys(constante.get(i-1));
        }
    }
    @Step
    public void realizarRegistro() {
        scrollHaciaElElemento(registroUsuarioPageObject.getLblElementoScroll());
        esperarVisibilidadDelObjeto(registroUsuarioPageObject.getBtnCondiciones());
        click(registroUsuarioPageObject.getBtnCondiciones());
        esperarVisibilidadDelObjeto(registroUsuarioPageObject.getBtnRegistro());
        click(registroUsuarioPageObject.getBtnRegistro());
    }
    @Step
    public void validarRegistroUsuario() {
        esperarVisibilidadDelObjeto(registroUsuarioPageObject.getTxtValidarUsuario());
        validarIgual(registroUsuarioPageObject.getTxtValidarUsuario(),constante.get(0));
    }

}
