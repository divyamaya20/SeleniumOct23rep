package week2.day4.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	  
	    driver.findElement(By.id("accountName")).sendKeys("Dhivya Testleaf");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    WebElement industryDD = driver.findElement(By.name("industryEnumId"));
	    Select industry = new Select(industryDD);
	    industry.selectByVisibleText("Computer Software");
	    Thread.sleep(2000);
	    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    Select ownership = new Select(ownershipDD);
	    ownership.selectByVisibleText("S-Corporation");
	    Thread.sleep(2000);
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    Select source =new Select(sourceDD);
	    source.selectByValue("LEAD_EMPLOYEE");	    
	    Thread.sleep(2000);	    
	    WebElement markcampDD = driver.findElement(By.id("marketingCampaignId"));
	    Select markcamp = new Select(markcampDD);
	    markcamp.selectByIndex(6);
	    Thread.sleep(2000);	
	    WebElement stateProvinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select stateProvince =new Select(stateProvinceDD);
	    stateProvince.selectByValue("TX");
	    Thread.sleep(2000);
	    driver.findElement(By.className("smallSubmit")).click();
	  
	    
	    
	    Thread.sleep(2000);
	    driver.close();
	    
	    
	    
	    
	}

}
