package Tests;

import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class OnBoarding extends BaseClass {
	@Test
    public void testLogin() throws InterruptedException {
		Thread.sleep(5000);
		var el1 = driver.findElement(AppiumBy.accessibilityId("Get Started"));
		el1.click();
		RemoteWebElement element1 = (RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().textContains(\"2024\"))"));
		

		var el2 = driver.findElement(AppiumBy.accessibilityId("Accept"));
		el2.click();
		var el3 = driver.findElement(AppiumBy.accessibilityId("Next"));
		el3.click();
		var el4 = driver.findElement(AppiumBy.accessibilityId("How to Disable Android Auto "));
		el4.click();
		var el5 = driver.findElement(AppiumBy.accessibilityId("OK"));
		el5.click();
		var el6 = driver.findElement(AppiumBy.accessibilityId("Go to Wi-Fi Settings"));
		el6.click();
		Thread.sleep(3000);
		var el9 = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Pioneer_H120SC_c539\")"));
		el9.click();
		Thread.sleep(3000);
		var el10 = driver.findElement(AppiumBy.accessibilityId("Navigate up"));
		el10.click();
		var el11 = driver.findElement(AppiumBy.accessibilityId("Continue"));
		el11.click();
		var el12 = driver.findElement(AppiumBy.accessibilityId("Finish"));
		el12.click();
		var el13 = driver.findElement(AppiumBy.accessibilityId("Skip"));
		el13.click();
		var el14 = driver.findElement(AppiumBy.accessibilityId("Close"));
		el14.click();
    }
}
