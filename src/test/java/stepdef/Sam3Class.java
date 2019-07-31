package stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sam3Class {
	WebDriver driver;
	@Given("user opens TestMeApp on chrome browser")
	public void user_opens_TestMeApp_on_chrome_browser() {
	   System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://10.232.237.143:443/TestMeApp/");
	   driver.findElement(By.linkText("SignIn")).click();
	}
	@When("user enters  {string} and {string} field")
	public void user_enters_and_field(String string, String string2) {
	    driver.findElement(By.name("userName")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string2);
	}
	@Then("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.name("Login")).click();
	}
	@Then("verify login result  success")
	public void verify_login_result_success() {
	 Assert.assertTrue(driver.getTitle().contains("Home"));
	 driver.close();
	}
	@Given("Display welcome message")
	public void display_welcome_message() {
	   System.out.println("hai shyam");
	}

	


}
