package bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me;

import java.time.Duration;
import static bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class AdicionarContaPage {
    public boolean isAtAdicionarContaPage() {
        
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-primary")));
        
        WebElement nomeLabel = getDriver().findElement(By.xpath("//label[@for='nome']"));
        String  nomeLabelText = nomeLabel.getText();
        System.out.println(nomeLabelText);
        return nomeLabelText.contains("Nome");
    }
}