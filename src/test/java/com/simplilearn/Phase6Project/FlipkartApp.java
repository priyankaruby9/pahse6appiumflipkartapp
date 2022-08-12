package com.simplilearn.Phase6Project;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FlipkartApp {

  private AndroidDriver<MobileElement> driver;
 // TouchAction touchAction=new TouchAction(driver);
  @BeforeMethod

  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
    browserstackOptions.put("userName", "preetisingh_xkQYzS");
    browserstackOptions.put("accessKey", "uX1wRWCyXPyxyxLXRmzR");
    desiredCapabilities.setCapability("appium:deviceName", "Google Pixel3");
    desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:app", "bs://a85108d2b57a31fea8eddce7e57a63bd302b4280");
    desiredCapabilities.setCapability("appium:os_version", "9.0");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    //desiredCapabilities.setCapability("bstack:options",{"source":"appiumdesktop"});
    desiredCapabilities.setCapability("bstack:options",browserstackOptions);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

    URL remoteUrl = new URL("https://hub-cloud.browserstack.com:443/wd/hub");
   /* desiredCapabilities.setCapability("platformName", "Android");
    desiredCapabilities.setCapability("appium:platformVersion", "11.0");
    desiredCapabilities.setCapability("appium:deviceName", "Android SDK built for x86");
    desiredCapabilities.setCapability("appium:app", "C:\\Users\\Singh\\Downloads\\Flipkart-7.18.apk");
    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");*/


    driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.Button[@text='CONTINUE']")).click();
	//driver.navigate().refresh();
	Thread.sleep(20000);

   // //Actions action= new Actions(driver).moveToElement(driver.findElement(By.xpath("element2"))).build().perform().click();
	//driver.findElement(By.id("com.flipkart.android:id/custom_back_icon")).click();
	MobileElement clickemail = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Use Email-ID']"));
	clickemail.click();
	//driver.navigate().refresh();
	Thread.sleep(5000);
	MobileElement Enteremail = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Email ID']"));
	Enteremail.sendKeys("priyankaruby9@gmail.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
	//driver.navigate().refresh();
	Thread.sleep(5000);
	MobileElement EnterPswd = (MobileElement) driver.findElement(By.xpath("//android.widget.EditText[@content-desc='Password']"));
	EnterPswd.sendKeys("Flipkart@123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//android.widget.TextView[@text='Continue']")).click();
	Thread.sleep(5000);
	
	//driver.navigate().refresh();
	//driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.flipkart.android:id/custom_back_icon']")).click();
  }

  @AfterMethod

  public void tearDown() {
    driver.quit();
  }
}
