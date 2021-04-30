package StepDefenitionFlipcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipcart {

	WebDriver driver;
	
	@Given("^User is on Flipcart Home Page$")
	public void user_is_on_Flipcart_Home_Page()  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
		driver=new FirefoxDriver();
		
	   
	}

	@When("^User Navigate to Login Page$")
	public void user_Navigate_to_Login_Page()  {
		driver.get("https://www.flipkart.com/");
	}

	@When("^User enter UserName and Password$")
	public void user_enter_UserName_and_Password() throws InterruptedException  {
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	    login.sendKeys("9497279704");
	    WebElement loginpwd = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	    loginpwd.sendKeys("krishnan");
	    WebElement login1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
	    login1.click();
	    Thread.sleep(1000);
	    
	}

	@When("^User search the item$")
	public void user_search_the_item() throws InterruptedException  {
		Thread.sleep(1000);
		WebElement rdElement = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
	    rdElement.sendKeys("ikigai");
	    WebElement searchbutton = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
	    searchbutton.click();
	    Thread.sleep(1000);
	}

	@When("^User select the item$")
	public void user_select_the_item() throws InterruptedException  {
		Thread.sleep(1000);
		WebElement ikigai = driver.findElement(By.xpath ("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]"));
		ikigai.click();
		Thread.sleep(1000);
		
	    
	}

	@Then("^Message displayed item is added to cart successfully$")
	public void message_displayed_item_is_added_to_cart_successfully() throws InterruptedException  {
		
		Thread.sleep(1000);
		String mainwindowHandle = driver.getWindowHandle();
	    for (String winhandle: driver.getWindowHandles()) 
	    	if(!mainwindowHandle.contentEquals(winhandle))
	    {
		driver.switchTo().window(winhandle);
		WebElement addtocart = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
		addtocart.click();
	    }
	   
	}


	
	
}
