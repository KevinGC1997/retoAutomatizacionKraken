package steps;

import com.sqasa.web.demo.utils.KrakenWeb;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import pageObjects.CompraExitosaPageObject;
import pageObjects.RegistroUsuarioPageObject;
import util.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static util.VariableGlobal.constante;

public class CompraExistosaStep extends KrakenWeb {

    CompraExitosaPageObject compraExitosaPageObject = new CompraExitosaPageObject();
    RegistroUsuarioPageObject registroUsuarioPageObject = new RegistroUsuarioPageObject();
    @Step
    public void iniciarSesion() {
        click(registroUsuarioPageObject.getBtnUsuario());
        esperarVisibilidadDelObjeto(compraExitosaPageObject.getLblUsuario());
        escribirTexto(compraExitosaPageObject.getLblUsuario(),constante.get(0));
        System.out.println(constante.get(0));
        escribirTexto(compraExitosaPageObject.getLblContraseña(),constante.get(2));
        System.out.println(constante.get(2));
        click(compraExitosaPageObject.getBtnIniciarSesion());

    }
    @Step
    public void escogerLaptot() {
        esperarVisibilidadDelObjeto(compraExitosaPageObject.getBtnLaptos());
        click(compraExitosaPageObject.getBtnLaptos());
        scrollHaciaElElemento(compraExitosaPageObject.getLblElementoScroll());

        //listo todas las laptos en esta variable tipo list, llamando un unico xpath que ubica todas las laptos
        List<WebElement> laptot = getDriver().findElements(registroUsuarioPageObject.getBtnLaptot());
        //Llamo la varibale tipo list, obtengo el valor en el indice 2 = a la tercer laptot y llamo el metodo click
        laptot.get(2).click();
    }
    @Step
    public void validarTituloLaptot() {
        esperarVisibilidadDelObjeto(compraExitosaPageObject.getTxtTituloLaptot());
        ArrayList<Map<String, String>> dataExcel = null;
        try {
            dataExcel = Excel.readExcel("Data.xlsx", "validacion");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(dataExcel.get(0).get("laptos"));
        System.out.println(getDriver().findElement(compraExitosaPageObject.getTxtTituloLaptot()).getText());
        validarIgual(compraExitosaPageObject.getTxtTituloLaptot(), dataExcel.get(0).get("laptos"));
    }
    @Step
    public void agregarCarritoIrCarrito() {
        esperarQueElObjetoSeaClickeable(compraExitosaPageObject.getBtnAgregarCarrito());
        click(compraExitosaPageObject.getBtnAgregarCarrito());
        esperarQueElObjetoSeaClickeable(compraExitosaPageObject.getBtnCarritoCompras());
        click(compraExitosaPageObject.getBtnCarritoCompras());
    }
    @Step
    public void validarTituloLaptotEnCarrito() {
        ArrayList<Map<String, String>> dataExcel = null;
        try {
            dataExcel = Excel.readExcel("Data.xlsx", "validacion");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getDriver().findElement(compraExitosaPageObject.getTxtTituloLaptotCarrito()).getText());
        System.out.println(dataExcel.get(0).get("laptos"));
        validarIgual(compraExitosaPageObject.getTxtTituloLaptotCarrito(), dataExcel.get(0).get("laptos"));
    }
}
