package amazonTestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import ProductPom.ElementsPresentOnScreen;

public class VerifyElementsPresentOnScreen extends Base
{

	
	private WebDriver driver;
    private ElementsPresentOnScreen epos;
	@Parameters("browser")

	@BeforeTest
	public void launchBrowser(String browserName) throws InterruptedException 
	{
		System.out.println("Before  Test");
		System.out.println(browserName);
		
		if (browserName.equals("Chrome")) 
		{
			driver = openChromeBrowser();
		}
		
		if (browserName.equals("Firefox")) 
		{
			driver = openFirefoxBrowser();
			Thread.sleep(3000);
		}
		
		if (browserName.equals("Edge")) 
		{
			driver = openEdgeBrowser();
			
		}
		
		driver.manage().window().maximize();
	}

	@BeforeClass
	public void initializationOfPom()
	{
		System.out.println("Before class");
		epos=new ElementsPresentOnScreen(driver);

	}

	@BeforeMethod
	public void browserLaunch()
	{
		System.out.println("before method");
		driver.get("https://www.amazon.in/stores/page/A3398561-D71B-4ECB-928E-CBC894B64EEE");

	}
	@Test(priority=1)
	public void checkSuggestion(String a) 
	{
      epos.checkAutoSuggestion("Mobile");

	}
	
	@Test
	public void searchButton()
	{
		epos.clickOnSearchButton();
	}
		
	
	@AfterMethod
	public void CaptureScreenshotofFailedTest() {
		System.out.println("aftermethod");
	}

	@AfterClass
	public void afterclass() 
	{
		System.out.println("afterclass");
		epos = null;

	}

	@AfterTest
	public void closeBrowser() 
	{
		System.out.println("After test");
		driver.close();
		driver = null;
		System.gc();
	}
	// @AfterSuite

		
	
	
	
	
	
	
	
}
