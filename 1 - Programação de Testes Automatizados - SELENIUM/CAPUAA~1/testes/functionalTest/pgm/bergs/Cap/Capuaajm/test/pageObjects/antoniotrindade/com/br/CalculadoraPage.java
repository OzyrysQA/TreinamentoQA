package bergs.Cap.Capuaajm.test.pageObjects.antoniotrindade.com.br;

import static bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculadoraPage {

    public CalculadoraPage openPage() {
        getDriver().get("https://antoniotrindade.com.br/treinoautomacao/desafiosoma.html");
        return this;
    }

    public CalculadoraPage insertValor1(String valor1) {
        getDriver().findElement(By.id("number1")).sendKeys(valor1);
        return this;
    }

    public CalculadoraPage insertValor2(String valor2) {
        getDriver().findElement(By.id("number2")).sendKeys(valor2);
        return this;
    }

    public CalculadoraPage clickSomarButton() {
        getDriver().findElement(By.id("somar")).click();
        return this;
    }

    public WebElement getTxtTotal(){
        return getDriver().findElement(By.id("total"));
    }
    
    public String getTotal() {
        return getDriver().findElement(By.id("total")).getAttribute("value");
    }

   
}