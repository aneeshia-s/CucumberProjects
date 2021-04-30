package StepDefinitionHook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class hook {

	WebDriver driver;
	
	@Before
	  public void before() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
	  }
	
	 @After
	  public void after() {
		  driver.close();
	  }
	
	@Given("^User is in home page$")
	public void user_is_in_home_page()  {
		driver.get("https://www.flipkart.com/");
	  
	}

	@When("^User navigate to login page$")
	public void user_navigate_to_login_page() throws InterruptedException  {
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	    login.sendKeys("9497279704");
	    WebElement loginpwd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	    loginpwd.sendKeys("krishnan");
	    WebElement login1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	    login1.click();
	    Thread.sleep(1000);
	    
	}

	@Then("^message displayed login successfully$")
	public void message_displayed_login_successfully() {
	System.out.println("Login successful");
	   
	}


	
	
}
