package Main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Browsers.Browser_Actions;

public class loginpage extends Browser_Actions {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/span/a")
	WebElement Signin_button;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[1]/input")
	WebElement mailtextbox;

	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[2]/input")
	WebElement password_textbox;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div/div/div/div/div[2]/div/div[2]/div/div[3]/form/div[4]/button")
	WebElement Login_button;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login_test_positive(String Mail_textbox,String Password_textbox)
	{
		try
		{
			Boolean dis=Signin_button.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Signin_button is displayed");
			try
			{
				Boolean ena=Signin_button.isDisplayed();
				Assert.assertTrue(ena);
				System.out.println("Signin_button is enabled");
				Signin_button.click();
			}
			catch(Exception e)
			{
				System.out.println("Signin_button is enabled");

			}
		}
		catch(Exception e)
		{
			System.out.println("Signin_button is not displayed");

		}
		
		
		try
		{
			Boolean dis=mailtextbox.isDisplayed();
		    Assert.assertTrue(dis);
		    System.out.println("mailtextbox");
		    
		    
		    try
		    {
		    	Boolean ena=mailtextbox.isEnabled();
		    	Assert.assertTrue(ena);
		    	//System.out.println(true);
		    	String N =mailtextbox.getAttribute("value");
		    	if(N.isEmpty())
		    	{
		    		Thread.sleep(2000);
		    		mailtextbox.clear();
                    mailtextbox.sendKeys("saravanabalaji@blemediasolutions.com");
                    
		    	}
		    	else
		    	{
		    		Thread.sleep(2000);
                    mailtextbox.sendKeys("saravanabalaji@blemediasolutions.com");

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
	
		try	  
		{
			Boolean dis=password_textbox.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("password textbox is displayed");
	
			try
			{
            Boolean ena=password_textbox.isEnabled();				
            Assert.assertTrue(ena);
            System.out.println("password textbox is enabled");
            String M=password_textbox.getAttribute("value");
            if(M.isEmpty())
            {
	    		Thread.sleep(2000);
            	password_textbox.clear();
                password_textbox.sendKeys("Saro1045@");
            }
            else
            {
	    		Thread.sleep(2000);
                password_textbox.sendKeys("Saro1045@");

            }
            
			}
			catch(Exception e)
			{
				
	            System.out.println("password textbox is not enabled");

				}
			
		}
		catch(Exception e)
		{
			System.out.println("password textbox is not displayed");

		}
		
	
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

