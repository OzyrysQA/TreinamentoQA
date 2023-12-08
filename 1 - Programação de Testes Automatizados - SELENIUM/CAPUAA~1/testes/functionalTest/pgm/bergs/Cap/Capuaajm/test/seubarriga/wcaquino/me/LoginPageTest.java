package bergs.Cap.Capuaajm.test.seubarriga.wcaquino.me;

import bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure;
import bergs.Cap.Capuaajm.core.TestBase;
import bergs.Cap.Capuaajm.test.pageObjects.*;
import bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me.HomePage;
import bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me.LoginPage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage; 
    
    @BeforeEach
    public void setUp() {
        setDriver(SeleniumTestInfrastructure.getDriver());
        loginPage = new LoginPage();
    }

    @Test
    public void testLogin_Valido() throws InterruptedException {
        loginPage.openPage();
        loginPage.insertEmail("ozyrys.poa@gmail.com");
        loginPage.insertPassword("ozy");
        // Após o login, cria um objeto HomePage para começar a interagir na próxima págiona
        homePage = loginPage.clickLoginButton();
        
        // Aqui você pode adicionar asserções para verificar se o login foi bem-sucedido
        // Por exemplo, você pode verificar se um elemento específico está presente na HomePage
        assertTrue(homePage.isAtHomePage());
        
    }
    

    @Test
    public void testLogin_SenhaInvalida() throws InterruptedException {
        loginPage.openPage();
        loginPage.insertEmail("ozyrys.poa@gmail.com");
        loginPage.insertPassword("ozyrys");
        // Faz o login com senha errada
        loginPage.clickLoginButton();

        // Valida se o login deu mensagem de erro de login inválido
        assertEquals("Problemas com o login do usuário",loginPage.getMessageError());
        
    }
}