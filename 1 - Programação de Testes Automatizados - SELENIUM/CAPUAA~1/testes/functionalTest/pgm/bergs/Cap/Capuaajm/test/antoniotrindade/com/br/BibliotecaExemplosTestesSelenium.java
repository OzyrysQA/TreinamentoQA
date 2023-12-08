package bergs.Cap.Capuaajm.test.antoniotrindade.com.br;

// Importa todas as classes Asserts
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import bergs.Cap.Capuaajm.core.SeleniumTestInfrastructure;
import bergs.Cap.Capuaajm.core.TestBase;

import org.junit.jupiter.api.TestInstance;

import dev.failsafe.internal.util.Assert;


public class BibliotecaExemplosTestesSelenium extends TestBase{

    
    @BeforeEach
    public void setUp() {
        setDriver(SeleniumTestInfrastructure.getDriver());
        getDriver().get("https://antoniotrindade.com.br/treinoautomacao/elementsweb.html");
    }

    

    @Test
    public void testarTxtBox1_TextoOlaMundo() throws InterruptedException {
        WebElement txtBox1 = getDriver().findElement(By.name("txtbox1"));
        txtBox1.sendKeys("Olá mundo!");
        // Imprimindo valor do txt no console para conferência
        System.out.println(txtBox1.getAttribute("value"));
        assertTrue(txtBox1.getAttribute("value").equals("Olá mundo!"));
        
    }
    
    // Método de validação de CPF válido
    private boolean isCPF(String cpf) {
        if (cpf == null || cpf.length() != 11 || !cpf.chars().allMatch(Character::isDigit)) {
            return false;
        }

        int[] numbers = cpf.chars().map(Character::getNumericValue).toArray();

        int sum1 = 0;
        for (int i = 0; i < 9; i++) {
            sum1 += numbers[i] * (10 - i);
        }

        int checkDigit1 = sum1 % 11;
        checkDigit1 = checkDigit1 < 2 ? 0 : 11 - checkDigit1;

        int sum2 = 0;
        for (int i = 0; i < 9; i++) {
            sum2 += numbers[i] * (11 - i);
        }
        sum2 += checkDigit1 * 2;

        int checkDigit2 = sum2 % 11;
        checkDigit2 = checkDigit2 < 2 ? 0 : 11 - checkDigit2;

        return checkDigit1 == numbers[9] && checkDigit2 == numbers[10];
    }
    
    @Test
    public void testarTxtBox1_Ativo() throws InterruptedException {
        WebElement txtBox1 = getDriver().findElement(By.name("txtbox1"));
        assertTrue(txtBox1.isEnabled() == true);
       
    }

    @Test
    public void testarTxtBox2_Inativo() throws InterruptedException {
        WebElement txtBox2 = getDriver().findElement(By.name("txtbox2"));
        assertTrue(txtBox2.isEnabled() == false);
        
    }

    @Test
    public void testarListaRadioGroup1_TestaValores() throws InterruptedException {
        // Encontra todos os elementos do radioGroup1
        List<WebElement> radioGroup1 = getDriver().findElements(By.name("radioGroup1"));

        // Verifica se o radioGroup1 não está vazio
        assertFalse(radioGroup1.isEmpty());

        // Verifica se a lista de Radio Buttons possui 4 elementos
        assertEquals(4, radioGroup1.size());
        for (WebElement radioButton : radioGroup1) {
            // Clica no botão de rádio
            radioButton.click();
            System.out.println(radioButton.getAttribute("value"));
            // Verifica se o botão de rádio está selecionado
            assertTrue(radioButton.isSelected());

            // Pausa para visualização
            Thread.sleep(1000);
            

        }
        

    }

    @Test
    public void testarMultipleSelectDropdown_SelecionarItem7() {
        // Localiza o dropdown e cria um objeto Select.
        Select select = new Select(getDriver().findElement(By.name("multiselectdropdown")));

        // Seleciona a opção "Item 7" no dropdown.
        select.selectByVisibleText("Item 7");

        // Obtém e imprime o texto da opção selecionada.
        String selectedText = select.getFirstSelectedOption().getText();
        System.out.println(selectedText);

        // Verifica se o texto selecionado é "Item 7".
        assertEquals("Item 7", selectedText);
        
    }

    @Test
    public void testarMultipleSelectDropdown_SelecionarItens3e7() {
        // Localiza o dropdown e cria um objeto Select.
        Select select = new Select(getDriver().findElement(By.name("multiselectdropdown")));

        // Seleciona as opções "Item 3" e "Item 7" no dropdown.
        select.selectByVisibleText("Item 3");
        select.selectByVisibleText("Item 7");

        // Obtém todas as opções selecionadas no dropdown.
        List<WebElement> selectedOptions = select.getAllSelectedOptions();

        // Valida se foram selecionados 2 itens
        assertEquals(2, selectedOptions.size());

        // Cria uma lista para armazenar os textos das opções selecionadas.
        List<String> selectedTexts = new ArrayList<>();
        for (WebElement option : selectedOptions) {
            String text = option.getText();
            selectedTexts.add(text);
            // Imprime o texto da opção selecionada no console.
            System.out.println(text);
        }

        // Verifica se os textos selecionados são "Item 3" e "Item 7".
        assertTrue(selectedTexts.contains("Item 3"));
        assertTrue(selectedTexts.contains("Item 7"));
       
    }

