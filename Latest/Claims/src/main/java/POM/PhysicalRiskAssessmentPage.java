package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhysicalRiskAssessmentPage {
	public PhysicalRiskAssessmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[@class='navbar-brand']") WebElement physicalPageTitle;
	private @FindBy(id="RiskAgent_chosen")WebElement riskAgentDropdown;
	private @FindBy(id="savePRiskAssessBtn")WebElement saveButton;
	private @FindBy(id="SaveAndApprovalPRiskAssessBtn")WebElement saveAndForwardButton;
	

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSaveAndForwardButton() {
		return saveAndForwardButton;
	}

	public WebElement getRiskAgentDropdown() {
		return riskAgentDropdown;
	}

	public WebElement getPhysicalPageTitle() {
		return physicalPageTitle;
	}
}
