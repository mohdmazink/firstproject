package firstProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));

		radio1.click();
		System.out.println("radio button1 selected");
		radio2.click();
		System.out.println("radio button2 selected");
	    radio3.click();
		System.out.println("radio button3 selected");
		
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		check1.click();
		WebElement check2 = driver.findElement(By.id("vfb-6-1"));
		check2.click();
		if (check1.isSelected()) {
			System.out.println("checkbox is toggled on");
			
		}else {
			System.out.println("checkbox is toggled off");
			
		}
if (check2.isSelected()) {
	System.out.println("checkbox is toggled on");
	
	
}else {
	System.out.println("checkbox is togggled off");
}
	}

}
