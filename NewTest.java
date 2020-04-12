package Flipkart.Flipkart;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest {
	public class firsttestngfile {
	    public String baseUrl = "http://demo.guru99.com/test/newtours/";
    	
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      System.out.println("launching chrome browser"); 
		    System.setProperty("webdriver.chrome.driver","C:/ANJAN/Automation/chromedriver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
	}
  }


