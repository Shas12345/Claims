package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContractPage {
	public ContractPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "(//input[contains(@id,'ext-comp-')])[3]") WebElement ele;
	private @FindBy(xpath = "//span[@class='x-form-twin-triggers']") WebElement searchEle;
	private @FindBy(xpath = "//div[@style='text-align: center; margin-left: -5px; align:middle;']") WebElement popup;

	public WebElement getPopup() {
		return popup;
	}

	public WebElement getSearchEle() {
		return searchEle;
	}

	public WebElement getEle() {
		return ele;
	}

}
