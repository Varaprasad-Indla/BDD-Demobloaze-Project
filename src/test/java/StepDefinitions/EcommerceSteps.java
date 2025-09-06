package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.Ecommercepage;
import utils.DriverFactory;

import java.util.Map;

public class EcommerceSteps {

    WebDriver driver = DriverFactory.getDriver();
    Ecommercepage ep = new Ecommercepage(driver);

    @Given("the user launches the DemoBlaze application")
    public void the_user_launches_the_demo_blaze_application() throws InterruptedException {
        driver.get("https://www.demoblaze.com/");
        Thread.sleep(2000);
    }

    @When("the user clicks on the Signup button")
    public void the_user_clicks_on_the_signup_button() throws InterruptedException {
        ep.clickSignUpLink();
        Thread.sleep(2000);
    }

    @When("the user signs up with username {string} and password {string}")
    public void the_user_signs_up_with_username_and_password(String username, String password) throws InterruptedException {
        ep.enterSignupUsername(username);
        ep.enterSignupPassword(password);
        ep.clickSignupButton();

        Thread.sleep(2000);
        try {
            Alert alt = driver.switchTo().alert();
            alt.accept();
        } catch (Exception e) {
            System.out.println("No alert displayed: " + e.getMessage());
        }
        Thread.sleep(2000);
    }

    @When("the user closes the signup popup")
    public void the_user_closes_the_signup_popup() throws InterruptedException {
        ep.closeSignupPopup();
        Thread.sleep(2000);
    }

    @When("logs in with the same credentials")
    public void logs_in_with_the_same_credentials() throws InterruptedException {
        ep.clickLoginLink();
        Thread.sleep(2000);
        ep.enterLoginUsername("Varaprasad@");
        ep.enterLoginPassword("Varaprasad@123");
        ep.clickLoginButton();
        Thread.sleep(2000);
    }

    @When("navigates to the {string} category")
    public void navigates_to_the_category(String category) throws InterruptedException {
        switch (category.toLowerCase()) {
            case "phones":
                ep.clickPhonesCategory();
                break;
            case "laptops":
                ep.clickLaptopsCategory();
                break;
            case "monitors":
                ep.clickMonitorsCategory();
                break;
            default:
                throw new IllegalArgumentException("Unknown category: " + category);
        }
        Thread.sleep(2000);
    }

    @When("adds {string} to the cart")
    public void adds_to_the_cart(String productName) throws InterruptedException {
        ep.clickProductByName(productName);
        Thread.sleep(2000);
        ep.clickAddToCart();

        Thread.sleep(2000);
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (Exception e) {
            System.out.println("No alert after add to cart: " + e.getMessage());
        }
        Thread.sleep(2000);

        ep.clickHomeLink();
        Thread.sleep(2000);
    }

    @When("goes to the cart page")
    public void goes_to_the_cart_page() throws InterruptedException {
        ep.clickCartLink();
        Thread.sleep(2000);
    }

    @When("places an order with the following details:")
    public void places_an_order_with_the_following_details(DataTable dataTable) throws InterruptedException {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        ep.clickPlaceOrderButton();
        Thread.sleep(2000);
        ep.fillOrderForm(
                data.get("Name"),
                data.get("Country"),
                data.get("City"),
                data.get("Card Number"),
                data.get("Month"),
                data.get("Year")
        );
        Thread.sleep(2000);
        ep.clickPurchaseButton();
        Thread.sleep(2000);
    }

    @Then("the order should be placed successfully")
    public void the_order_should_be_placed_successfully() throws InterruptedException {
        ep.clickOkButton();
        Thread.sleep(2000);
    }

    @Then("the user logs out")
    public void the_user_logs_out() throws InterruptedException {
        ep.clickLogoutButton();
        Thread.sleep(2000);
    }
}
