package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Aravind\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	//	driver.manage().window().maximize();
		
	
	}

}
