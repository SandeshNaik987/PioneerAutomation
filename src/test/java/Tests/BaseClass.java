package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.options.BaseOptions;

public class BaseClass {

    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() {
        var options = new BaseOptions()
            .amend("appium:platformName", "Android")
            .amend("appium:deviceName", "ZA222JX8DZ")
            .amend("appium:platformVersion", "14")
            .amend("appium:app", "C:\\application\\app-release1.2.0.13.apk")
            .amend("appium:automationName", "UiAutomator2")
            .amend("appium:newCommandTimeout", 3600);

        driver = new AndroidDriver(getUrl(), options);
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
