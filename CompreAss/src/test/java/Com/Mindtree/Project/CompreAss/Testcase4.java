package Com.Mindtree.Project.CompreAss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase4 {
	@Test

	public static void Test4() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
		
		//Verify the functionality of Track Order
		
		WebElement m=driver.findElement(By.xpath("//*[@id=\'header\']/section/div/ul[1]/li[2]/a"));
		m.click();
	}

}
