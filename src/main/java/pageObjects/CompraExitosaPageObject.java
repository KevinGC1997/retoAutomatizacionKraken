package pageObjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraExitosaPageObject extends PageObject {

    By lblUsuario = By.xpath("//input[@name='username']");
    By lblContraseña = By.xpath("//input[@name='password']");
    By btnIniciarSesion = By.xpath("//button[@id='sign_in_btnundefined']");
    By btnLaptos = By.id("laptopsImg");
    By lblElementoScroll = By.name("buy_now");
    By txtTituloLaptot = By.xpath("//div[@id='Description']/h1");
    By btnAgregarCarrito = By.name("save_to_cart");
    By btnCarritoCompras = By.id("checkOutPopUp");
    By txtTituloLaptotCarrito = By.xpath("(//h3[@class='ng-binding'])[2]");

    public By getLblUsuario() {
        return lblUsuario;
    }

    public By getLblContraseña() {
        return lblContraseña;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getBtnLaptos() {
        return btnLaptos;
    }

    public By getLblElementoScroll() {
        return lblElementoScroll;
    }

    public By getTxtTituloLaptot() {
        return txtTituloLaptot;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    public By getBtnCarritoCompras() {
        return btnCarritoCompras;
    }

    public By getTxtTituloLaptotCarrito() {
        return txtTituloLaptotCarrito;
    }
}
