package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.ContactPage;
import TestBase.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class ContactPageMethod extends TestBase{

//	public static WebDriver driver;
	public static ContactPage contactPage = new ContactPage();

//	@Given("^user is on the HomePage of the Jupiter testing site$")
//	public void user_is_on_the_HomePage_of_the_Jupiter_testing_site() {
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		String url = "http://jupiter.cloud.planittesting.com";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(url);
//
////		initialization();
//
//		String ExpectedTitle = "Jupiter Toys";
//		String actualTitle = driver.getTitle();
//		System.out.println("Home Page title ::" + actualTitle);
//		// Verify the title
//		Assert.assertEquals(actualTitle, ExpectedTitle);
//
//	}

	@When("^user click on the Contact Page$")
	public void user_click_on_the_Contact_Page() {
		try {

			String contact = contactPage.contact;
			WebElement contactButton = driver.findElement(By.xpath(contact));
			contactButton.click();

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}

	}

	@When("^user click on the Submit button$")
	public void user_click_on_the_Submit_button() {
		try {
			String Submit = contactPage.submitButton;
			WebElement submitButton = driver.findElement(By.xpath(Submit));
			submitButton.click();

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}
	}

	@Then("^Verify error messages for each field$")
	public void verify_error_messages_for_each_field() {

		try {

			String ActforenameErrMsg = driver.findElement(By.xpath(contactPage.forenameError)).getText();
			String ActemailErrMsg = driver.findElement(By.xpath(contactPage.emailError)).getText();
			String ActmessageErrMsg = driver.findElement(By.xpath(contactPage.messageError)).getText();
			String ExpforenameErrMsg = "Forename is required";
			String ExpemailErrMsg = "Email is required";
			String ExpmessageErrMsg = "Message is required";

			Assert.assertEquals(ExpforenameErrMsg, ActforenameErrMsg);
			Assert.assertEquals(ExpemailErrMsg, ActemailErrMsg);
			Assert.assertEquals(ExpmessageErrMsg, ActmessageErrMsg);
		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());

		}

	}

	@When("^User populate mandatory fields and click on submit$")
	public void user_populate_mandatory_fields_and_click_on_submit() throws InterruptedException {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement forename = driver.findElement(By.xpath(contactPage.foreNameText));
			js.executeScript("arguments[0].scrollIntoView();", forename);
			Thread.sleep(500);
			System.out.println("aaaavvnnn");
			forename.sendKeys("JHONNIE");
			driver.findElement(By.xpath(contactPage.surnameText)).sendKeys("James");
			driver.findElement(By.xpath(contactPage.emailText)).sendKeys("john@gmail.com");
			driver.findElement(By.xpath(contactPage.messageText)).sendKeys("Hi I am Jhon");
			driver.findElement(By.xpath(contactPage.telephoneText)).sendKeys("0433596052");
		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());
		}

	}

	@Then("^Validate errors are gone$")
	public void validate_errors_are_gone() {
		try {
			Boolean ActforenameErrMsg = driver.findElement(By.xpath(contactPage.forenameError)).isDisplayed();
			System.out.println("Yes ! Error is Present for forename ");
		} catch (Exception e) {
			System.out.println("No ! Error is Not Present for forename ");
		}

		try {
			boolean ActemailErrMsg = driver.findElement(By.xpath(contactPage.emailError)).isDisplayed();
			System.out.println("Yes ! Error is Present for Email ");
		} catch (Exception e) {
			System.out.println("No ! Error is Not Present for Email ");
		}

		try {
			boolean ActmessageErrMsg = driver.findElement(By.xpath(contactPage.messageError)).isDisplayed();
			System.out.println("Yes ! Error is Present for Message ");
		} catch (Exception e) {
			System.out.println("No ! Error is Not Present for Message ");
		}
		
		
		WebElement submit = driver.findElement(By.xpath(contactPage.submitButton));
		submit.click();

	}

	
//	@After
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//		System.out.println("The Chrome Browser is Closed");
//	}

	 
	 @Then("^Validate successful submission message$")
	public void validate_successful_submission_message() {
		try {

			String ExpectedSuccessmsg = "Thanks JHONNIE, we appreciate your feedback.";
			String ActualSuccessmsg = driver.findElement(By.xpath(contactPage.successMsg)).getText();
			System.out.println("ActualSuccess Msg ::" + ActualSuccessmsg);
			// Verify the Sccess Msg
			Assert.assertEquals(ActualSuccessmsg, ExpectedSuccessmsg);

		} catch (Exception e) {
			System.out.println("Something Went wrong in the Method" + e.getMessage());
		}

	}
	
}
