package Main;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Browsers.Browser_Actions;

public class loginpage extends Browser_Actions {
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[1]/input")
	WebElement mailtextbox;

	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[2]/input")
	WebElement passwordtextbox;

	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[4]/button")
	WebElement Login_button;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login_test_positive(String Mail_textbox, String password_textbox)
	{
		
		try
		{
			Boolean dis=mailtextbox.isDisplayed();
		    Assert.assertTrue(dis);
		    System.out.println("mailtextbox is displayed");
		    
		    
		    try
		    {
		    	Boolean ena=mailtextbox.isEnabled();
		    	Assert.assertTrue(ena);
			    System.out.println("mailtextbox is enabled");
		    	String N =mailtextbox.getAttribute("value");
		    	if(N.isEmpty())
		    	{
		    		Thread.sleep(2000);
		    		mailtextbox.clear();
		    		
                    mailtextbox.sendKeys("saravanabalaji+qa@blemediasolutions.com");

//		    		
//                    Random randomgenerator= new Random ();
//                    int ran = randomgenerator.nextInt(1000);
//                    mailtextbox.sendKeys("saravanabalaji"+ran+"@blemediasolutions.com");
		    		
		    	}
		    	else
		    	{
		    		Thread.sleep(2000);
		    		mailtextbox.click();
                    
                    mailtextbox.sendKeys("saravanabalaji+qa@blemediasolutions.com");

		    	}
		    }
		    	catch(Exception e)
				{
		    		System.out.println("mailtextbox is not enabled");

				}
		    }
		catch(Exception e)
		{
    		System.out.println("mailtextbox is not displayed");

		}
	
// password textbox
	
		try
		{
			Boolean dis=passwordtextbox.isDisplayed();
		    Assert.assertTrue(dis);
		    System.out.println("passwordtextbox is displayed");
		    
		    
		    try
		    {
		    	Boolean ena=passwordtextbox.isEnabled();
		    	Assert.assertTrue(ena);
			    System.out.println("passwordtextbox is enabled");

		    	String N =passwordtextbox.getAttribute("value");
		    	if(N.isEmpty())
		    	{
		    		Thread.sleep(2000);
		    		passwordtextbox.clear();
		    		
		    		passwordtextbox.sendKeys("Saro1045@");

                    
		    		
		    	}
		    	else
		    	{
		    		Thread.sleep(2000);
		    		passwordtextbox.click();
                    
		    		passwordtextbox.sendKeys("Saro1045@");

		    	}
		    }
		    	catch(Exception e)
				{
		    		System.out.println("passwordtextbox is not enabled");

				}
		    }
		catch(Exception e)
		{
    		System.out.println("passwordtextbox is not displayed");

		}
		
		
		
		
		
//login button		
		
	try
	{
		Boolean dis=Login_button.isDisplayed();
		Assert.assertTrue(dis);
		System.out.println("Login_button is displayed");
		try
		{
			Boolean ena=Login_button.isDisplayed();
			Assert.assertTrue(ena);
			System.out.println("Login_button is enabled");
			Login_button.click();
		}
		catch(Exception e)
		{
			System.out.println("Login_button is enabled");

		}
	}
	catch(Exception e)
	{
		System.out.println("Login_button is not displayed");

	}
	}
	
	}

