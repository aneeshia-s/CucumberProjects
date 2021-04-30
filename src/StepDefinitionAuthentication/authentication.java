package StepDefinitionAuthentication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class authentication {
	WebDriver driver;
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page()  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	    
	}

	@When("^User navigate to login page$")
	public void user_navigate_to_login_page()  {
		driver.navigate().to("http://demo.guru99.com/V1/index.php");
	   
	}

	@When("^User Enters Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_Enters_Username_and_Password(String username, String password) throws InterruptedException  {
		WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		user.sendKeys(username);
		WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		pwd.sendKeys(password);
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
		Thread.sleep(2000);
	    
	}

	@Then("^Message displayed login successfully$")
	public void message_displayed_login_successfully() {
		driver.switchTo().alert().accept();
	   
	}


	

}
