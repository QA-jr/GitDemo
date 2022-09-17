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
import LocationsOfElements.Test2Day2;

public class RunTest2Day2 extends BaSe{

	@BeforeTest	
	public void muststep() throws IOException, InterruptedException
	{
		driver=initislizeBrowser();
		
		driver.get("http://live.techpanda.org/");
	
	}

	
	@Test
	public void xperia() throws InterruptedException
	{
		Test2Day2 td2= new Test2Day2(driver);
		td2.mobilelink().click();
		String Pricefront=td2.xperia_price_1().getText();
		System.out.println(Pricefront);
		Thread.sleep(3000);
		

		td2.detailpage().click();
		String pricedetail= td2.xperia_price_1().getText();
		System.out.println(pricedetail);
		Thread.sleep(3000);

			if(Pricefront.equals(pricedetail) )
			{
				System.out.println("sameprice");
			}
			else
			{
				System.out.println("not the sameprice");
			}
		
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
