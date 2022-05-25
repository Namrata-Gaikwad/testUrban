package Com.Mindtree.Project.CompreAss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TstCase5 {
	@Test
	public static void Test5() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
		//click on user icon
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		Thread.sleep(5000);
		
		//click on sign in text
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		Thread.sleep(5000);
		
		//enter sign in credential
		WebElement w1=driver.findElement(By.xpath("//input[@class='email required input_authentication']"));
		w1.click();
		w1.sendKeys("gaikwadnamu81@gmail.com");
		Thread.sleep(5000);
		
		WebElement w2=driver.findElement(By.xpath("(//*[@id='spree_user_password'])[3]"));
		w2.click();
		w2.sendKeys("9158@Namu");
		Thread.sleep(5000);

		//click on sign in button
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();

	
	}

}
