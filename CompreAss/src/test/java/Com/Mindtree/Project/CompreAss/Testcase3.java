package Com.Mindtree.Project.CompreAss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase3 {

	@Test
	public static void Test3() throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.Open Valid Url
		driver.get("https://www.urbanladder.com");
		
		//5.Verify the functionality of help Symbol
		
		WebElement m=driver.findElement(By.xpath("//*[@id=\'header\']/section/div/ul[1]/li[1]/a"));
		m.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		
		WebElement m1=driver.findElement(By.xpath("//*[@id=\'help-center-search-input\']"));
		m1.sendKeys("How do I buy an Urban Ladder product on EMI?");
		Thread.sleep(5000);
		m1.sendKeys(Keys.ENTER);


	}

}
