package testRunner;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import utils.PropertyReader;

public class Test {

	// TODO Auto-generated method stub
	private static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) throws Exception {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, File.separator +"app"+ File.separator);
		File app = new File(appDir, "8b3d8e298.apk");
	    System.out.println(app);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("newCommandTimeout", 100000);
		capabilities.setCapability("browserName", "");
        capabilities.setCapability("automationName", PropertyReader.getProperty("AUTOMATION_NAME"));
		//capabilities.setCapability("udid", "d4b920a");
		capabilities.setCapability("deviceName", PropertyReader.getProperty("DEVICE_NAME"));
		capabilities.setCapability("platformVersion", PropertyReader.getProperty("PLATFORM_VERSION"));
		capabilities.setCapability("platformName", PropertyReader.getProperty("PLATFORM_NAME"));
		capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.thefloow.flo");
		capabilities.setCapability("appActivity", "com.thefloow.flo.activity.HomeActivity");

        String OS = PropertyReader.getProperty("OS_PLATFORM");
    
		if ( OS.toString().equals("ANDROID")) {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (OS.toString().equals("IOS")) {
			System.out.println("IOS");
			driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else {
			System.out.println("Extra");
			System.out.println("Please select valid OS and Driver object is Null:");
		}
		
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		System.out.println("Steps");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.quit();

	}
}
