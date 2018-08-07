package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Firefox;
public class FirstTestCase
{

	public static void main(String[] args) 
	{
	//, String mainWindowHandle) throws InterruptedException {
		
		// Create a new instance of the  driver
		//Program for opening a page in Chrome & test.
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");
		//driver.get("http://142.136.156.65:8180/atg/bcc/");
		//open url in new tab 
		driver.navigate().refresh();
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"T");
		//String windowHandle = driver.getWindowHandle();
		//ArrayList tabs = new ArrayList (driver.getWindowHandles());
		//System.out.println(tabs.size());
		//driver.switchTo().window((String) tabs.get(0));
		//driver.switchTo().window(mainWindowHandle);
		
        // Print a Log In message to the screen
        //System.out.println("Successfully opened the website www.Store.Demoqa.com");
        System.out.println("Successfully opened the Dev1 BCC");
        System.out.println("Successfully opened the website www.facebook.com");
     //   driver.get("http://www.facebook.com"); 
       // driver.findElement(By.id("loginName")).sendKeys("vijay.kshirsagar");
       // driver.findElement(By.id("loginPassword")).sendKeys("vijay123");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.PAGE_DOWN); 
        driver.findElement(By.linkText("http://www.facebook.com")).sendKeys(selectLinkOpeninNewTab);
       
        driver.get("http://www.facebook.com"); 
        // Close the driver
          driver.quit();
    }
}
