package seleniumExamples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hrm_leave {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver();
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		driver.manage().timeouts().implicitlywait (1980, Timeunit.MILLISECONDS);
 		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123"); 
	    driver.findElement(By.xpath("//button")).click();
	    driver.findElement(By.xpath("//li[3]")).click();
	    driver.findElement(By.xpath("//li[@class 'oxd-topbar-body-nav-tab]]/[1]")).click();
	    driver.findElement(By.xpath("//div[class='oxd-select-text oxd-select-text--active /div[2]/
		driver.findElement(By.xpath("//ontains(text(), 'CAN')}")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input"/input")).sendKeys("2022-09-28"); "
		driver.findElement(By.xpath("//textarea")).sendKeys("Family Function");
		driver.manage().timeouts().implicitlywait(1000, TimeUnit. MILLISECONDS);
		driver.findElement(By.xpath("//button[type='submit']")).click();
	
	
	
	
	}

}
