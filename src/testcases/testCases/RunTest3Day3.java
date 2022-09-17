package testCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DEMO.NEWDEMO.BaSe;
import LocationsOfElements.Test1Day1;
import LocationsOfElements.Test3Day3;

public class RunTest3Day3 extends BaSe{
	
	@BeforeTest	
	public void muststep() throws IOException, InterruptedException
	{
		driver=initislizeBrowser();
		
		driver.get("http://live.techpanda.org/index.php/");
	
	}

	
	@Test
	public void Step1()
	{
		Test3Day3 td3= new Test3Day3(driver);
	
		td3.mobileLink().click();
		td3.detailpage().click();
		td3.add_to_cart().click();
		String meg1="Sony Xperia was added to your shopping cart." ;
		String displayMsg=td3.SuccessMessage().getText();
		Assert.assertEquals(meg1, displayMsg);
		System.out.println(displayMsg);
		
		td3.CartQnty().click();
		td3.CartQnty().clear();
		td3.CartQnty().sendKeys("1000");
		td3.UpDate().click();
		String Error="Some of the products cannot be ordered in requested quantity.";
		String ErrorGot=td3.ErrorMSG().getText();
		Assert.assertEquals(ErrorGot, Error);
		System.out.println(ErrorGot);
		td3.CartQnty().clear();;
		td3.CartQnty().sendKeys("1");
		td3.UpDate().click();
		td3.EmptyCart().click();
		String text=td3.EmptyCartMsg().getText();
		System.out.println(text);
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
