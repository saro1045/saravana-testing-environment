package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Browser_Actions
{

	public WebDriver driver;

	@BeforeSuite
	public void test()

	{
		
       WebDriverManager.chromedriver().setup(); 
       driver=new ChromeDriver();


       driver.manage().window().maximize();
       driver.get("https://app.redtie.co/signin");
       driver.getTitle();
	}

	@BeforeMethod
	public void open_Browser()
	{

	}

	@AfterMethod
	public void Close_Browser()
	{
		
	}

	@AfterSuite
	public void Flush_Report()
	{

	}
}



