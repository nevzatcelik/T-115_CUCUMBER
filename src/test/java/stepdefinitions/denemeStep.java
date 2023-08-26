package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;
import utils.ReusableMethods;

public class denemeStep {

    @Given("Kullanici allCurrencyConver uygulamasini acar")
    public void kullanici_all_currency_conver_uygulamasini_acar() {
        Driver.getAndroidDriver();
    }

    @Given("Kullanici para birimlerinin oldugu menuyu acar")
    public void kullanici_para_birimlerinin_oldugu_menuyu_acar() throws InterruptedException {
        ReusableMethods.clickWithCoordinates(431,351,1000);
    }

    @Given("Kullanici bin degerini girsin")
    public void kullanici_bin_degerini_girsin() {
        ReusableMethods.scrollWithUiScrollableAndClick("1");
        for (int i=0; i<3; i++)
        {
            ReusableMethods.scrollWithUiScrollableAndClick("0");
        }
    }
}
