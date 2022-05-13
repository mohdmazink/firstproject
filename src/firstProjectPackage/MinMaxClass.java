package firstProjectPackage;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMaxClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://www.guru99.com/");

Point p = new Point(0, 3000);
driver.manage().window().setPosition(p);

Thread.sleep(10000);

driver.quit();
	}

}
