package seleniumExamples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FB_auto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Aravind\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804791&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D1007768%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwpqCZBhAbEiwAa7pXeWxa17djBuN1pFxyUkpdAAhB3up2t2ezTaXmwuIpQ9TzYaosuWsISxoCVi0QAvD_BwE");
		driver.findElement(By.name("firstname")).sendKeys("Aravind");
		//driver.findElement(By.name("")).sendKeys("");
		driver.findElement(By.name("lastname")).sendKeys("vicky");		
		driver.findElement(By.name("reg_email__")).sendKeys("avicky2022@gmail.com");		
		driver.findElement(By.name("reg_passwd__")).sendKeys("avicky2022@gmail.com");		
		driver.findElement(By.name("birthday_day")).sendKeys("1");
		driver.findElement(By.name("birthday_month")).sendKeys("january");
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")).click();
		driver.findElement(By.xpath("wesubmit")).click();
		
	}

}
