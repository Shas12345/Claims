package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IncidentPage {
	public IncidentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//span[contains(text(),'New Incident')]") WebElement newIncidentDropdown;
	private @FindBy(partialLinkText = "Medical Device Incident") WebElement medicalDeviceIncident;
	private @FindBy(xpath = "//span[contains(text(),'Incidents')]")WebElement incidentListView;
	public WebElement getNewIncidentDropdown() {
		return newIncidentDropdown;
	}
	public WebElement getMedicalDeviceIncident() {
		return medicalDeviceIncident;
	}
	public WebElement getIncidentListView() {
		return incidentListView;
	}
}