    @Test
    public void testIframe1_TestarInputTextCliqueButton() throws InterruptedException {
        // Acessa o iframe.
        getDriver().switchTo().frame("frame1");

        // Encontra o input text e escreve "Olá Iframe".
        WebElement inputText = getDriver().findElement(By.id("tfiframe"));
        inputText.sendKeys("Olá Iframe");

        // Clica no botão.
        WebElement button = getDriver().findElement(By.id("btniframe"));
        button.click();

        // Lida com o alerta.
        Alert alert = getDriver().switchTo().alert();
        // Obtém o texto do alerta.
        String alertText = alert.getText();
        System.out.println(alertText);
        // Valida se o texto do alerta é "Click OK!".
        assertEquals("Click OK!", alertText);
        // Pausa para visualização
        Thread.sleep(3000);
        // Fecha o alerta.
        alert.accept();

        // Valida se o texto do input é "Olá Iframe".
        String inputValue = inputText.getAttribute("value");
        System.out.println(inputValue);
        assertEquals("Olá Iframe", inputValue);

        // Volta para o contexto principal da página.
        getDriver().switchTo().defaultContent();

        // Encontra o elemento h3 que esteja dentro da 6ª div da página com id "elementos" e que tenha a classe "text-muted".
        // WebElement h3Element = getDriver().findElement(By.xpath("//div[@id='elementos'][6]/h3[@class='text-muted']"));
        // **MELHOR FORMA: buscar WebElement pelo texto interno do html, para evitar que o código da linha de cima quebre se alguém adicionar uma div a
        // mais antes do da div desejada pela busca
        WebElement h3Element = getDriver().findElement(By.xpath("//h3[text()='iFrame:']"));
        // Obtém o conteúdo interno do elemento h3.
        String h3Text = h3Element.getAttribute("innerHTML");
        System.out.println(h3Text);
        // Valida se o conteúdo interno do h3 é "iFrame:".
        assertEquals("iFrame:", h3Text.trim());
       
    }

    @Test
    public void testAlertButton() throws InterruptedException {
        // Clica no botão de alerta.
        WebElement alertButton = getDriver().findElement(By.name("alertbtn"));
        alertButton.click();
        // Pausa para visualização
        Thread.sleep(3000);
        // Lida com o alerta.
        Alert alert = getDriver().switchTo().alert();
        // Valida se o texto do alerta é "Eu sou um alerta!".
        String alertText = alert.getText();
        System.out.println(alertText);
        assertEquals("Eu sou um alerta!", alertText);
        // Fecha o alerta.
        alert.accept();
        
    }

    @Test
    public void testConfirmButton() throws InterruptedException {
        // Clica no botão de confirmação.
        WebElement confirmButton = getDriver().findElement(By.name("confirmbtn"));
        confirmButton.click();
        // Pausa para visualização
        Thread.sleep(3000);

        // Lida com o alerta.
        Alert alert = getDriver().switchTo().alert();
        // Valida se o texto do alerta é "Pressione um botão!".
        String alertText = alert.getText();
        System.out.println(alertText);
        assertEquals("Pressione um botão!", alertText);
        // Fecha o alerta.
        alert.accept();
       
    }

    // Notação para desativar um teste
    @Disabled
    @Test
    public void testPromptButton() throws InterruptedException {
        // Clica no botão de prompt.
        WebElement promptButton = getDriver().findElement(By.id("promptBtn"));
        promptButton.click();
        // Pausa para visualização
        Thread.sleep(3000);
        // Lida com o alerta.
        Alert alert = getDriver().switchTo().alert();
        // Valida se o texto do alerta é "Por favor, insira seu nome:".
        String alertText = alert.getText();
        System.out.println(alertText);
        assertEquals("Digite o ano:", alertText);
        // Fecha o alerta.
        alert.accept();
        
    }

