package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrativeRiskAssessmentPage {
	public AdministrativeRiskAssessmentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[@class='navbar-brand']") WebElement administrativePageTitle;
	private @FindBy(xpath = "//div[@class='page-header']") WebElement pageHeader;
	private @FindBy(xpath = "//div[@class='table-header']") WebElement listHeader;
	private @FindBy(xpath = "//label[text()='Risk Agent']") WebElement riskAgentLabel;
	private @FindBy(id = "RiskAgent_chosen") WebElement riskAgentDropdown;
	private @FindBy(id = "saveARiskAssessBtn") WebElement saveButton;
	private @FindBy(id = "saveARiskAssessBtn") WebElement saveAndForwardApprovalButton;

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSaveAndForwardApprovalButton() {
		return saveAndForwardApprovalButton;
	}

	public WebElement getRiskAgentLabel() {
		return riskAgentLabel;
	}

	public WebElement getRiskAgentDropdown() {
		return riskAgentDropdown;
	}

	public WebElement getListHeader() {
		return listHeader;
	}

	public WebElement getAdministrativePageTitle() {
		return administrativePageTitle;
	}

	public WebElement getPageHeader() {
		return pageHeader;
	}

}
