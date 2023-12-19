package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SoftwareAssetPage {
	public SoftwareAssetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(id = "addSWItem") WebElement newAssetButton;
	private @FindBy(xpath = "//span[contains(@class,'dialog-title')]") WebElement softwareAssetText;
	private @FindBy(xpath = "//button[@title='Close']") WebElement closeButton;
	private @FindBy(xpath = "//a[contains(@class,'toggle risk-panel')]") WebElement softwareInventoryDetailstable;
	private @FindBy(xpath = "//label[text()='Asset Id']") WebElement assetIdLabel;
	private @FindBy(id = "AssetId") WebElement assetIdTextBox;
	private @FindBy(xpath = "//label[contains(@for,'AssetC')]") WebElement assetClassLabel;
	private @FindBy(id = "AssetClass_chosen") WebElement assetClassDropdown;
	private @FindBy(xpath = "//label[text()='Name of Application']") WebElement nameOfApplicationLabel;
	private @FindBy(id = "ApplicationName") WebElement applicationNameTextBox;
	private @FindBy(xpath = "//label[text()='Operating System']") WebElement operatingSystemLabel;
	private @FindBy(id = "Os_chosen") WebElement operatingSystemDropdown;
	private @FindBy(xpath = "//label[text()='Description']") WebElement descriptionLabel;
	private @FindBy(id = "Description") WebElement descriptionTextBox;
	private @FindBy(xpath = "//label[text()='Shared']") WebElement sharedLabel;
	private @FindBy(xpath = "//input[@id='Shared' and @value='Yes']") WebElement yesRadioButton;
	private @FindBy(xpath = "//input[@id='Shared' and @value='No']") WebElement noRadioButton;
	private @FindBy(xpath = "//label[text()='Application Criticality']") WebElement applicationCriticalityLabel;
	private @FindBy(id = "ApplicationCriticality_chosen") WebElement applicationCriticalityDropdown;
	private @FindBy(xpath = "//label[text()='Data Classification']") WebElement dataClassificationLabel;
	private @FindBy(id = "DataClassification_chosen") WebElement dataClassificationDropdown;
	private @FindBy(xpath = "//label[text()='Risk assess frequency']") WebElement riskAssessFrequencyLabel;
	private @FindBy(id = "RiskAssessFreq_chosen") WebElement riskAssessFreqDropdown;
	private @FindBy(xpath = "//label[text()='Business Function']") WebElement businessFunctionLabel;
	private @FindBy(id = "BusinessFunction_chosen") WebElement businessFunctionDropdown;
	private @FindBy(xpath = "//label[text()='System/Business Owner']") WebElement systemOwnerLabel;
	private @FindBy(id = "BusinessOwnerName") WebElement businessOwnerNameTextBox;
	private @FindBy(xpath = "//label[text()='Department/Function']") WebElement departmentLabel;
	private @FindBy(id = "Department_chosen") WebElement departmentDropdown;
	private @FindBy(id = "saveSWItemBtn") WebElement saveButton;

	public WebElement getNewAssetButton() {
		return newAssetButton;
	}

	public WebElement getSoftwareAssetText() {
		return softwareAssetText;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getSoftwareInventoryDetailstable() {
		return softwareInventoryDetailstable;
	}

	public WebElement getAssetIdLabel() {
		return assetIdLabel;
	}

	public WebElement getAssetIdTextBox() {
		return assetIdTextBox;
	}

	public WebElement getAssetClassLabel() {
		return assetClassLabel;
	}

	public WebElement getAssetClassDropdown() {
		return assetClassDropdown;
	}

	public WebElement getNameOfApplicationLabel() {
		return nameOfApplicationLabel;
	}

	public WebElement getApplicationNameTextBox() {
		return applicationNameTextBox;
	}

	public WebElement getOperatingSystemLabel() {
		return operatingSystemLabel;
	}

	public WebElement getOperatingSystemDropdown() {
		return operatingSystemDropdown;
	}

	public WebElement getDescriptionLabel() {
		return descriptionLabel;
	}

	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public WebElement getSharedLabel() {
		return sharedLabel;
	}

	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}

	public WebElement getNoRadioButton() {
		return noRadioButton;
	}

	public WebElement getApplicationCriticalityLabel() {
		return applicationCriticalityLabel;
	}

	public WebElement getApplicationCriticalityDropdown() {
		return applicationCriticalityDropdown;
	}

	public WebElement getDataClassificationLabel() {
		return dataClassificationLabel;
	}

	public WebElement getDataClassificationDropdown() {
		return dataClassificationDropdown;
	}

	public WebElement getRiskAssessFrequencyLabel() {
		return riskAssessFrequencyLabel;
	}

	public WebElement getRiskAssessFreqDropdown() {
		return riskAssessFreqDropdown;
	}

	public WebElement getBusinessFunctionLabel() {
		return businessFunctionLabel;
	}

	public WebElement getBusinessFunctionDropdown() {
		return businessFunctionDropdown;
	}

	public WebElement getSystemOwnerLabel() {
		return systemOwnerLabel;
	}

	public WebElement getBusinessOwnerNameTextBox() {
		return businessOwnerNameTextBox;
	}

	public WebElement getDepartmentLabel() {
		return departmentLabel;
	}

	public WebElement getDepartmentDropdown() {
		return departmentDropdown;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

}
