package testCases;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DEMO.NEWDEMO.BaSe;
import LocationsOfElements.Test1Day1;

public class RunTest1Day1 extends BaSe{
	
	@BeforeTest	
	public void muststep() throws IOException, InterruptedException
	{
		driver=initislizeBrowser();
		
		driver.get("http://live.techpanda.org/index.php/");
	
	}

	
	@Test
	public void Step1()
	{
		Test1Day1 td1= new Test1Day1(driver);
	String PrintTitle= td1.TitleLink().getText();
	System.out.println(PrintTitle);
		td1.mobileLink().click();
		System.out.println(driver.getTitle());
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  try {
	          FileUtils.copyFile(screenshot, new File("E:\\NEWDEMO\\Screenshots\\BeforsortScreenshot.png"));
	      } catch (IOException e) {
	          System.out.println(e.getMessage());
	      }

		
	td1.SelecetLink().click();
		td1.filterLink().click();
		List<WebElement> elements = driver.findElements(By.cssSelector("span.price"));
	    for (WebElement element : elements) {
	    System.out.println("PriceList after sort :" + element.getText());
	    File screenshot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  try {
	          FileUtils.copyFile(screenshot1, new File("E:\\NEWDEMO\\Screenshots\\AftersortScreenshot.png"));
	      } catch (IOException e) {
	          System.out.println(e.getMessage());
	      }
	    }
		
	}
	
	@AfterTest
	public void TearDown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
