package bergs.Cap.Capuaajm.test.antoniotrindade.com.br;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure;
import bergs.Cap.Capuaajm.core.TestBase;
import bergs.Cap.Capuaajm.test.pageObjects.*;
import bergs.Cap.Capuaajm.test.pageObjects.antoniotrindade.com.br.CalculadoraPage;
public class CalculadoraPageTest extends TestBase {
    CalculadoraPage calculadoraPage;
    
    @BeforeEach
    public void setUp() {
        setDriver(SeleniumTestInfrastructure.getDriver());
        calculadoraPage = new CalculadoraPage();
    }

    @Test
    public void testeSomar_Valido() {
        calculadoraPage.openPage();
        calculadoraPage.insertValor1("1");
        calculadoraPage.insertValor2("2");
        calculadoraPage.clickSomarButton();
        
        // Utiliza espera implícita para driver aguardar até 10s para que o texto "3" apareça no WebElement total no atributo "value" 
        WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementValue(calculadoraPage.getTxtTotal(), "3"));

        String total = calculadoraPage.getTotal();
        System.out.println(total);
        assertEquals("3", total);
    }
    
    
}
