package firstProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("helo world");
		
		System.setProperty("webdriver.chrome.driver","D:/mazin/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-for-loop");
		
	driver.findElement(By.id("gsc-i-id1")).sendKeys("keyword");
	
	//wait comment
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"___gcse_1\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
		
		driver.close();

	}

}
