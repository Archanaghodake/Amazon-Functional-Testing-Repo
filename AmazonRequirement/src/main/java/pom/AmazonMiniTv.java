package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMiniTv {
	
	@FindBy(xpath=("//a[text()='Amazon miniTV']"))
	private WebElement amazonMiniTV;

	@FindBy(xpath=("//span[text()='Home']"))
	private WebElement home;
	
	@FindBy(xpath=("//span[text()='Imported']"))
	private WebElement imported;
	
	@FindBy(xpath=("//span[text()='Web Series']"))
	private WebElement webSeries;
	
	@FindBy(xpath=("//span[text()='Playground']"))
	private WebElement playground;

	@FindBy(xpath=("//span[text()='Movies']"))
	private WebElement movies;

	@FindBy(xpath=("//span[text()='Romance']"))
	private WebElement romance;

	@FindBy(xpath=("//span[text()='Comedy']"))
	private WebElement comedy;

	AmazonMiniTv(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void HomePageElement()
	{
		amazonMiniTV.click();
		home.click();
		imported.click();
        webSeries.click();
		playground.click();
		movies.click();
		romance.click();
		comedy.click();

	}

	
	
	

	
	

}
