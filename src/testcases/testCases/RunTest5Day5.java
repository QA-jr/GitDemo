package testCases;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import LocationsOfElements.Test4Day4;
import LocationsOfElements.Test5Day5;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class RunTest5Day5 extends BaSe{
	
	@BeforeTest	
	public void muststep() throws IOException, InterruptedException
	{
		driver=initislizeBrowser();
		
		driver.get("http://live.techpanda.org/");
	
	}

	
	@Test
	public void Step1() throws InterruptedException
	{
		Test5Day5 td5= new Test5Day5(driver);
		
	td5.accountlink().click();
	td5.myaccountlink().click();
	td5.createanaccount().click();
	// td5.email().sendKeys("");
	td5.firstname().sendKeys("first");
	td5.lastname().sendKeys("last");
	td5.password().sendKeys("abcdef");   // same logic as email validation will be followed for password and confirm passwrd validation  
	td5.confirmpassword().sendKeys("abcdef");
	td5.registerbutton().click();
	if(td5.email().equals(null))
	{
	String emailvalidation= td5.emailvalidation().getText();
	System.out.println(emailvalidation);

	}
	
	
/*	else if(td5.email().sendKeys("testnew3@mailnator.com")
	{
	
		// ;
		//td5.registerbutton().click();

	}
	
	String successmessage= td5.successmessage().getText();
	System.out.println(successmessage);
	
	td5.tvlink().click();
	td5.tv().click();
	td5.sharewishlist().click();
	td5.enteremail().sendKeys("nwtst77@gmail.com");
	td5.entermsg().sendKeys("testing the wishlist send operation");
	td5.shareWishlist().click();
	String successmsg= td5.wishsuccessmsg().getText();
	System.out.println(successmsg);
	*/	}

		
	 
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
