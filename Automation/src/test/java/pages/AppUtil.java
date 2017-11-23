package pages;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import utils.PropertyReader;

public class AppUtil {

	private AppiumDriver<MobileElement> driver;

	public AppiumDriver<MobileElement> getDriver() throws Exception {

		File classpathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classpathRoot, File.separator + "app" + File.separator);
		File app = new File(appDir, PropertyReader.getProperty("APP_NAME"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,PropertyReader.getProperty("PLATFORM_VERSION"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertyReader.getProperty("PLATFORM_NAME"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertyReader.getProperty("DEVICE_NAME"));
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, PropertyReader.getProperty("AUTOMATION_NAME"));
		capabilities.setCapability(MobileCapabilityType.APP, app);
		capabilities.setCapability(MobileCapabilityType.UDID, PropertyReader.getProperty("UDID"));

		String OS = PropertyReader.getProperty("OS_PLATFORM");
		
		if (OS.toString().equals("Android")) {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else if (OS.toString().equals("IOS")) {
			
			driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} else {
		
			System.out.println("Driver object is Null:   -- Please check your OS_PLATFORM value ");
		}

		return driver;
	}
}