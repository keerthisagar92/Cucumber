package Jenkins.Jenkins;

import org.junit.Assert;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepDefinition {
	
	
	 

	 WebDriver driver ;
	
	@Given("^I open yahoo mail$")
	public void openUrl() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kesagar\\Downloads\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		Thread.sleep(2000);
	}
	@When("^I enter username and password$")
	public void enterDetails() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).click();
		driver.findElement(By.name("identifier")).sendKeys("keerthisagar92");
		driver.findElement(By.className("CwaK9")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("tcr680010");
		driver.findElement(By.className("CwaK9")).click();
	}
	
	@Then("^I login to yahoo$")
	public void login() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Inbox"));
	}

}
