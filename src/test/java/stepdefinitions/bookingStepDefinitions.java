package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;
import utils.Driver;

public class bookingStepDefinitions {

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String url) {
    BrowserDriver.getAndroidDriver().get(url);
    }
    @Given("Cookies i kabul eder")
    public void cookies_i_kabul_eder() {

    }
    @Given("sag ust uc cizgi menuye tiklar")
    public void sag_ust_uc_cizgi_menuye_tiklar() {

    }
    @Given("para birimi bolumunde degisiklik yaparak euro secer")
    public void para_birimi_bolumunde_degisiklik_yaparak_euro_secer() {

    }
    @Given("dil i turkce olarak degistirir")
    public void dil_i_turkce_olarak_degistirir() {

    }
    @Given("arama bolume antalya yazilir ve arama yapilir")
    public void arama_bolume_antalya_yazilir_ve_arama_yapilir() {

    }
    @Given("gelen otel puanin {double} den yuksek oldugu dogrulanir")
    public void gelen_otel_puanin_den_yuksek_oldugu_dogrulanir(Double double1) {

    }
    @Given("uygulama kapatilir")
    public void uygulama_kapatilir() {

    }

}
