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
        // Após o login, cria um objeto HomePage para começar a interagir na próxima págiona
        homePage = loginPage.clickLoginButton();
        
        // Aqui você pode adicionar asserções para verificar se o login foi bem-sucedido
        // Por exemplo, você pode verificar se um elemento específico está presente na HomePage
        assertTrue(homePage.isAtHomePage());

        adicionarContaPage = homePage.clickContasAdicionar();
        assertTrue(adicionarContaPage.isAtAdicionarContaPage());
        
        // TODO cadastrar conta
        
        // TODO navegar até a lista e validar que a conta foi criada
    }
    
}