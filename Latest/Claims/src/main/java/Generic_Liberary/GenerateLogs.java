package Generic_Liberary;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateLogs {

	public static void main(String[] args) throws Throwable {
	Logger log = Logger.getLogger(GenerateLogs.class);
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	ReadData data = new ReadData();
	driver.get(data.fromPropertyFile("url"));
	driver.findElement(By.id("details-button")).click();
	driver.findElement(By.linkText("Proceed to demo.healthdox.com (unsafe)")).click();
	log.info("Launched Browser Successfully");
	String title = driver.getTitle();
	log.info("Shashank");
	System.out.println("title value is "+ title);
	driver.quit();
	

	}

}
