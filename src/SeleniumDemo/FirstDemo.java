package SeleniumDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
driver.get("https://google.com");
driver.manage().window().maximize();
driver.findElement(By.name("q")).sendKeys("Flipkart");
driver.findElement(By.name("q")).submit();
driver.findElement(By.className("iUh30")).click();
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']")).click();
//driver.findElement(By.className("_2AkmmA _29YdH8")).click();
driver.findElement(By.name("q")).sendKeys("mobiles");
driver.findElement(By.name("q")).submit();
driver.findElement(By.className("_3wU53n")).click();
driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@class='_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']")).click();
driver.close();
		
		/*System.setProperty("webdriver.gecko.driver","C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); 
		driver.get("https://www.guru99.com/xpath-selenium.html");*/
		
	}

}
