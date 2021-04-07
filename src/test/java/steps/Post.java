package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Post extends Base{

    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Dado("^que acessa a Wikipedia em Portugues$")
    public void queAcessaAWikipediaEmPortugues() {
        base.driver.get(base.url);


    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Entao("^Exibe a express�o \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpress�oNoTituloDaGuia(String produto) {


        //WebDriverWait espera = new WebDriverWait(base.driver, 30);
        //espera.until(ExpectedConditions.titleIs("Resultados da pesquisa de \"" + produto + "\" - Wikip�dia, a enciclop�dia livre"));


       // System.out.println("titulo: "+produto);
        assertTrue(base.driver.getTitle().contains(produto));
        System.out.println("titulo: "+base.driver.getTitle());


    }
}
