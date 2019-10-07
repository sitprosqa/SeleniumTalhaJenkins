package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SomePages 
{
	static WebElement element = null;
	
	WebDriver driver;
	
	public SomePages(WebDriver driver)
	{
		this.driver=driver;	
	}
	
	By textBox_search = By.name("q");
	By button_search = By.name("btnK"); 
	
	public void textBox_search(String text)
	{
		driver.findElement(textBox_search).sendKeys(text);
	}
	
	public void Button_click_search()
	{
		driver.findElement(textBox_search).sendKeys(Keys.ENTER);
	}
}
