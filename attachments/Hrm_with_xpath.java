package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm_with_xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@name='username']")).sendkeys("Admin");
		  driver.findElement(By.xpath("//input[@name='password']")).sendkeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
