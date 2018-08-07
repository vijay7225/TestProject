package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class SecondTestCase 
{
	//Program for opening a page in firefox & test.
	public static void main(String[] args) 
	{
		// Create a new instance of the  driver
		//System.setProperty("webdriver.firefox.driver","D:\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.driver","D:\\firefoxdriver.exe");
		System.setProperty("webdriver.geckodriver","D:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
        //Launch the Online Store Website
		driver.get("http://www.store.demoqa.com");

        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

		//open url in new tab 
		//driver.findElement(By.cssSelector("Body").sendkeys(Keys.CONTROL+"t"));
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"T");
        driver.get("http://www.facebook.com");

		   // Close the driver
        driver.quit();
    }
}