package Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("driver.chrome.driver","C:\\Users\\4390\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/login ");
		Thread.sleep(2000);
		String window=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/main/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("name")).sendKeys("Noman Sharif");
		driver.findElement(By.name("email")).sendKeys("noumansharif03@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Pakistan@03");
		driver.findElement(By.xpath("/html/body/main/div/form/div[4]/div[1]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/main/div/form/div[6]/input")).click();
		driver.switchTo().frame(0);
		driver.switchTo().window(window);
		
		

	}

}
