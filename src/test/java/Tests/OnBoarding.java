package Tests;

import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class OnBoarding extends BaseClass {
	@Test
    public void testLogin() throws InterruptedException {
		Thread.sleep(5000);
		RemoteWebElement el1 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Get Started"));
		el1.click();
		RemoteWebElement element1 = (RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().textContains(\"2024\"))"));
		

		RemoteWebElement el2 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Accept"));
		el2.click();
		RemoteWebElement el3 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Next"));
		el3.click();
		RemoteWebElement el4 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("How to Disable Android Auto "));
		el4.click();
		RemoteWebElement el5 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("OK"));
		el5.click();
		RemoteWebElement el6 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Go to Wi-Fi Settings"));
		el6.click();
		Thread.sleep(3000);
		RemoteWebElement el9 = (RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Pioneer_H120SC_c539\")"));
		el9.click();
		Thread.sleep(3000);
		RemoteWebElement el10 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Navigate up"));
		el10.click();
		RemoteWebElement el11 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Continue"));
		el11.click();
		RemoteWebElement el12 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Finish"));
		el12.click();
		RemoteWebElement el13 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Skip"));
		el13.click();
		RemoteWebElement el14 = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Close"));
		el14.click();
    }
}
