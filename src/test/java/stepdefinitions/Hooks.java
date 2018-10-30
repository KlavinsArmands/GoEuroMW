package stepdefinitions;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {

    public static void main(String[] args) {

        //Set the Desired Capabilities
        DesiredCapabilities cap=new DesiredCapabilities();

        cap.setCapability(CapabilityType.PLATFORM, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, MobileBrowserType.BROWSER);

        //Set ChromeDriver location
        System.setProperty("webdriver.chrome.driver","C:\\C:\\Users\\TDL\\Documents\\chromedriver.exe");

        //Instantiate Appium Driver
        AppiumDriver<MobileElement> driver = null;
        try {
            driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }

        //Open URL in Chrome Browser
        driver.get("http://www.goeuro.com");
    }
}
