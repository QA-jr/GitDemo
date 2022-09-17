package LocationsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class Test3Day3 {
	public WebDriver driver;

	
	By mobile= By.className("level0");
	By detailpage= By.cssSelector("img#product-collection-image-1");
By cart= By.xpath("//button[@type='button']");
 By displaymessage= By.className("success-msg");
 By cartQty=By.cssSelector("input[name*='cart']");
 By UpdateButton= By.cssSelector("button[title='Update']");
By ErrorMsg=By.className("error-msg");
By EmptyCart=By.cssSelector("button#empty_cart_button");
By EmpyCartMessage=By.cssSelector("div.cart-empty");

	public Test3Day3(WebDriver driver)
	{
				this.driver=driver;
			}
	
	
	@Test
	public WebElement mobileLink()
	{
		return driver.findElement(mobile);
		
	}
	@Test
	public WebElement detailpage()
	{
		return driver.findElement(detailpage);
		
	}
	@Test
	public WebElement add_to_cart()
	{
		return driver.findElement(cart);
		
	}
	@Test
	public WebElement SuccessMessage()
	{
		return driver.findElement(displaymessage);
		
	}
	public WebElement CartQnty()
	{
		return driver.findElement(cartQty);
		
	}
	public WebElement UpDate()
	{
		return driver.findElement(UpdateButton);
		
	}
	public WebElement ErrorMSG()
	{
		return driver.findElement(ErrorMsg);
		
	}
	public WebElement EmptyCart()
	{
		return driver.findElement(EmptyCart);
		
	}
	public WebElement EmptyCartMsg()
	{
		return driver.findElement(EmpyCartMessage);
		
	}
}
