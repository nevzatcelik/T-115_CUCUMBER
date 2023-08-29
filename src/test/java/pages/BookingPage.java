package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class BookingPage {
    public BookingPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);
    }


}
