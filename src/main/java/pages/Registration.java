package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	private WebDriver driver;

	// === Locators ===
	private By firstName = By.name("firstName");
	private By lastName = By.name("lastName");
	private By phone = By.name("phone");
	private By email = By.name("userName");

	private By address = By.name("address1");
	private By city = By.name("city");
	private By state = By.name("state");
	private By postalCode = By.name("postalCode");
	private By country = By.name("country");

	private By userName = By.id("email"); // This is the username field
	private By password = By.name("password");
	private By confirmPassword = By.name("confirmPassword");

	private By submitButton = By.name("submit");

	// === Constructor ===
	public Registration(WebDriver driver) {
		this.driver = driver;
	}

	// === Actions ===
	public void enterFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}

	public void enterLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}

	public void enterPhone(String phoneNum) {
		driver.findElement(phone).sendKeys(phoneNum);
	}

	public void enterEmail(String emailText) {
		driver.findElement(email).sendKeys(emailText);
	}

	public void enterAddress(String addr) {
		driver.findElement(address).sendKeys(addr);
	}

	public void enterCity(String cityText) {
		driver.findElement(city).sendKeys(cityText);
	}

	public void enterState(String stateText) {
		driver.findElement(state).sendKeys(stateText);
	}

	public void enterPostalCode(String pin) {
		driver.findElement(postalCode).sendKeys(pin);
	}

	public void selectCountry(String countryName) {
		Select sel = new Select(driver.findElement(country));
		sel.selectByVisibleText(countryName);
	}

	public void enterUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void enterConfirmPassword(String cpwd) {
		driver.findElement(confirmPassword).sendKeys(cpwd);
	}

	public void clickSubmit() {
		driver.findElement(submitButton).click();
	}
}

