package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {


    private static AndroidDriver appiumDriver;

    static final String TELEFONADI="Pixel 2";
    static final String ANDROIDVERSION="10.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";

    public static AndroidDriver getAndroidDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {

            DesiredCapabilities caps =new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, TELEFONADI);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, ANDROIDVERSION);
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM);
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, OTOMASYON_ISMI);
            caps.setCapability(MobileCapabilityType.NO_RESET,false);
            // true uygulama sifirlanmiyor onceki adimlari muhafaza ediyor
            //false ise her test baslangicinda uygulamayi sifirliyor ve uygulama en bastan basliyor
            caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
            caps.setCapability("chromedriverExecutable","C:\\Users\\ahmet\\IdeaProjects\\T_115-Appium\\driver\\chromedriver.exe");

            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver<>(appiumServerURL,caps);
                appiumDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            }else {

                throw new UnsupportedOperationException("Invalid Platform Name ");

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.closeApp();
            appiumDriver = null;
        }
    }
}
