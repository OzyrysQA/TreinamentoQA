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
        // Ap�s o login, cria um objeto HomePage para come�ar a interagir na pr�xima p�giona
        homePage = loginPage.clickLoginButton();
        
        // Aqui voc� pode adicionar asser��es para verificar se o login foi bem-sucedido
        // Por exemplo, voc� pode verificar se um elemento espec�fico est� presente na HomePage
        assertTrue(homePage.isAtHomePage());
        
    }
    

    @Test
    public void testLogin_SenhaInvalida() throws InterruptedException {
        loginPage.openPage();
        loginPage.insertEmail("ozyrys.poa@gmail.com");
        loginPage.insertPassword("ozyrys");
        // Faz o login com senha errada
        loginPage.clickLoginButton();

        // Valida se o login deu mensagem de erro de login inv�lido
        assertEquals("Problemas com o login do usu�rio",loginPage.getMessageError());
        
    }
}