package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;

public class Post extends Base{
    private Base base;
    public Post(Base base) {
        this.base = base;
    }

//    @Dado("^que acessa a Wikipedia em Portugues$")
//    public void queAcessaAWikipediaEmPortugues() {
//        base.driver.get(base.url);
// }
//    @Quando("^pesquiso por \"([^\"]*)\"$")
//    public void pesquisoPor(String produto) {
//        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
//    }
//    @Entao("^Exibe a expressão \"([^\"]*)\" no titulo da guia$")
//    public void exibeAExpressãoNoTituloDaGuia(String produto) {
//
//       //WebDriverWait espera = new WebDriverWait(base.driver, 30);
//       //espera.until(ExpectedConditions.titleIs("Resultados da pesquisa de \"" + produto + "\" - Wikipédia, a enciclopédia livre"));
//       // System.out.println("titulo: "+produto);
//        assertTrue(base.driver.getTitle().contains(produto));
//        System.out.println("titulo: "+base.driver.getTitle());
//    }
    @Given("^que acessa a Wikipedia em Portugues$")
    public void queAcessaAWikipediaEmPortugues() {
        base.driver.get(base.url);
 }
    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto) {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);
    }
    @Then("^Exibe a expressão \"([^\"]*)\" no titulo da guia$")
    public void exibeAExpressãoNoTituloDaGuia(String produto) {

       //WebDriverWait espera = new WebDriverWait(base.driver, 30);
       //espera.until(ExpectedConditions.titleIs("Resultados da pesquisa de \"" + produto + "\" - Wikipédia, a enciclopédia livre"));
       // System.out.println("titulo: "+produto);
        assertTrue(base.driver.getTitle().contains(produto));
        System.out.println("titulo: "+base.driver.getTitle());
    }
}
