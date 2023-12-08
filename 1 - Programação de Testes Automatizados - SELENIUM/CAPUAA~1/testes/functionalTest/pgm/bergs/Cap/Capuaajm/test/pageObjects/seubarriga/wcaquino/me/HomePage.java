package bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me;

import java.time.Duration;
import static bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure;

public class HomePage {
    WebDriverWait wait;
    
    public HomePage() {
        wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    }
    
    
    public boolean isAtHomePage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("footer")));
        String footerText = SeleniumTestInfrastructure.getDriver().findElement(By.tagName("footer")).getText();
        System.out.println(footerText);
        return footerText.contains("Seu Barriga. Nunca mais esqueça de pagar o aluguel.");
    }
    
    public HomePage clickHome() {
        getDriver().findElement(By.linkText("Home")).click();
        return this;
    }

    public AdicionarContaPage clickContasAdicionar() {
        
        getDriver().findElement(By.linkText("Contas")).click();
        WebElement adicionarLink = getDriver().findElement(By.linkText("Adicionar"));
        wait.until(ExpectedConditions.visibilityOf(adicionarLink));
        adicionarLink.click();
        return new AdicionarContaPage();
    }

    
    // TODO criar ListarContaPage para retornar
    public ListarContaPage clickContasListar() {
        getDriver().findElement(By.linkText("Listar")).click();
        return new ListarContaPage();
    }

    // TODO
    public HomePage clickCriarMovimentacao() {
        getDriver().findElement(By.linkText("Criar Movimentação")).click();
        return this;
    }

    // TODO
    public HomePage clickResumoMensal() {
        getDriver().findElement(By.linkText("Resumo Mensal")).click();
        return this;
    }

    // TODO
    public HomePage clickSair() {
        getDriver().findElement(By.linkText("Sair")).click();
        return this;
    }
    
}