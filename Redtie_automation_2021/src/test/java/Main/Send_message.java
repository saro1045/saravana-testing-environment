package Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Browsers.Browser_Actions;

public class Send_message extends Browser_Actions {

	@FindBy(how = How.XPATH, using = "//*[@id=\"contact search\"]/div/input")
	WebElement search_contact;

	@FindBy(how = How.XPATH, using = "//*[@id=\"607fc9283d244d481ab0b7b5\"]")
	WebElement click_contact;

	@FindBy(how = How.XPATH, using = "//*[@id=\"body\"]/div/div[5]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[5]/div[1]/div[1]/div[1]/div/div[1]/textarea")
	WebElement text_message;

	@FindBy(how = How.XPATH, using = "//*[@id=\"body\"]/div/div[5]/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div[5]/div[1]/div[1]/div[1]/div/div[2]/div/div/div/div[2]/i")
	WebElement Save_textmessage;

	@FindBy(how = How.XPATH, using = "/html//ul[@id='convlist_loadmore']/li[@class='item prod_outboundbg']//span[@class='product-description']/span[1]")
	WebElement howersavedmessage;

	@FindBy(how = How.XPATH, using = "/html//ul[@id='convlist_loadmore']/li[@class='item prod_outboundbg']/div[@class='product-info']//span[@class='d-inline-block d-md-inline-block postop_1up']/span[2]/a[@href='javascript:void(0)']/span/i")
	WebElement Editsavedmessage;

	@FindBy(how = How.XPATH, using = "/html//div[@id='body']/div[@class='wrapper']/div[@class='content-wrapper']/div[@class='content']/div[@class='container-fluid']/div[@class='send_message_div1']/div//a[.='Schedule']")
	WebElement SheduleMessage;

	public Send_message(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Send_Message() {

		try {
			Boolean dis = search_contact.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("search_contact is displayed");

			try {
				Boolean ena = search_contact.isEnabled();
				Assert.assertTrue(ena);
				String N = search_contact.getAttribute("value");
				if (N.isEmpty()) {
					Thread.sleep(2000);
					search_contact.sendKeys("4154832661");
					search_contact.submit();

				} else {
					Thread.sleep(2000);
					search_contact.clear();
					search_contact.sendKeys("4154832661");
					search_contact.submit();

				}
				System.out.println("search_contact is enabled");
			}

			catch (Exception e) {
				System.out.println("search_contact is disabled");
			}
		} catch (Exception e) {
			System.out.println("search_contact is not displayed");
		}

		try {
			Boolean dis = click_contact.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("click_contact is displayed");

			try {
				Boolean ena = click_contact.isEnabled();
				Assert.assertTrue(ena);
				System.out.println("click_contact is enabled");
				Thread.sleep(2000);
				click_contact.click();
			}

			catch (Exception e) {
				System.out.println("click_contact is diabled");
			}

		} catch (Exception e) {
			System.out.println("click_contact is not displayed");
		}

		try {
			Boolean dis = text_message.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("text_message is displayed");

			try {
				Boolean ena = text_message.isEnabled();
				Assert.assertTrue(ena);
				String N = text_message.getAttribute("value");
				if (N.isEmpty()) {

					Thread.sleep(2000);
					text_message.sendKeys(
							"CDC we will announce the 2021 contributor awards: Most Valuable Contributor, Most Valuable Advocate, Security MVP.......");

				} else {
					Thread.sleep(2000);
					text_message.clear();
					text_message.sendKeys(
							"CDC we will announce the 2021 contributor awards: Most Valuable Contributor, Most Valuable Advocate, Security MVP.......");
					System.out.println("text_message is enabled");

				}
			} catch (Exception e) {
				System.out.println("text_message is disabled");
			}

		}

		catch (Exception e) {
			System.out.println("text_message is not displayed");
		}

		try {
			Boolean dis = Save_textmessage.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("save_textmessage is displayed");

			try {
				Boolean ena = Save_textmessage.isEnabled();
				Assert.assertTrue(ena);
				Save_textmessage.click();
				System.out.println("save_textmessage is enabled");

			} catch (Exception e) {
				System.out.println("Save_textmessage is disabled");
			}
		} catch (Exception e) {
			System.out.println("Save_textmessage is not displayed");
		}

		try {
			Boolean dis = howersavedmessage.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("saved conversation is displayed");
			Thread.sleep(2000);
			Actions act = new Actions(driver);
			act.moveToElement(howersavedmessage).build().perform();

		} catch (Exception e) {
			System.out.println("howersavedmessage is not diaplayed");
		}

		try {
			Boolean dis = Editsavedmessage.isDisplayed();
			Assert.assertTrue(dis);
			System.out.println("Editsavedmessage is displayed");

			try {
				Boolean ena = Editsavedmessage.isDisplayed();
				Assert.assertTrue(ena);
				Thread.sleep(5000);
				Editsavedmessage.click();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				System.out.println("Editsavedmessage is enabled");
				driver.navigate().forward();

			} catch (Exception e) {
				System.out.println("Editsavedmessage is not enabled");

			}
		} catch (Exception e) {
			System.out.println("Editsavedmessage is not displayed");

		}

	}

}
