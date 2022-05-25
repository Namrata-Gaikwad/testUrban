package Com.Mindtree.Project.CompreAss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1 {
	@Test

	public static void Test1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
		
		//Verify the functionality of search Bar
		//1) functionality of valid keys
		
		WebElement m=driver.findElement(By.id("search"));
		m.sendKeys("chairs");
		m.sendKeys(Keys.ENTER);
		//shows particular product details
		//click on selected products
		//which is helpful you to show features images etc
		
		WebElement m1=driver.findElement(By.xpath("//*[@id='search-results']/div[3]/ul/li[2]/div/a/img"));
		m1.click();

	}

}
