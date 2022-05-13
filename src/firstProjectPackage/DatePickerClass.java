package firstProjectPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerClass {

	public static void main(String[] args) throws InterruptedException {
		{
			// TODO Auto-generated method stub

			String month = "may 2022";
			String days = "22";

			System.setProperty("webdriver.chrome.driver", "D:\\mazin\\chromedriver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");

			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label")).click();
			
			Thread.sleep(2000);
			
			while(true)
			{
			
				String text=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
				
			if(text.equals(month));	
			}
			
			
			
			

		}

	}
}
