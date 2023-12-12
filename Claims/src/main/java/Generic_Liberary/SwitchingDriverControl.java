package Generic_Liberary;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class SwitchingDriverControl {
	public static void switchDriverControl(WebDriver driver,String ParentWindowId, Set<String> allWindowId) {
	allWindowId.remove(ParentWindowId);
	for(String windowid:allWindowId) {
		driver.switchTo().window(windowid);	
		}
	}
}