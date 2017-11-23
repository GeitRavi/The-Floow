package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BasePage {

	@AndroidFindBy(id = "com.thefloow.flo:id/tab_home")
	MobileElement Home;

	@AndroidFindBy(id = "com.thefloow.flo:id/tab_journeys")
	MobileElement Journeys;

	@AndroidFindBy(id = "com.thefloow.flo:id/tab_score")
	MobileElement Score;

	@AndroidFindBy(id = "com.thefloow.flo:id/tab_social")
	MobileElement Social;

	@AndroidFindBy(id = "com.thefloow.flo:id/tab_help")
	MobileElement Help;

	protected AppiumDriver<MobileElement> driver;

	public BasePage(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
}
