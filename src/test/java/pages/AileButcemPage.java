package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)),this);
    }
    public void ilkEkranGecmeMethodu(String girisYapText) throws InterruptedException {
        Thread.sleep(2000);
        for (int i=0; i<6;i++){
            ReusableMethods.screenScroll(924,950,750,150,950);
        }
        ReusableMethods.scrollWithUiScrollableAndClick(girisYapText);
    }
}
