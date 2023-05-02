package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")
public class RegistroUsuarioPageObject extends PageObject {

    By btnUsuario = By.id("menuUserLink");
    By btnCrearNuevoUsuario = By.xpath("//a[@class='create-new-account ng-scope']");
    public static final String txtCajasFormulario = "(//input[contains(@name, 'RegisterPage')])[intPosicion]";

    //con este xpath puedo ubicar cada laptot y guardarla en la variable de mi step
    By btnLaptot = By.xpath("//div[@class='cell categoryRight']/ul/li");
    By lblElementoScroll = By.xpath("//input[@name='first_nameRegisterPage']");
    By btnCondiciones = By.name("i_agree");
    By btnRegistro = By.id("register_btnundefined");
    By txtValidarUsuario = By.xpath("//a[@id='menuUserLink']");


    public By getBtnUsuario() {
        return btnUsuario;
    }

    public By getBtnCrearNuevoUsuario() {
        return btnCrearNuevoUsuario;
    }

    public By getBtnLaptot() {
        return btnLaptot;
    }

    public By getLblElementoScroll() {
        return lblElementoScroll;
    }

    public By getBtnCondiciones() {
        return btnCondiciones;
    }

    public By getBtnRegistro() {
        return btnRegistro;
    }

    public By getTxtValidarUsuario() {
        return txtValidarUsuario;
    }
}
