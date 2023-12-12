package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HardwareAssetPage {
	public HardwareAssetPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(id = "addHWItem") WebElement newAssetButton;
	private @FindBy(xpath = "//span[contains(@class,'dialog-title')]") WebElement hardwareAssetText;
	private @FindBy(xpath = "//button[@title='Close']") WebElement closeButton;
	private @FindBy(xpath = "//a[contains(@class,'toggle risk-panel')]") WebElement hardwareInventoryDetailstable;
	private @FindBy(xpath = "//label[text()='Asset Id']") WebElement assetIdLabel;
	private @FindBy(id = "AssetId") WebElement assetIdTextBox;
	private @FindBy(xpath = "//label[text()='Asset Class']") WebElement assetClassLabel;
	private @FindBy(id = "AssetClass_chosen") WebElement assetClassDropdown;
	private @FindBy(xpath = "//label[text()='Host/System Name']") WebElement hostLabel;
	private @FindBy(id = "SystemName") WebElement systemNameTextBox;
	private @FindBy(xpath = "//label[text()='Make/Model']") WebElement makeLabel;
	private @FindBy(id = "Model") WebElement modelTextBox;
	private @FindBy(xpath = "//label[text()='Description']") WebElement descriptionLabel;
	private @FindBy(id = "Description") WebElement descriptionTextBox;
	private @FindBy(xpath = "//label[text()='Hardware Criticality']") WebElement hardwareCriticalityLabel;
	private @FindBy(id = "HardwareCriticality_chosen") WebElement hardwareCriticalityDropdown;
	private @FindBy(xpath = "//label[text()='Type']") WebElement typeLabel;
	private @FindBy(id = "Type") WebElement typeTextBox;
	private @FindBy(xpath = "//label[text()='Risk assess frequency']") WebElement riskAssessFrequencyLabel;
	private @FindBy(id = "RiskAssessFreq_chosen") WebElement riskAssessFreqDropdown;
	private @FindBy(xpath = "//label[text()='Business Function']") WebElement businessFunctionLabel;
	private @FindBy(id = "BusinessFunction_chosen") WebElement businessFunctionDropdown;
	private @FindBy(xpath = "//label[text()='System/Business Owner']") WebElement systemOwnerLabel;
	private @FindBy(id = "BusinessOwnerName") WebElement businessOwnerNameTextBox;
	private @FindBy(xpath = "//label[text()='Department/Function']") WebElement departmentLabel;
	private @FindBy(id = "Department_chosen") WebElement departmentDropdown;
	private @FindBy(id = "saveHWItemBtn") WebElement saveButton;
	private @FindBy(linkText = "Hardware Asset") WebElement hardwareAssetBreadCrumb;
	private @FindBy(xpath = "//div[@id='ui-id-4']/p") WebElement successfulMsgOnHAP;

	public WebElement getSuccessfulMsgOnHAP() {
		return successfulMsgOnHAP;
	}

	public WebElement getHardwareAssetBreadCrumb() {
		return hardwareAssetBreadCrumb;
	}

	public WebElement getNewAssetButton() {
		return newAssetButton;
	}

	public WebElement getHardwareAssetText() {
		return hardwareAssetText;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getHardwareInventoryDetailstable() {
		return hardwareInventoryDetailstable;
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

	public WebElement getHostLabel() {
		return hostLabel;
	}

	public WebElement getSystemNameTextBox() {
		return systemNameTextBox;
	}

	public WebElement getMakeLabel() {
		return makeLabel;
	}

	public WebElement getModelTextBox() {
		return modelTextBox;
	}

	public WebElement getDescriptionLabel() {
		return descriptionLabel;
	}

	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public WebElement getHardwareCriticalityLabel() {
		return hardwareCriticalityLabel;
	}

	public WebElement getHardwareCriticalityDropdown() {
		return hardwareCriticalityDropdown;
	}

	public WebElement getTypeLabel() {
		return typeLabel;
	}

	public WebElement getTypeTextBox() {
		return typeTextBox;
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
