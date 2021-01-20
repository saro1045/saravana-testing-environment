package Positive;

import org.testng.annotations.Test;

import Browsers.Browser_Actions;
import Main.Send_message;
import Main.loginpage;

public class positive_test extends Browser_Actions  {
	
	@Test(priority=0)
	public void test1()
	{
		loginpage log=new loginpage(driver);
		log.login_test_positive(null, null);
		
		
	}
    @Test(priority=1)
    public void test2()
    {
    	
    	loginpage log=new loginpage(driver);
		log.login_test_positive(null, null);
		
    	Send_message sm=new Send_message(driver);
    	sm.Send_Message();
    	
    }
		
	}


