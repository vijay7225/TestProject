package mypack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * @author vijay.kshirsagar
 *
 */
public class ThirdTestCase 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();	 
	       driver.get("http://www.google.com");
	       driver.quit();
	}
}
