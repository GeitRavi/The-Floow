package steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;

public class StepDefination {
	
	 private AppiumDriver driver;
	
	@Given("^Open the Floow Application$")
	public void open_the_Floow_Application() throws Throwable {
		System.out.println("Open Floow Application");
		//driver = new AppUtil().getDriver();
	}

	@Then("^Verify Home Button$")
	public void verify_Home_Button() throws Throwable {
		System.out.println("Verify Home Button");
	}

}
