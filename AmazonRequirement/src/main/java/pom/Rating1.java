package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rating1 {
	
	@FindBy(xpath=("//input[@id='twotabsearchtextbox']"))
	private WebElement search;

	@FindBy(xpath=("//input[@id='nav-search-submit-button']"))
	private WebElement searchButton;

	@FindBy(xpath=("(//div[@class='puisg-col-inner']//h2//span)[1]"))
	private WebElement clickonfrstmobile;

	
	
	//input[@id='nav-search-submit-button']
	public Rating1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void  PasstheDataintoSearchTab(String senddata)
	{
		search.sendKeys(senddata);
	}

	public void ClickonSearchButton()
	{
		searchButton.click();
	}

	public void  ClickonMobile()
	{
		clickonfrstmobile.click();

	}


}
