package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class W3school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ace;
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		ace=driver.findElement(By.xpath("//table//tbody//tr[3]//td[1]")).getText();
        System.out.println(ace);
	
	}

}
