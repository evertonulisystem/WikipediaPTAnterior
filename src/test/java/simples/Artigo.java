package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Artigo {
    //Atributos
    String url;
    WebDriver driver;

    @Before
    public void iniciar(){
       url = "https://pt.wikipedia.org/";
       System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(80000, TimeUnit.MILLISECONDS);

}

    @Test
    public void consultarArtigo(){
    //abrir site
        driver.get(url);

    //pesquisar ovo de pascoa
    driver.findElement(By.id("searchInput")).sendKeys("Ovo de Páscoa");
    driver.findElement(By.id("searchButton")).click();

    // validar titulo da pagina- se nao tive linha abixo nao é script de teste
        assertEquals("Ovo de Páscoa - Wikipedia, a enciclopédia livre", driver.getTitle());
        assertTrue(driver.getTitle().contains("Ovo de Páscoa"));

    }

    @After
    public void finalizar(){
         //driver.quit();
    }




}
