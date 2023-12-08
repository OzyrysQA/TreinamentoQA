package bergs.Cap.Capuaajm.test.seubarriga.wcaquino.me;

import bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure;
import bergs.Cap.Capuaajm.core.TestBase;
import bergs.Cap.Capuaajm.test.pageObjects.seubarriga.wcaquino.me.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdicionarContaPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    AdicionarContaPage adicionarContaPage;
    
    @BeforeEach
    public void setUp() {
        setDriver(SeleniumTestInfrastructure.getDriver());
        loginPage = new LoginPage();
    }

    @Test
    public void testarCadastrarConta_ValidarNaLista() throws InterruptedException {
        loginPage.openPage();
        loginPage.insertEmail("ozyrys.poa@gmail.com");
        loginPage.insertPassword("ozy");
        // Ap�s o login, cria um objeto HomePage para come�ar a interagir na pr�xima p�giona
        homePage = loginPage.clickLoginButton();
        
        // Aqui voc� pode adicionar asser��es para verificar se o login foi bem-sucedido
        // Por exemplo, voc� pode verificar se um elemento espec�fico est� presente na HomePage
        assertTrue(homePage.isAtHomePage());

        adicionarContaPage = homePage.clickContasAdicionar();
        assertTrue(adicionarContaPage.isAtAdicionarContaPage());
        
        // TODO cadastrar conta
        
        // TODO navegar at� a lista e validar que a conta foi criada
    }
    
}