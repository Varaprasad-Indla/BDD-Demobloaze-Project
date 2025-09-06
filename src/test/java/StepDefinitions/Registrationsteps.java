package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Registration;
import utils.DriverFactory;

public class Registrationsteps {
	WebDriver driver = DriverFactory.getDriver();
	Registration form = new Registration(driver);

    @Given("user is on the NewTours registration page")
    public void user_is_on_the_new_tours_registration_page() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("user fills personal info {string}, {string}, {string}, {string}")
    public void user_fills_personal_info(String firstName, String lastName, String phone, String email) throws InterruptedException {
        form.enterFirstName(firstName);
        Thread.sleep(1000);
        form.enterLastName(lastName);
        Thread.sleep(1000);
        form.enterPhone(phone);
        Thread.sleep(1000);
        form.enterEmail(email);
        Thread.sleep(1000);
    }

    @When("user fills address info {string}, {string}, {string}, {string}, {string}")
    public void user_fills_address_info(String address, String city, String state, String postalCode, String country) throws InterruptedException {
        form.enterAddress(address);
        Thread.sleep(1000);
        form.enterCity(city);
        Thread.sleep(1000);
        form.enterState(state);
        Thread.sleep(1000);
        form.enterPostalCode(postalCode);
        Thread.sleep(1000);
        form.selectCountry(country);
        Thread.sleep(1000);
    }

    @When("user fills account info {string}, {string}, {string}")
    public void user_fills_account_info(String userName, String password, String confirmPassword) throws InterruptedException {
        form.enterUserName(userName);
        Thread.sleep(1000);
        form.enterPassword(password);
        Thread.sleep(1000);
        form.enterConfirmPassword(confirmPassword);
        Thread.sleep(1000);
    }

    @When("user submits the registration form")
    public void user_submits_the_registration_form() throws InterruptedException {
        form.clickSubmit();
        Thread.sleep(2000);
    }

    @Then("registration should be successful")
    public void registration_should_be_successful() throws InterruptedException {
        System.out.println("Registration completed successfully!");
        Thread.sleep(2000);
    }
}

