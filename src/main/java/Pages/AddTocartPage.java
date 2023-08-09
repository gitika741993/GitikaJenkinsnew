package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GitikaJenkins.JenkinsTest.Basecl;

public class AddTocartPage extends Basecl {
	




	
		@FindBy(xpath= "//img[@alt='Radiant Tee']")
		WebElement Radiantshirt;
		
		@FindBy(xpath= "//button[@title='Add to Cart']")
		WebElement addtocart;
		
		@FindBy(xpath= "//div[@id='option-label-size-143-item-170']")
		WebElement selectsize;
		
		@FindBy(xpath= "//div[@id='option-label-color-93-item-50']")
		public WebElement selectcolor;
		
		@FindBy(xpath="//*[@class='counter-number' and contains(text(),'1')]")
		public WebElement cartvalue;
		//This class will add item from home page to cart
		
		@FindBy(xpath="//*[@class='action showcart']")
		public WebElement cart;
		
		@FindBy(xpath="//*[@id='top-cart-btn-checkout']")
		public WebElement checkout;
		
		
		
		public AddTocartPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickitem()
		{
			TestUtil.scrollpage(Radiantshirt);
			Radiantshirt.click();
		}
		
		public void selectoptions() throws InterruptedException
		{  
			Thread.sleep(4000);
			selectsize.click();
			selectcolor.click();	
		}
		
		public void addtocart() throws InterruptedException
		{
			Thread.sleep(5000);
			TestUtil.scrollpagetoclick(addtocart);
		  
		}
		
		public void movetocart() throws InterruptedException
		{
			
			cart.click();
			Thread.sleep(5000);
			checkout.click();
			
		  
		}
		
		
		

	}

	

