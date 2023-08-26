package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = {"src/test/resources/features","src/test/resources/ApiFeatures"},
        glue = "stepdefinitions",
        tags = "@aileButcem",
        dryRun = false
        //  eger dryRun degeri TRUE ise bize sadece varsa eksik adimlari verir yoksa passed olur fakat buradaki testin passed olmasi
        // Testin gercek anlamda passed olmasi degil eksik adim olmamasidir

        // Eger false olur eksik adimlari tamamladiktan sonra ilgili stepleri kosturmak icin testlerimizi calistirir
)
public class runner {

}
