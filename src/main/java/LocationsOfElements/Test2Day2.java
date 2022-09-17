package LocationsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Test2Day2 {
	public WebDriver driver;
	
	By mobilelink= By.cssSelector("a[href*='mobile']");
	By xperia_price_1= By.cssSelector("span#product-price-1");
	By detailpage= By.cssSelector("a[title*='Sony']");
	By xperia_price_2= By.cssSelector("span.price");
	public Test2Day2(WebDriver driver)
	{
				this.driver=driver;
			}
	
	@Test
	public WebElement mobilelink()
	{
		return driver.findElement(mobilelink);
		
	}
	@Test
	public WebElement xperia_price_1()
	{
		return driver.findElement(xperia_price_1);
		
	}
	@Test
	public WebElement detailpage()
	{
		return driver.findElement(detailpage);
		
	}
	@Test
	public WebElement xperia_price_2()
	{
		return driver.findElement(xperia_price_2);
		
	}
}
