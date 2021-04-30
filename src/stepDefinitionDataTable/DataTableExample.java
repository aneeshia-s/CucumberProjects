
	package stepDefinitionDataTable;

	import java.util.List;
	import java.util.concurrent.TimeUnit;
	import cucumber.api.DataTable;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class DataTableExample {
		
		WebDriver driver;
		
		@Given("^User is on home page$")
		public void user_is_on_home_page(){
			System.setProperty("webdriver.gecko.driver","C:\\Users\\vishnu\\Downloads\\geckodriver-v0.29.0-win64\\\\GeckoDriver.exe");
			driver=new FirefoxDriver();
			driver.get("http://demo.guru99.com/");
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		   
		}

		@When("^User Navigate to login page$")
		public void user_Navigate_to_login_page() {
			driver.navigate().to("http://demo.guru99.com/V1/index.php");
		    
		}

		@When("^User enter credentials to login$")
		public void user_enter_credentials_to_login(DataTable usercredentials)  throws InterruptedException {
			
			List<List<String>>data = usercredentials.raw();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys(data.get(0).get(0));
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys(data.get(0).get(1));
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			Thread.sleep(2000);

		    
		}

		@Then("^Message displayed login successfully$")
		public void message_displayed_login_successfully() {
			driver.switchTo().alert().accept();
		    
		}



	}



