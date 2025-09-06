package StepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.FormFillpage;
import utils.DriverFactory;

public class FormSteps {
	
	WebDriver driver = DriverFactory.getDriver();
	FormFillpage rp = new FormFillpage(driver);
	
	@Given("user is on the registration page")
	public void user_is_on_registration_page() throws InterruptedException {
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@When("user enters {string} as name")
	public void user_enters_name(String name) throws InterruptedException {
		rp.enterName(name);
		Thread.sleep(2000);
	}

	@When("user enters {string} as email")
	public void user_enters_email(String email) throws InterruptedException {
		rp.enterEmail(email);
		Thread.sleep(2000);
	}

	@When("user selects gender")
	public void user_selects_gender() throws InterruptedException {
		rp.selectGender();
		Thread.sleep(2000);
	}

	@When("user enters {string} as mobile number")
	public void user_enters_mobile(String mobile) throws InterruptedException {
		rp.enterMobile(mobile);
		Thread.sleep(2000);
	}

	@When("user enters {string} as DOB")
	public void user_enters_dob(String dob) throws InterruptedException {
		rp.enterDOB(dob);
		Thread.sleep(2000);
	}

	@When("user enters {string} as subject")
	public void user_enters_subject(String subject) throws InterruptedException {
		rp.enterSubject(subject);
		Thread.sleep(2000);
	}

	@When("user selects hobbies")
	public void user_selects_hobbies() throws InterruptedException {
		rp.selectHobby();
		Thread.sleep(2000);
	}

	@When("user uploads picture {string}")
	public void user_uploads_picture(String filepath) throws InterruptedException {
		rp.uploadPic(filepath);
		Thread.sleep(2000);
	}

	@When("user enters {string} as address")
	public void user_enters_address(String address) throws InterruptedException {
		rp.enterAddress(address);
		Thread.sleep(2000);
	}

	@When("user selects {string} as state")
	public void user_selects_state(String state) throws InterruptedException {
		rp.selectState(state);
		Thread.sleep(2000);
	}

	@When("user selects {string} as city")
	public void user_selects_city(String city) throws InterruptedException {
		rp.selectCity(city);
		Thread.sleep(2000);
	}

	@When("user clicks on login button")
	public void user_clicks_login_button() throws InterruptedException {
		rp.clickLogin();
		Thread.sleep(2000);
	}

	@Then("user should sees {string}")
	public void user_should_see(String expectedResult) {
		System.out.println("Form submitted, expected: " + expectedResult);
	}
}