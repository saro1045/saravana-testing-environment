package Main;
//First commit
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Browsers.Browser_Actions;


public class Send_message extends Browser_Actions {

	@FindBy(how=How.XPATH,using="")
	WebElement hower_contact;
	
	@FindBy(how=How.XPATH,using="")
	WebElement Select_contact;
	
	@FindBy(how=How.XPATH,using="")
	WebElement Compose_button;
	
	@FindBy(how=How.XPATH,using="")
	WebElement text_message;
	
	@FindBy(how=How.XPATH,using="")
	WebElement Save_textmessage; 
	
	public Send_message(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Send_Message()
	{
		try
		{
			Boolean dis=hower_contact.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("hower_contact is displayed");
			
			
			try
			{
				Boolean ena=hower_contact.isEnabled();
				Assert.assertTrue(ena);
				Actions act=new Actions(driver);
				act.moveToElement(hower_contact).build().perform();
				System.out.println("hower_contact is enabled");
			}
			
			catch(Exception e)
			{
				System.out.println("hower_contact is disabled");
			}
		}
		catch(Exception e)
		{
			System.out.println("hower_contact is not displayed");
		}
		
		
		try
		{
			Boolean dis= Select_contact.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Select_contact is displayed");
			
			
			try
			{
				Boolean ena= Select_contact.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("Select_contact is enabled");
				Select_contact.click();
			}
			
			
			catch(Exception e)
			{
				System.out.println("Select_contact is diabled");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Select_contact is not displayed");
		}
		
		
	try
	{
		Boolean dis=Compose_button.isDisplayed();
		Assert.assertTrue(dis);
		System.out.println("Compose_button is displayed");
		
		
		try
		{
			Boolean ena=Compose_button.isEnabled();
			Assert.assertTrue(ena);
			Compose_button.click();
			System.out.println("Compose_button is enabled");
		}
		catch(Exception e)
		{
			System.out.println("Compose_button is disabled");
		}
		
	}
	
	catch(Exception e)
	{
		System.out.println("Compose_button is not displayed");
	}
	
	
	
	try
	{
		Boolean dis=text_message.isDisplayed();
		Assert.assertTrue(dis);
		System.out.println("");
		
		try
		{
			Boolean ena=text_message.isEnabled();
			Assert.assertTrue(ena);
			System.out.println("");
			String N= text_message.getAttribute("value");
			if(N.isEmpty())
			{
				text_message.clear();
				text_message.sendKeys("hi this is the test message from tester, testing the redtie webapp and this is the messaging platform which make the business people to grow up are reach the highlevel in their businesses");
			}
			else
			{
				text_message.sendKeys("hi this is the test message from tester, testing the redtie webapp and this is the messaging platform which make the business people to grow up are reach the highlevel in their businesses");
						
			}
		}
		catch(Exception e)
		{
			System.out.println("text_message is disabled");
		}
	}
	catch(Exception e)
	{
		System.out.println("text_message is not displayed");
	}
	
	
	
	try
	{
	Boolean dis=Save_textmessage.isDisplayed();	
	Assert.assertTrue(dis);
	System.out.println();
	
	try
	{
		Boolean ena=Save_textmessage.isEnabled();
		Assert.assertTrue(ena);
		Save_textmessage.click();
		System.out.println();
		
		
	}
	catch(Exception e)
	{
		System.out.println("Save_textmessage is disabled");
	}
	}
	catch(Exception e)
	{
		System.out.println("Save_textmessage is not displayed");
	}
	
	
	
	
	}
}