    @Test
    public void testarMultiplasAbas_ValidarTitulosFecharAbas() throws InterruptedException {
        // Navega para a url desejada
        getDriver().navigate().to("https://antoniotrindade.com.br/treinoautomacao/");
        ArrayList<String> tabs = null;
        // Encontra todos os links na div.
        List<WebElement> links = getDriver().findElements(By.xpath("//div[@class='links']/a"));

        // Armazena a aba original para voltar a ela mais tarde.
        String originalTab = getDriver().getWindowHandle();
        // Abre cada link em uma nova aba e valida o título da página.
        for (WebElement link : links) {
            // Clica no link (isso vai abrir uma nova aba).
            link.click();
            // Pausa para visualização
            Thread.sleep(1000);

            // Muda para a nova aba.
            tabs = new ArrayList<>(getDriver().getWindowHandles());
            getDriver().switchTo().window(tabs.get(tabs.size() - 1));

            // Valida o título da página.
            String tabTitle = getDriver().getTitle(); // Substitua por o título esperado para cada página.
            System.out.println(tabTitle);

            // Volta para aba original
            getDriver().switchTo().window(originalTab);
        }
        // Fecha a última e penúltima aba.
        tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tabs.size() - 1));
        getDriver().close();
        getDriver().switchTo().window(tabs.get(tabs.size() - 2));
        getDriver().close();
        tabs = new ArrayList<>(getDriver().getWindowHandles());

        // Valida se realmente fechou 2 abas e sobraram 4 abas abertas
        assertEquals(5, tabs.size());

        // Volta para a aba original
        getDriver().switchTo().window(originalTab);

        // Valida se voltou para a aba original pelo título
        String originalTabTitle = getDriver().getTitle();
        System.out.println(originalTabTitle);
        assertEquals("Treino Automação de Testes", originalTabTitle);
        

    }
    
    @Test
    public void testarNavegacao_BackFoward() throws InterruptedException {
        // Navega para a url desejada
        getDriver().navigate().to("https://antoniotrindade.com.br/treinoautomacao/");
        
        // Acha link Calculadora, navega para ele e depois volta para a página original
        WebElement linkCalculadora = getDriver().findElement(By.linkText("Calculadora"));
        linkCalculadora.click();
        
        // Valida se realmente foi para a página Calculadora
        assertEquals("Desafio Automação Cálculos", getDriver().getTitle());
        // Volta para a HOME
        getDriver().navigate().back();
        
        // Valida se realmente voltou para a HOME
        assertEquals("Treino Automação de Testes", getDriver().getTitle());
        
        // Avança a navegação novamente para a página  calculadora
        getDriver().navigate().forward();
        
        // Valida se realmente foi para a página Calculadora
        assertEquals("Desafio Automação Cálculos", getDriver().getTitle());
       
        
    }
    
    @Test
    public void testGerarCpf() {
        
        getDriver().navigate().to("https://www.geradordecpf.org/");

        WebElement btnGerarCpf = getDriver().findElement(By.id("btn-gerar-cpf"));
        btnGerarCpf.click();

        WebElement txtCpf = getDriver().findElement(By.id("numero"));
        String cpf = txtCpf.getAttribute("value");
        System.out.println(cpf);
        
        // Valida se o CPF tem 11 dígitos
        assertTrue(cpf.matches("^\\d{11}$"));
        
        // Valisa se o CPF é válido
        assertTrue(isCPF(cpf));
        getDriver().close();
        
    }
   
    @Test
    public void testDragAndDrop() throws InterruptedException, IOException {
        
        getDriver().navigate().to("http://jqueryui.com/droppable/");

        // Precisamos mudar para o iframe que contém os elementos arrastáveis
        getDriver().switchTo().frame(0);

        // Configurando Screen Shot nativo de tirar fotos para relatórios
        File scrnShot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // Salva foto antes de arrastar
        FileUtils.copyFile(scrnShot, new File("ScreenShots/Image_AntesArrastar.jpg"));
        
        WebElement draggable = getDriver().findElement(By.id("draggable"));
        WebElement droppable = getDriver().findElement(By.id("droppable"));

        Actions actions = new Actions(getDriver());

        actions.dragAndDrop(draggable, droppable).perform();
        
        // Pausa para visualização
        Thread.sleep(3000);
        
        // Tira NOVO SCREEN SHOT
        scrnShot = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
        // Salva foto depois de arrastar
        FileUtils.copyFile(scrnShot, new File("ScreenShots/Image_DepoisArrastar.jpg"));
        
        // Verifica se o texto "Dropped!" está presente
        String text = droppable.findElement(By.tagName("p")).getText();
        System.out.println(text);
        assertEquals("Dropped!", text);
        
               
    }
    
    @Test
    public void testTable_LocalizaTdMilene() {
       
        getDriver().navigate().to("https://antoniotrindade.com.br/treinoautomacao/localizandovalorestable.html");

        // OUTRO MODO DE FAZER PROCURANDO EM QUALQUER WEB ELEMENT: (By.xpath("//*[contains(text(),'Milene')]"));
        // Utilizando locator Contains que procura partes do texto no elemento desejado
        WebElement tdMilene = getDriver().findElement(By.xpath("//td[contains(text(),'Milene')]"));
        System.out.println(tdMilene.getText());
        assertNotNull(tdMilene);

        
    }

}
