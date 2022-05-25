package Com.Mindtree.Project.CompreAss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public static void Test2() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
		
		//Verify the functionality of search Bar
		//1) functionality of Invalid keys
		
		WebElement m=driver.findElement(By.id("search"));
		m.sendKeys("Turdal");
		m.sendKeys(Keys.ENTER);
	}

}
