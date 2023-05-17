package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
	WebDriver driver;
	@Given("User open browser")
	public void user_open_browser() {
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));		
		//driver.manage().window().maximize();	
	   
	}

	@Given("user open fidelity application")
	public void user_open_fidelity_application() {
		driver.get("https://www.fidelity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    
	}
	@When("user click on log in button")
	public void user_click_on_log_in_button() {
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//a[@title='Open login link']")).click();
	}
	@When("user input valid username")
	public void user_input_valid_username() {
		driver.findElement(By.id("userId-input")).clear();
		driver.findElement(By.id("userId-input")).sendKeys("Tarek12");
	  
	}

	@When("user input valid password")
	public void user_input_valid_password() {
		  driver.findElement(By.id("password")).clear();
	    driver.findElement(By.id("password")).sendKeys("pass123");
	}
	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String uName, String pword) {
		driver.findElement(By.id("userId-input")).clear();
		driver.findElement(By.id("userId-input")).sendKeys(uName);
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(pword);
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String paword) { 
	driver.findElement(By.id("userId-input")).clear();
	driver.findElement(By.id("userId-input")).sendKeys(userName);
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys(paword);
}


	@When("user click on login button")
	public void user_click_on_login_button() {
	    driver.findElement(By.id("fs-login-button")).click();
	}

	@Then("user valiadte the landing page")
	public void user_valiadte_the_landing_page() {
	    //Need implementation
		System.out.println(">>>>>>>>>>>>>valiadte the landing page>>>>>>>>>>>>");
	}

	@Then("user validate the page title")
	public void user_validate_the_page_title() {
	    //Need implementation
		System.out.println(">>>>>>>>>>>validate the page title>>>>>>>>>>>");
	}
	//No Header, Sigle line data like:  |user	 |pass  |
	@When("user login with following credential")
	public void user_login_with_following_credential(DataTable dataTable) {
		List<List<String>> data=dataTable.asLists(String.class);
		driver.findElement(By.id("userId-input")).sendKeys(data.get(0).get(0));	
		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	
	}
	//With Header, two dimension data and single data set
	@When("user login with username and password")
	public void user_login_with_username_and_password(DataTable dataTable) {
		List<Map<String,String>> listData=dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("userId-input")).sendKeys(listData.get(0).get("UName"));	
		driver.findElement(By.id("password")).sendKeys(listData.get(0).get("PWord"));
		
	}
	//DataTable with Header and Multiples data sets
	@When("users login with username and password")
	public void users_login_with_username_and_password(DataTable dataTable) {
		List<Map<String,String>> llistData=dataTable.asMaps(String.class,String.class);
		for(Map<String,String> mapdata:llistData) {
			driver.findElement(By.id("userId-input")).clear();
			driver.findElement(By.id("userId-input")).sendKeys(mapdata.get("UserHeader"));
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(mapdata.get("PasswordHeader"));
		}
		
	}
	}
	


