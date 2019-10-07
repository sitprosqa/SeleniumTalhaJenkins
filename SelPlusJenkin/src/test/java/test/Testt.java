package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SomePages;

public class Testt 
{
	
	static WebDriver driver=null;
	
	public static void main(String[] args) 
	{
		Gsearch();
	}
	
	public static void Gsearch()
	{
		System.getProperty("webdriver.chrome.driver","D:\\myWork\\SeleniumAndJenkin\\SelFrameWork\\driver\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		SomePages SP = new SomePages(driver);
		
		SP.textBox_search("blabb");
		SP.Button_click_search();
		
	
	}
}
