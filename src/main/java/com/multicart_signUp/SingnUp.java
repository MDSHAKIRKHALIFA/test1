package com.multicart_signUp;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class SingnUp {

	WebDriver driver;

	@Given("^I open browser chrome$")
	public void i_open_browser_chrome()  {
		System.out.println("*** The browser chrome should be open ***");
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@When("^I land on multicart landing page$")
	public void i_land_on_multicart_landing_page() {
		System.out.println("*** I should land on multicart landing page ***");
		driver.get("https://www.demo.iscripts.com/multicart/demo/index.php");

	}

	@Then("^I complete signup with shakir valid credentails$")
	public void i_complete_signup_with_shakir_valid_credentails() {
		System.out.println("*** I expect to fill up My sign Up crediantial ***");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='dLabellogin']")).click();
		driver.findElement(By.xpath("//button[@id='jqSignup']")).click();
		driver.findElement(By.xpath("//input[@id='txtEmail']")).sendKeys("mdshakir02@gmail.com");
		driver.findElement(By.xpath("//input[@id='txtUserName']")).sendKeys("Shakir02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Shakir123");
		driver.findElement(By.xpath("//input[@id='txtCnfPassword']")).sendKeys("Shakir123");
		driver.findElement(By.xpath("//input[@id='txtFirstName']")).sendKeys("md");
		driver.findElement(By.xpath("//input[@id='txtLastName']")).sendKeys("Shakir");
		driver.findElement(By.xpath("//input[@placeholder='Address *']")).sendKeys("123 37th ave");
		driver.findElement(By.xpath("//label[@class='small_txt']")).click();
		driver.findElement(By.xpath("//input[@id='btnRegister']")).click();
	}

	@Then("^I expect signup successfully$")
	public void i_expect_signup_successfully()  {
		System.out.println("*** The user should have matched with initial username ***");

		String expectedProfileName = "MD SHAKIR";
		String actualProfileName = driver.findElement(By.xpath("//*[@id=\"dLabel\"]/span")).getText(); // Return

		Assert.assertEquals("MD SHAKIR is not Found after Login..", expectedProfileName, actualProfileName );


		//driver.close();

	}

}
