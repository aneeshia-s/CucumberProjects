package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	WebDriver driver;

	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page()  {
	    
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/");
	  
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page() {
	    driver.navigate().to("http://demo.guru99.com/V1/index.php");
	    
	}

	@When("^User enter UserName and Password$")
	public void user_enter_UserName_and_Password(){
		WebElement user = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
		user.sendKeys("mngr");
		WebElement pwd = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
		pwd.sendKeys("1234556");
		WebElement login = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		login.click();
	   
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully()  {
		driver.switchTo().alert().accept();
	   
	}

	
}
