package DEMO.NEWDEMO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaSe 
{
public WebDriver driver;
public Properties prop;
public WebDriver initislizeBrowser() throws IOException

{
Properties prop= new Properties();
FileInputStream fis= new FileInputStream("E:\\NEWDEMO\\src\\main\\java\\DEMO\\NEWDEMO\\list.properties");
prop.load(fis);
prop.getProperty("browser");
System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.manage().window().maximize();
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300, 1));
return driver;

}
public void screenshots()
{
	File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  try {
      FileUtils.copyFile(screenshot, new File("E:\\Practice_framework\\Screenshots\\screenshot.png"));
  } catch (IOException e) {
      System.out.println(e.getMessage());
  }
}
}