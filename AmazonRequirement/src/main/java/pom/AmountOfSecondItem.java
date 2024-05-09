package pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmountOfSecondItem {

	@FindBy(xpath=("(//input[@class='a-button-input'])[22]"))
	private WebElement CartButton;

	
	@FindBy(xpath = ("(//div[@data-name='Subtotals'])[1]"))  
	private WebElement subTotal;

	
	private WebDriverWait wait;
	private Actions act;
	private WebDriver driver;
	private JavascriptExecutor js;



	public AmountOfSecondItem(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;

	}

	
	public void clickOnCartButtonForCheck() throws InterruptedException
	{
		//wait.until(ExpectedConditions.visibilityOf(CartButton));
        Thread.sleep(3000);
		CartButton.click();
	}

		
	public void subTOtalOfAllItem()
	{
    boolean result=subTotal.isDisplayed();
    if(result)
    {
    	System.out.println("total amount is displayed");
    	
    }
    else
    {
    	System.out.println("total amount is not displayed");
    }
	}


}

	
	
	

