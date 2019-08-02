package SeleniumDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class NewTest {
	String expectedresult="Welcome: Mercury Tours";
	WebDriver driver;
  @Test
  public void search() {
	  driver.get("http://demoaut.com/");
	  Assert.assertEquals(driver.getTitle(), expectedresult);
	  driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	  Select a = new Select(driver.findElement(By.name("passCount")));
	  a.selectByIndex(3);
	  Select b = new Select(driver.findElement(By.name("fromPort")));
	  b.selectByVisibleText("Frankfurt");
	  Select c = new Select(driver.findElement(By.name("fromMonth")));
	  c.selectByVisibleText("August");
	  Select d = new Select(driver.findElement(By.name("fromDay")));
	  d.selectByValue("3");
	  Select e = new Select(driver.findElement(By.name("toPort")));
	  e.selectByIndex(2);
	  Select f = new Select(driver.findElement(By.name("toMonth")));
	  f.selectByIndex(11);
	  Select g = new Select(driver.findElement(By.name("toDay")));
	  g.selectByValue("2");
	  Select h = new Select(driver.findElement(By.name("airline")));
	  h.selectByVisibleText("Pangea Airlines");
	  driver.findElement(By.xpath("//input[@name='findFlights']")).click();
	  driver.findElement(By.xpath("//input[@name='outFlight']")).click();
	  driver.findElement(By.xpath("//input[@name='inFlight']")).click();
	  driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	  
	  
	  
	  
	  
	  
	 //Assert.assertEquals(driver.getTitle(), expectedresult);
	
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
	   driver=new ChromeDriver(); 
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	 Thread.sleep(5000);
	
  }

}
