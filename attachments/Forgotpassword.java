package seleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Forgotpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9040223%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXecXcZ5bNCW57S_W66wFZUhCwH7yp8jxKHhH4S2OLvS-GnDFTTZjPMxoCYgoQAvD_BwE");
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("Aravind");
		driver.findElement(By.name("lastname")).sendKeys("poliki");
		driver.findElement(By.name("reg_email__")).sendKeys("913983834");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc@123");
		driver.findElement(By.id("day")).sendKeys("1");
		driver.findElement(By.id("month")).sendKeys("jan");
		driver.findElement(By.id("year")).sendKeys("2001");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.name("websubmit")).click();

	}

}
