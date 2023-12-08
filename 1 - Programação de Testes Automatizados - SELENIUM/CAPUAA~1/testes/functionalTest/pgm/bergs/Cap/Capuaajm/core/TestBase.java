package bergs.Cap.Capuaajm.core;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;

public abstract class TestBase {
    
    private WebDriver driver;
    
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return this.driver;
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
