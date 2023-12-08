package bergs.Cap.Capuaajm.core;

import static bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure.getDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class SeleniumTestInfrastructure {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = WebDriverGenerator.getChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        }
        return driver;
    }

   

}
