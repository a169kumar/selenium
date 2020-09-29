package Book;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;

public class ActionsClass{
	
	public static void main(String [] args) {
		System.setProperty("webdriver.ie.driver","‪F:/Selenium Library/b/IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		
	
		driver.get("http://www.facebook.com");
		
		WebElement email= driver.findElement(By.xpath("//input[@type='email']"));
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		 //driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
		
		
		Actions act= new Actions(driver);
		act.keyDown(Keys.CONTROL  );
		
		act.sendKeys("t");
		act.keyUp(Keys.CONTROL);
		 act.build().perform();
		
	//Actions act= new Actions(driver);
		
		//Keys.chord(Keys.CONTROL,"t");
		//driver.switchTo().window(tabs.get(1));
	    
		//email.sendKeys(Keys.CONTROL + "t");
			    
	act.keyDown(email,Keys.CONTROL  );
	
		act.sendKeys("t");
		act.keyUp(Keys.CONTROL);
		 act.build().perform();
		
		/*act.keyDown(email,Keys.SHIFT);
	    act.sendKeys("Test to be Converted ");
	    act.keyUp(Keys.SHIFT);
	    act.build().perform();*/
	    
		
		
	}

}
