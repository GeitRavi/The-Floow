package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class JourneysPage extends BasePage {

	@AndroidFindBy(id = "com.thefloow.flo:id/layout_mileage")
	private MobileElement MilesMeter;

	public JourneysPage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

}
