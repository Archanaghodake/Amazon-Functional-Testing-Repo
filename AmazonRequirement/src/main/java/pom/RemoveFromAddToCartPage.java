package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveFromAddToCartPage {
	
	
	@FindBy(xpath=("//input[@id='twotabsearchtextbox']"))
	private WebElement search;

	@FindBy(xpath=("//input[@id='nav-search-submit-button']"))
	private WebElement searchButton;
	
	@FindBy(xpath=("(//div[@class='puisg-col-inner']//h2//span)[1]"))
	private WebElement clickonfrstmobile;

	
	@FindBy(xpath=("(//input[@id='add-to-cart-button'])[2]"))
	private WebElement addtoCart;
	
	private Actions act;
	private WebDriver driver;
	private JavascriptExecutor js;



	public RemoveFromAddToCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;

	}

	
	public void  PasstheDataintoSearchTab(String senddata)
	{
		search.sendKeys(senddata);
	}

	public void ClickonSearchButton()
	{
		searchButton.click();
	}
	
	public void ClickonFirstMobileButton()
	{
		
		clickonfrstmobile.click();
	}


	public void ClickonAddTocart()
	{
		js=(JavascriptExecutor) driver;
		//Thread.sleep(2000);
		
	   // js.executeScript("arguments[0].scrollIntoview(true),rating");

		js.executeScript("window.scrollBy(0,8000)");         //scroll down

		addtoCart.click();
	}

	
	


}
