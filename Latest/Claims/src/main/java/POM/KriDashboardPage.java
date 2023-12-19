package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KriDashboardPage {
	public KriDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//div[@class='page-header']")WebElement pageHeader;
	public WebElement getPageHeader() {
		return pageHeader;
	}

}
