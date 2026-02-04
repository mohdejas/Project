package Stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
	ChromeDriver driver = new ChromeDriver();
	
	@Given("Iam on the Chrome Browser")
	public void iam_on_the_chrome_browser() {
		
		driver.manage().window().maximize();
		
	    
	}

	@When("Enter the URL")
	public void enter_the_url() {
		driver.get("http://www.automationpractice.pl/index.php");
		System.out.println(driver.getTitle());
		  
	}

	@Then("Enter the login credintials")
	public void enter_the_login_credintials() {
		driver.findElement(By.xpath("//a[@class ='login']")).click();
    	driver.findElement(By.id("email")).sendKeys("testingautan01@gmail.com");
    	driver.findElement(By.id("passwd")).sendKeys("Test@123");    
	}

	@And("Clicking on the button")
	public void clicking_on_the_button() {
		driver.findElement(By.id("SubmitLogin")).click();
	    
	}

}
