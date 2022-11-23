package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Taask1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\4390\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		WebElement hover1 = driver.findElement(By.xpath("//*[@id=\"menu-item-27580\"]/a/span[2]"));
		Actions action1= new Actions(driver);
		action1.moveToElement(hover1).perform();
		Thread.sleep(1000);
		WebElement hover2 = driver.findElement(By.xpath("//*[@id=\"menu-item-27582\"]/a"));
		Actions action2 = new Actions(driver);
		action2.moveToElement(hover2).perform();
		driver.findElement(By.xpath("//*[@id=\"menu-item-27583\"]/a/span[2]")).click();
		Thread.sleep(5000);
		if(driver.getTitle().contains("Selenium Training Online"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		

	}

}
