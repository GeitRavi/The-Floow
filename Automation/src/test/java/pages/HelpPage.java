package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HelpPage {
	
	@AndroidFindBy(id="com.thefloow.flo:id/layout_mileage")
    private MobileElement MilesMeter;
	
	
	protected final AppiumDriver<MobileElement> driver;
	
	public HelpPage(AppiumDriver<MobileElement> driver){
	   	this.driver = driver;
	   	PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	     }

}
