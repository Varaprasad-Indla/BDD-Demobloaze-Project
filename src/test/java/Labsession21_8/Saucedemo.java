package Labsession21_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class Saucedemo {
	WebDriver driver = DriverFactory.getDriver();
	@Given("User is on the saucedemo login page")
	public void user_is_on_the_saucedemo_login_page() {
		driver.get("https://www.saucedemo.com/");
	}

	@When("user logs in with valid credentials")
	public void user_logs_in_with_valid_credentials() throws InterruptedException {
	WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	 username.sendKeys("standard_user");
	 Thread.sleep(5000);
	 
	 WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	 password.sendKeys("secret_sauce");
	 Thread.sleep(5000);
	 
	 WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
	 login.click();
	 Thread.sleep(5000);
	}

	@When("user adds {string} to the cart")
	public void user_adds_to_the_cart(String string) throws InterruptedException {
	
		WebElement backpack = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		backpack.click();
		Thread.sleep(5000);
		WebElement jacket = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
		jacket.click();
		Thread.sleep(5000);
		WebElement cart = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		Thread.sleep(2000);
	}

	@When("user proceeds to checkout")
	public void user_proceeds_to_checkout() throws InterruptedException {
	    WebElement checkout = driver.findElement(By.xpath("//button[@id='checkout']"));
	    checkout.click();
	    Thread.sleep(2000);
	}

	@When("user enters checkout information")
	public void user_enters_checkout_information() throws InterruptedException {
	    WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']")); 
	    firstname.sendKeys("Varaprasad");
	    Thread.sleep(2000);
	    WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']")); 
	    lastname.sendKeys("Reddy");
	    Thread.sleep(2000);
	    WebElement pin = driver.findElement(By.xpath("//input[@id='postal-code']"));
	    pin.sendKeys("523001");
	    Thread.sleep(2000);
	    WebElement con = driver.findElement(By.xpath("//input[@id='continue']"));
	    con.click();
	    Thread.sleep(2000);
	}

	@When("user completes the purchase")
	public void user_completes_the_purchase() throws InterruptedException {
		 WebElement finish = driver.findElement(By.xpath("//button[@id='finish']"));
		 finish.click();
		 Thread.sleep(2000);
		    
	}

	@Then("a confirmation message should be displayed")
	public void a_confirmation_message_should_be_displayed() throws InterruptedException {
		System.out.println("Thank you for your order");
		WebElement home = driver.findElement(By.xpath("//button[@id='back-to-products']"));
		home.click();
		Thread.sleep(2000);
		WebElement menu = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		menu.click();
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
		Thread.sleep(20000);
		driver.quit();
	}
}
