package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ecommercepage {

    private WebDriver driver;

  
    private By signupLink = By.id("signin2");
    private By signupUsername = By.id("sign-username");
    private By signupPassword = By.id("sign-password");
    private By signupButton = By.xpath("//button[text()='Sign up']");
    private By signupClose = By.xpath("//div[@id='signInModal']//button[text()='Close']");

    private By loginLink = By.id("login2");
    private By loginUsername = By.id("loginusername");
    private By loginPassword = By.id("loginpassword");
    private By loginButton = By.xpath("//button[text()='Log in']");
    private By logoutBtn = By.id("logout2");

    private By phonesCategory = By.xpath("//a[text()='Phones']");
    private By laptopsCategory = By.xpath("//a[text()='Laptops']");
    private By monitorsCategory = By.xpath("//a[text()='Monitors']");

    private By homeButton = By.cssSelector("a.navbar-brand");
    private By addToCartBtn = By.xpath("//a[text()='Add to cart']");
    private By cartLink = By.linkText("Cart");

    private By placeOrderBtn = By.xpath("//button[text()='Place Order']");
    private By inputName = By.id("name");
    private By inputCountry = By.id("country");
    private By inputCity = By.id("city");
    private By inputCard = By.id("card");
    private By inputMonth = By.id("month");
    private By inputYear = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");
    private By okButton = By.xpath("//button[text()='OK']");

    public Ecommercepage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickSignUpLink() {
        driver.findElement(signupLink).click();
    }

    public void enterSignupUsername(String username) {
        driver.findElement(signupUsername).sendKeys(username);
    }

    public void enterSignupPassword(String password) {
        driver.findElement(signupPassword).sendKeys(password);
    }

    public void clickSignupButton() {
        driver.findElement(signupButton).click();
    }

    public void closeSignupPopup() {
        driver.findElement(signupClose).click();
    }

 
    public void clickLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterLoginUsername(String username) {
        driver.findElement(loginUsername).sendKeys(username);
    }

    public void enterLoginPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickLogoutButton() {
        driver.findElement(logoutBtn).click();
    }
    public void clickPhonesCategory() {
        driver.findElement(phonesCategory).click();
    }
    public void clickLaptopsCategory() {
        driver.findElement(laptopsCategory).click();
    }

    public void clickMonitorsCategory() {
        driver.findElement(monitorsCategory).click();
    }
    public void clickProductByName(String productName) {
        driver.findElement(By.linkText(productName)).click();
    }
    public void clickAddToCart() {
        driver.findElement(addToCartBtn).click();
    }

    public void clickHomeLink() {
        driver.findElement(homeButton).click();
    }

    public void clickCartLink() {
        driver.findElement(cartLink).click();
    }

    public void clickPlaceOrderButton() {
        driver.findElement(placeOrderBtn).click();

    }

    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        driver.findElement(inputName).sendKeys(name);
        driver.findElement(inputCountry).sendKeys(country);
        driver.findElement(inputCity).sendKeys(city);
        driver.findElement(inputCard).sendKeys(card);
        driver.findElement(inputMonth).sendKeys(month);
        driver.findElement(inputYear).sendKeys(year);
    }

    public void clickPurchaseButton() {
        driver.findElement(purchaseButton).click();
    }

    public void clickOkButton() {
        driver.findElement(okButton).click();
      
    }
   
}
