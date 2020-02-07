package com.AutomationTalks.demoproject1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.opencsv.CSVReader;
public class testClass1 {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		//System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Downloads/geckodriver/");
		//System.setProperty("webdriver.gecko.driver", "/home/ranjeet/Desktop/Test Cases/demoproject1/Drivers/geckodriver/");
		//System.setProperty("webdriver.chrome.driver", "/home/ranjeet/Downloads/chromedriver/");
		WebDriverManager.firefoxdriver().setup();
		// WebDriverManager.chromedriver().setup();
		 driver=new FirefoxDriver();
		// driver = new ChromeDriver();
		driver.get("http://csbmis.projectpresent.biz/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@pp.biz");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Login']")).click();
	}
	@Test
	//@Test(enabled=false)
	public void Allocation() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]")).click();
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='state_id']"));
		Select sel=new Select(ddAddr);
		List<WebElement> alloptions=sel.getOptions();
		alloptions.get(0).click();
		//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		WebElement ddAddr1 = driver.findElement(By.xpath("//select[@name='fiscal_id']"));
		Select sel1=new Select(ddAddr1);
		List<WebElement> alloptions1=sel1.getOptions();
		alloptions1.get(0).click();
		WebElement ddAddr2 = driver.findElement(By.xpath("//select[@name='scheme_id']"));
		Select sel2=new Select(ddAddr2);
		List<WebElement> alloptions2=sel2.getOptions();
		alloptions2.get(0).click();
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("800");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
	}
	@Test(enabled=false)
	//@Test
	public void Edit_Allocation() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div/ul/li[3]/a/span")).click();
		driver.findElement(By.xpath("//a[.='Edit']")).click();
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='state_id']"));
		Select sel=new Select(ddAddr);
		List<WebElement> alloptions=sel.getOptions();
		alloptions.get(0).click();
		//driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
		WebElement ddAddr1 = driver.findElement(By.xpath("//select[@name='fiscal_id']"));
		Select sel1=new Select(ddAddr1);
		List<WebElement> alloptions1=sel1.getOptions();
		alloptions1.get(0).click();
		WebElement ddAddr2 = driver.findElement(By.xpath("//select[@name='scheme_id']"));
		Select sel2=new Select(ddAddr2);
		List<WebElement> alloptions2=sel2.getOptions();
		alloptions2.get(1).click();
		driver.findElement(By.xpath("//input[@name='amount']")).clear();
		  Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//2b68b710f7e84b5fb668504c2fc2ce65
	}
	
	
	@AfterMethod
	public void tearDown()

	{
		driver.quit();
	
	}	

}
