package firstProjectPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:/mazin/chromedriver/chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");

driver.findElement(By.name("q")).sendKeys("floweer");

driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

driver.findElement(By.name("btnK")).click();

driver.close();

	}

}
