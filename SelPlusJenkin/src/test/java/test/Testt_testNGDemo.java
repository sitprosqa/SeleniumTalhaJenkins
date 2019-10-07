package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.SomePages;

public class Testt_testNGDemo 
{
	
	static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest()
	{
		System.getProperty("webdriver.chrome.driver","D:\\myWork\\SeleniumAndJenkin\\SelFrameWork\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public static void Gsearch()
	{
		driver.get("https://www.google.com");
		
		SomePages SP = new SomePages(driver);
		
		SP.textBox_search("blabb");
		SP.Button_click_search();
	}
	
	@AfterTest
	public void tearDownTest()
	{
		System.out.println("test Complete");
	}
}
