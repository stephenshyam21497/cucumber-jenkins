package scenario2pack;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Sam1Class {
	WebDriver driver;
	@When("user opens newtors applications on chrome browser")
	public void user_opens_newtors_applications_on_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver","C:\\seldrivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("user enters mercury in username and password field")
	public void user_enters_mercury_in_username_and_password_field() {
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    driver.findElement(By.name("password")).sendKeys("mercury");
	}

	@When("click on signin button")
	public void click_on_signin_button() {
	    driver.findElement(By.name("login")).click();
	}
	
	@Then("verify login result as  success")
	public void verify_login_result_as_success() {
	   Assert.assertTrue(driver.getTitle().contains("Flight"));
	   driver.close();
	}
	@When("user enters {string} in username and password field")
	public void user_enters_in_username_and_password_field(String string) {
	    driver.findElement(By.name("userName")).sendKeys(string);
	    driver.findElement(By.name("password")).sendKeys(string);
	}
}
