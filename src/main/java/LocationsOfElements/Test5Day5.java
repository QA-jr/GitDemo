package LocationsOfElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test5Day5 {

	public WebDriver driver;
	
By accountlink= By.cssSelector("a[class*='skip-account']");
By myaccountlink= By.linkText("My Account");
By createanaccount= By.cssSelector("a[title*='Create']");
By firstname= By.id("firstname");
By lastname= By.id("lastname");
By password= By.id("password");
By confirmpassword= By.id("confirmation");
By registerbutton= By.cssSelector("button[title='Register']");
By email= By.id("email_address");
By emailvalidation= By.cssSelector("div#advice-required-entry-email_address");

By successmessage= By.className("success-msg");
By tvlink=By.cssSelector("a[href*='tv']");
By tv= By.cssSelector("a[href*='wishlist/index/add/product/4']");
By sharewishlist= By.cssSelector("button[title*='Share']");
By enteremail= By.id("email_address");
By entermsg= By.id("message");
By shareWishlist=By.cssSelector("button[title*='Share']");
By wishsuccessmsg= By.className("success-msg");


	
public  Test5Day5(WebDriver driver)
{
	this.driver=driver;
}

@Test
public WebElement accountlink() 
{
	return driver.findElement(accountlink);
}
@Test
public WebElement myaccountlink() 
{
	return driver.findElement(myaccountlink);
}
@Test
public WebElement createanaccount() 
{
	return driver.findElement(createanaccount);
}


@Test
public WebElement firstname() 
{
	return driver.findElement(firstname);
}

@Test
public WebElement lastname() 
{
	return driver.findElement(lastname);
}

@Test
public WebElement password() 
{
	return driver.findElement(password);
}

@Test
public WebElement confirmpassword() 
{
	return driver.findElement(confirmpassword);
}

@Test
public WebElement registerbutton() 
{
	return driver.findElement(registerbutton);
}

@Test
public WebElement email() 
{
	return driver.findElement(email);
}

@Test
public WebElement emailvalidation() 
{
	return driver.findElement(emailvalidation);
}

@Test
public WebElement successmessage() 
{
	return driver.findElement(successmessage);
}

@Test
public WebElement tvlink() 
{
	return driver.findElement(tvlink);
}


@Test
public WebElement tv() 
{
	return driver.findElement(tv);
}


@Test
public WebElement sharewishlist() 
{
	return driver.findElement(sharewishlist);
}

@Test
public WebElement enteremail() 
{
	return driver.findElement(enteremail);
}

@Test
public WebElement entermsg() 
{
	return driver.findElement(entermsg);
}

@Test
public WebElement shareWishlist() 
{
	return driver.findElement(shareWishlist);
}


@Test
public WebElement wishsuccessmsg() 
{
	return driver.findElement(wishsuccessmsg);
}

}