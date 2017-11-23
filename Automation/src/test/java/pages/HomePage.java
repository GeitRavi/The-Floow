package pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.util.concurrent.TimeUnit;

public class HomePage extends BasePage{

	

	@AndroidFindBy(id = "com.thefloow.flo:id/image_view_logo")
	private MobileElement AppLogo;

	@AndroidFindBy(id = "com.thefloow.flo:id/btn_start")
	private MobileElement StartButton;

	@AndroidFindBy(id = "com.thefloow.flo:id/btn_emergency")
	private MobileElement EmergencyButton;

	@AndroidFindBy(id = "com.thefloow.flo:id/btn_feedback")
	private MobileElement FeedbackButton;

	@AndroidFindBy(id = "com.thefloow.flo:id/chrono_duration")
	private MobileElement DurnationMeter;

	@AndroidFindBy(id = "com.thefloow.flo:id/layout_mileage")
	private MobileElement MilesMeter;

	@AndroidFindBy(id = "com.thefloow.flo:id/btn_enable_gps")
	private MobileElement GPSOFFButton;


	public HomePage(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public void clickStartJourney() {
		StartButton.isDisplayed();
		StartButton.click();
	}

	public void clickEmergency() {
		EmergencyButton.isDisplayed();
		EmergencyButton.click();
	}

	public void clickFeedback() {
		FeedbackButton.isDisplayed();
		FeedbackButton.click();
	}

	public String getDurationText() {
		DurnationMeter.isDisplayed();
		return DurnationMeter.getText().toString();
	}

	public String getMilesText() {
		MilesMeter.isDisplayed();
		return MilesMeter.getText().toString();
	}

	public JourneysPage goToJourneysSection() {
		Journeys.isDisplayed();
		
		Journeys.click();
		return new JourneysPage(driver);
	}

	public ScorePage goToScoreSection() {
		Score.isDisplayed();
		Score.click();
		return new ScorePage(driver);
	}

	public SocialPage goToSocialSection() {
		Social.isDisplayed();
		Social.click();
		return new SocialPage(driver);
	}

	public HelpPage goToHelpSection() {
		Help.isDisplayed();
		Help.click();
		return new HelpPage(driver);
	}
}
