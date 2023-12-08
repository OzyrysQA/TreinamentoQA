package bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me;


import static bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;


public class LoginPage {
    

    public LoginPage openPage() {
        getDriver().get("https://seubarriga.wcaquino.me/login");
        return this;
    }

    public LoginPage insertEmail(String email) {
        getDriver().findElement(By.id("email")).sendKeys(email);
        return this;
    }

    public LoginPage insertPassword(String password) {
        getDriver().findElement(By.id("senha")).sendKeys(password);
        return this;
    }

    public HomePage clickLoginButton() {
        getDriver().findElement(By.className("btn-primary")).click();
        return new HomePage();
    }
    
    public String getMessageError()
    {
        String messageError = getDriver().findElement(By.className("alert-danger")).getText();
        System.out.println(messageError);
        return messageError;
    }
    
    
    
    

}
