package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

public class BaseClassTest {

    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() {
        DesiredCapabilities cap=new DesiredCapabilities();
            cap.setCapability("appium:platformName", "Android");
            cap.setCapability("appium:deviceName", "ZA222JX8DZ");
            cap.setCapability("appium:platformVersion", "14");
            cap.setCapability("appium:app", "C:\\application\\app-release1.2.0.13.apk");
            cap.setCapability("appium:automationName", "UiAutomator2");
            cap.setCapability("appium:newCommandTimeout", 3600);

        driver = new AndroidDriver(getUrl(), cap);
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            throw new RuntimeException("Invalid URL", e);
        }
    } 
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
