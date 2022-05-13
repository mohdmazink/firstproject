package firstProjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		Thread.sleep(1000);

		driver.get("http://demo.medlablive.in");

		driver.navigate().back();

		Thread.sleep(1000);

		driver.navigate().forward();

		Thread.sleep(1000);

		driver.navigate().refresh();

	}

}
