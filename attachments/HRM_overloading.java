package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HRM_overloading {
	
	WebDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		ormweb obj = new ormweb();
		obj.login();
		obj.search("Admin");
		
		}
	
	void login()
	{
	driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input [@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button (@type='submit']")).click();
	driver.findElement(By.xpath("//nav//div[2]//u1//11[1]//a")).click();
	}
	
	
	void search(String username) throws InterruptedException {
			
			// WebDriver driver = new ChromeDriver();
		    //,WebDriver d
			driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
			
	 }
	 
	 
	void search(String username,String Employeename) throws InterruptedException {
			
			
			driver.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
			driver .findElement(By.xpath("//button[@type='submit']")).click();


		}
}
