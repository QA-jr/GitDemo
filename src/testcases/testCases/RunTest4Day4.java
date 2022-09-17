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

public class RunTest4Day4 extends BaSe{
	
	@BeforeTest	
	public void muststep() throws IOException, InterruptedException
	{
		driver=initislizeBrowser();
		
		driver.get("http://live.techpanda.org/index.php/mobile.html/");
	
	}

	
	@Test
	public void Step1() throws InterruptedException
	{
		Test4Day4 td4= new Test4Day4(driver);
	
	
	td4.comparelist1().click();
	td4.comparelist2().click();
	td4.comparebuttonclick().click();
	
	Set <String>windows= driver.getWindowHandles();
	Iterator<String>it= windows.iterator();
	String parentId= it.next();
	String childId= it.next();
	driver.switchTo().window(childId);
	driver.manage().window().maximize();
String printText=	td4.textname().getText();
System.out.println(printText);

Thread.sleep(5000);
JavascriptExecutor js= (JavascriptExecutor)driver; 
js.executeScript("window.scrollBy(0,500)");//scroll on a page
Thread.sleep(3000);
td4.windowClose().click();
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
