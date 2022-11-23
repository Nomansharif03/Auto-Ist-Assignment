package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\4390\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.way2automation.com/way2auto_jquery/frames-and-windows.php");
		Thread.sleep(2000);
		String window=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[4]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		
		
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(2);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		
		
		
		driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(3);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(window);
		
		

	}

}
