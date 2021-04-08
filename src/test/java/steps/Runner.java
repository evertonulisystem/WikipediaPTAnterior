package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = false,
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/relatorioSimples",
                "json:target/relatorioSimples.json", //ate aqui é o relatorio simples padrao sem virgula
//                "com.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html" //se der erro veja esta lina
                  "com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/dashboard.html" //se der erro veja esta lina
     }

)
public class Runner {

}
