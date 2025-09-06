package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFillpage {
	
	private WebDriver driver;

	// Locators
	private By name = By.name("name");
	private By email = By.name("email");
	private By gender = By.xpath("(//input[@type='radio'])[1]");
	private By moNum = By.id("mobile");
	private By dob = By.name("dob");
	private By subject = By.name("subjects");
	private By hobbies = By.xpath("(//input[@type='checkbox'])[1]");
	private By pic = By.xpath("//input[@id='picture']");
	private By address = By.xpath("//textarea[@id='picture']");   
	private By state = By.xpath("//select[@id = 'state']");
	private By city = By.xpath("//select[@id = 'city']");
	private By loginButton = By.xpath("//input[@value='Login']");

	// Constructor
	public FormFillpage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions
	public void enterName(String nm) {
		driver.findElement(name).sendKeys(nm);
	}
	
	public void enterEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void selectGender() {
		driver.findElement(gender).click();
	}

	public void enterMobile(String mobile) {
		driver.findElement(moNum).sendKeys(mobile);
	}

	public void enterDOB(String birthdate) {
		driver.findElement(dob).sendKeys(birthdate);
	}

	public void enterSubject(String subj) {
		driver.findElement(subject).sendKeys(subj);
	}

	public void selectHobby() {
		driver.findElement(hobbies).click();
	}

	public void uploadPic(String path) {
		driver.findElement(pic).sendKeys(path);
	}

	public void enterAddress(String addr) {
		driver.findElement(address).sendKeys(addr);
	}

	public void selectState(String st) {
		Select sel = new Select(driver.findElement(state));
		sel.selectByVisibleText(st);
	}

	public void selectCity(String cty) {
		Select sel = new Select(driver.findElement(city));
		sel.selectByVisibleText(cty);
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}
}