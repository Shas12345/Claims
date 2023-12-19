package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MedicalDeviceIncidentPage {
	public MedicalDeviceIncidentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	private @FindBy(xpath = "//label[text()='Incident Number']")WebElement incidentNumberLabel;
	private @FindBy(xpath = "//label[text()='Reported By']")WebElement reportedByLabel;
	public WebElement getIncidentNumberLabel() {
		return incidentNumberLabel;
	}
	public WebElement getReportedByLabel() {
		return reportedByLabel;
	}
	/*
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 * private @FindBy()WebElement private @FindBy()WebElement
	 */

}
