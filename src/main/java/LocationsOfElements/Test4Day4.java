package LocationsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Test4Day4 {
	public WebDriver driver;



By comparelist1=By.className("link-compare");
By comparelist2= By.cssSelector("a[href*='product_compare/add/product/1/']");
By comparebuttonclick= By.cssSelector("button[onClick*='index/items']");
By textname= By.tagName("h1");
By windowClose= By.cssSelector("button[onClick*='close']");

	public Test4Day4(WebDriver driver)
	{
				this.driver=driver;
			}
	
	

	

	@Test
	public WebElement comparelist1 ()
	{
		return driver.findElement(comparelist1);
		
	}
	
	@Test
	public WebElement comparelist2 ()
	{
		return driver.findElement(comparelist2);
		
	}
	@Test
	public WebElement comparebuttonclick ()
	{
		return driver.findElement(comparebuttonclick);
		
	}
	
	@Test
	public WebElement textname ()
	{
		return driver.findElement(textname);
		
	}
	
	@Test
	public WebElement windowClose ()
	{
		return driver.findElement(windowClose);
		
	}
	
}
