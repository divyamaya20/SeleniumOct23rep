package week2.day4.assignment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dhivya");
		driver.findElement(By.name("lastname")).sendKeys("M");
		driver.findElement(By.name("reg_email__")).sendKeys("divyamaya20@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Dhivya@123");
		
		WebElement dayDD = driver.findElement(By.name("birthday_day"));
		Select day = new Select(dayDD);
		day.selectByVisibleText("14");
		
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthDD);
		month.selectByValue("2");
		
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearDD);
		year.selectByIndex(34);
		
		driver.findElement(By.className("_8esa")).click();
		
		
		
		
		
	}

}
