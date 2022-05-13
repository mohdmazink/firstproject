package firstProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");

		WebDriver obj = new ChromeDriver();

		obj.get("http://demo.guru99.com/test/radio.html");

		WebElement radio1 = obj.findElement(By.id("vfb-7-1"));
		WebElement radio2 = obj.findElement(By.id("vfb-7-2"));

		radio1.click();
		System.out.println("radio button 1 selected");
		radio2.click();
		System.out.println("radio button 2 selected");

		WebElement check1 = obj.findElement(By.id("vfb-6-0"));
		WebElement check2 = obj.findElement(By.id("vfb-6-1"));

		check1.click();
		if (check2.isSelected()) {
			System.out.println("checkbox is selected");

		} else {
			System.out.println("checkbox is not selected");
		}
		Boolean display = obj.findElement(By.id("vfb-6-0")).isDisplayed();
		System.out.println("element displayed" + display);

		Boolean enabled = obj.findElement(By.id("vfb-6-1")).isEnabled();
		System.out.println("element enable" + enabled);
	}

}
