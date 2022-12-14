package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TabTestFunctions {
	
	WebDriver driver = null;
	
	@Given("I am on homepage")
	public void i_am_on_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser Open");
		System.setProperty("webdriver.chrome.driver", "/Users/mansoor/eclipse-workspace/viskonzTest-main/ViskonzWebsiteTest/src/test/resources/drivers/chromedriver");
	    
	    driver = new ChromeDriver();
	    
	    System.out.println("I am on homepage");
	}

	@And("I click on check button")
	public void i_click_on_check_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.navigate().to("https://viskonz.de/tachometer/");
		 System.out.println("Browser Open right after link open");
		  driver.findElement(By.id("CookieBoxSaveButton"));
		  System.out.println("Browser Open right after link open again");
		 
	    // Write code here that turns the phrase above into concrete actions
		  driver.findElement(By.id("CookieBoxSaveButton")).sendKeys(Keys.RETURN);
		  driver.findElement(By.id("chkMango1")).click();
		System.out.println("I click on check button");
	}

	@And("I click on second check button")
	public void i_click_on_second_check_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("chkMango4")).click();
		driver.findElement(By.id("chkMango5")).click();
		System.out.println("I click on second check button");
	}

	@And("I click on third check button")
	public void i_click_on_third_check_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("chkMango8")).click();
		System.out.println("I click on third check button");
	}

	@And("I see text")
	public void i_see_text() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("demo"));
		System.out.println("I see text id");
		//driver.findElement(By.xpath("//*[text()='4']"));
		//String xpath = "//p[contains(@id, 'demo'][contains(text(), '4')]";
		//String xpath = "//div[contains(@class, 'statusMsg'][contains(., 'Your changes are saved.')]";
		//String xpath = "/html/body/section/section[2]/div/div/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div/div[3]/div[2]/p[contains(text(),'4000000')]";
		String text = driver.findElement(By.xpath("//p[@id='demo']/..")).getText();
		System.out.println("Datenschutz score in in Tachometer is " + text);
		//driver.findElement(By.xpath(xpath));
		System.out.println("I see text");
	}

	@Then("I click on contact tab")
	public void i_click_on_contact_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on homepage");
	}

	@And("i found")
	public void i_found() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on homepage");
	}


}
