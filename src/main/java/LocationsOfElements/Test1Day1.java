package LocationsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Test1Day1 {
	public WebDriver driver;
	
	By title= By.xpath("//div[@class='page-title']");
	By mobile= By.className("level0");
By selection= By.xpath("//div[@class='sort-by']/select/option[3]");
    By filter= By.xpath("//select[@onchange='setLocation(this.value)']/option[3]");
    
	
	public Test1Day1(WebDriver driver)
	{
				this.driver=driver;
			}
	
	@Test
	public WebElement TitleLink()
	{
		return driver.findElement(title);
		
	}
	@Test
	public WebElement mobileLink()
	{
		return driver.findElement(mobile);	
		}
@Test
	public WebElement SelecetLink()
	{
		return driver.findElement(selection);	
		}
	
	@Test
	public WebElement filterLink()
	{
		return driver.findElement(filter);	
		}
	
	

}
