package Assessment;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTestME {
	WebDriver drive;
	@Given("navigate to Home Page")
	public void navigate_to_Home_Page() throws InterruptedException{
		drive = UtilityDrivers.getDriver("Chrome");
		drive.get("http://demowebshop.tricentis.com/login");
		drive.manage().window().maximize();
		Thread.sleep(2000);
	}
	@When("User enters Correct {string} and {string}")
	public void user_enters_correct_and(String str1,String str2) throws InterruptedException {
		//drive.findElement(By.xpath("//a[@href = 'login.htm']")).click();
		drive.findElement(By.xpath("//input[@id = 'Email']")).sendKeys(str1);
		drive.findElement(By.xpath("//input[@id = 'Password']")).sendKeys(str2);
		Thread.sleep(2000);
		drive.findElement(By.xpath("//input[@value = 'Log in']")).click();
		Thread.sleep(3000);
		
	}
	@Then("Message Login Successful")
	public void message_Login_successful() {
		Assert.assertEquals("Home", drive.getTitle());
		System.out.println("welcome"+drive.getTitle());
	}
}
