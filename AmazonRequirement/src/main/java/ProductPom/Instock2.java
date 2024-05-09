package ProductPom;
	import java.time.Duration;

	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Instock2 {
		@FindBy(xpath = ("//div[@id='availability']"))
		private WebElement stockin;
		private Actions act;
		private WebDriver driver;
		private JavascriptExecutor js;
		private WebDriverWait wait;
		
		public Instock2(WebDriver driver) {
			this.driver = driver;
			act = new Actions (driver);
			wait = new WebDriverWait(driver, Duration.ofMillis(2000));
			PageFactory.initElements(driver, this);
			
		}
		
		public void stockinn() throws InterruptedException 
		{
		//	js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].ScrollIntoView(true)",stockin);

			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.visibilityOf(stockin));
			
			boolean result = stockin.isDisplayed();
			System.out.println("result");
		     if(result==true) 
		     {
			   System.out.println("Element is Displayed");
		      }
		   else
		      {
			   System.out.println("Element is not Displayed");
		      }
          //		act.moveToElement(stockin).build().perform();
			//get.text()
		}
	}

