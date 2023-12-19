package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//p[@class='alert alert-info risk-panel']") WebElement infoTable;

	public WebElement getInfoTable() {
		return infoTable;
	}

	public WebElement getRiskTreatmentTable() {
		return riskTreatmentTable;
	}

	public WebElement getSelectControlLabel() {
		return selectControlLabel;
	}

	public WebElement getTechnicalRadioButton() {
		return technicalRadioButton;
	}

	public WebElement getManagementRadioButton() {
		return managementRadioButton;
	}

	public WebElement getOperationalRadioButton() {
		return operationalRadioButton;
	}

	public WebElement getControlNameLabel() {
		return controlNameLabel;
	}

	public WebElement getControlNameDropdown() {
		return controlNameDropdown;
	}

	public WebElement getSubControlLabel() {
		return subControlLabel;
	}

	public WebElement getSubControlNameDropdown() {
		return subControlNameDropdown;
	}

	public WebElement getDescriptionLabel() {
		return descriptionLabel;
	}

	public WebElement getDescriptionTextBox() {
		return descriptionTextBox;
	}

	public WebElement getNewControlsLabel() {
		return newControlsLabel;
	}

	public WebElement getActionProposedTextBox() {
		return actionProposedTextBox;
	}

	public WebElement getResponsibleLabel() {
		return responsibleLabel;
	}

	public WebElement getResponsibleTextBox() {
		return responsibleTextBox;
	}

	public WebElement getTargetDateLabel() {
		return targetDateLabel;
	}

	public WebElement getTargetDateTextBox() {
		return targetDateTextBox;
	}

	public WebElement getTargetDateCalenderIcon() {
		return targetDateCalenderIcon;
	}

	public WebElement getResponsibleDeptLabel() {
		return responsibleDeptLabel;
	}

	public WebElement getStatusDropdown() {
		return statusDropdown;
	}

	public WebElement getTargetQuarterLabel() {
		return targetQuarterLabel;
	}

	public WebElement getTargetQurterTextBox() {
		return targetQurterTextBox;
	}

	public WebElement getRiskResponseTable() {
		return riskResponseTable;
	}

	public WebElement getRiskResponseLabel() {
		return riskResponseLabel;
	}

	public WebElement getRiskResponseDropdown() {
		return riskResponseDropdown;
	}

	public WebElement getStatusLabel() {
		return statusLabel;
	}

	public WebElement getResponsibleDepartmentDropdown() {
		return responsibleDepartmentDropdown;
	}

	public WebElement getClosedLabel() {
		return closedLabel;
	}

	public WebElement getClosedDateTextBox() {
		return closedDateTextBox;
	}

	public WebElement getClosedDateCalenderIcon() {
		return closedDateCalenderIcon;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getSaveAndApprovalTRiskAssessBtnButton() {
		return saveAndApprovalTRiskAssessBtnButton;
	}

	private @FindBy(xpath = "//span[contains(text(),'KRI Dashboard')]") WebElement kriDashboardLeftNavBar;
	private @FindBy(xpath = " //span[contains(text(),'Risk Assessment')]") WebElement riskAssessmentLeftNavBar;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[1]") WebElement riskAssessmentArrow;
	private @FindBy(partialLinkText = "New Risk") WebElement newRisk;
	private @FindBy(partialLinkText = "Edit Risk") WebElement editRisk;
	private @FindBy(partialLinkText = "View Risk") WebElement viewRisk;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[2]") WebElement viewRiskArrow;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-file-o'])[1]") WebElement allRisk;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-file-o'])[2]") WebElement openRisk;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-file-o'])[3]") WebElement inProgressRisk;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-file-o'])[4]") WebElement closedRisk;
	private @FindBy(xpath = "//span[@class='menu-text']") WebElement collapseNavBar;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-folder-o'])[3]") WebElement selfRiskAssessment;
	private @FindBy(xpath = "//span[contains(text(),'Asset Inventory')]") WebElement assetInventorytLeftNavBar;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[3]") WebElement assetInventoryArrow;
	private @FindBy(partialLinkText = "Software Asset") WebElement softwareAsset;
	private @FindBy(partialLinkText = "Hardware Asset") WebElement hardwareAsset;
	private @FindBy(xpath = "//span[contains(text(),'Reports')]") WebElement reports;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[4]") WebElement repotsArrow;
	private @FindBy(partialLinkText = "Risk Excel Reports") WebElement riskExcelReports;
	private @FindBy(partialLinkText = "Risk PDF Reports") WebElement riskPdfReports;
	private @FindBy(partialLinkText = "Self Risk Assessment Report") WebElement selfRiskAssessmentReports;
	private @FindBy(xpath = "//i[@class='menu-icon fa fa-tachometer']") WebElement kriDashboardicon;

	public WebElement getKriDashboardicon() {
		return kriDashboardicon;
	}

	public WebElement getCollapseNavBar() {
		return collapseNavBar;
	}

	private @FindBy(partialLinkText = "KRI's in PDF") WebElement krisInPdf;
	private @FindBy(partialLinkText = "Software Asset Report") WebElement softwareAssetReports;
	private @FindBy(partialLinkText = "Hardware Asset Report") WebElement hardwareAssetReports;
	private @FindBy(xpath = "//span[contains(text(),'System Configuration')]") WebElement systemConfiguration;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[5]") WebElement systemConfigurationArrow;
	private @FindBy(partialLinkText = "Update Self Risk Assessment Questions") WebElement updateSelfRiskAssessmentQuestions;
	private @FindBy(id = "sidebar-toggle-icon") WebElement collapseIcon;
	private @FindBy(xpath = "(//a[@class='accordion-toggle risk-panel'])[1]") WebElement riskAssessmentTable;
	private @FindBy(xpath = "//label[text()='Risk Id']") WebElement riskIdLabel;
	private @FindBy(id = "RiskId") WebElement riskIdTextBox;
	private @FindBy(xpath = "//label[text()='Risk Asset Class']") WebElement riskAssetClassLabel;
	private @FindBy(id = "RiskAgent_chosen") WebElement riskAssetDropdown;
	private @FindBy(xpath = "//label[text()='Department/Function Name']") WebElement departmentLabel;
	private @FindBy(id = "DepartmentName") WebElement departmentNameTextBox;
	private @FindBy(xpath = "//label[text()='Entity/Asset Name']") WebElement entityLabel;
	private @FindBy(id = "AssetName") WebElement assetNameTextBox;
	private @FindBy(xpath = "//label[text()='Assessor/Owner']") WebElement AssessorLabel;
	private @FindBy(id = "Owner") WebElement assessorTextBox;
	private @FindBy(xpath = "//label[text()='Assessed Date']") WebElement AssessedLabel;
	private @FindBy(id = "AssessedDate") WebElement assessedTextBox;
	private @FindBy(xpath = "(//span[@class='input-group-addon'])[1]") WebElement assessedDateCalenderIcon;
	private @FindBy(xpath = "//label[text()='Risk Input']") WebElement riskInputLabel;
	private @FindBy(id = "RiskInput_chosen") WebElement riskInputDropdown;
	private @FindBy(xpath = "//label[text()='Threat Source']") WebElement threadSourceLabel;
	private @FindBy(id = "ThreatSource_chosen") WebElement threadSourceDropdown;
	private @FindBy(xpath = "//label[text()='Risk Description']") WebElement riskDescriptionLabel;
	private @FindBy(id = "RiskDescription") WebElement riskDescriptionTextBox;
	private @FindBy(xpath = "//label[text()='Threat/Vulnerability Description ']") WebElement threatDescriptionLabel;
	private @FindBy(id = "ThreatVulnerabilityDescription") WebElement threatDescriptionTextBox;
	private @FindBy(xpath = "//label[text()='Existing Controls ']") WebElement existingControlsLabel;
	private @FindBy(id = "ExistingControls") WebElement existingControlTextBox;
	private @FindBy(xpath = "//label[text()='Risk Impact Category']") WebElement riskImpactCategoryLabel;
	private @FindBy(id = "RiskImpactCategory_chosen") WebElement riskImpactDropdown;
	private @FindBy(xpath = "//label[text()='Probability of Occurance']") WebElement probabilityOfOccuranceLabel;
	private @FindBy(id = "ProbabilityofOccurence_chosen") WebElement probabilityOfOccuranceDropdown;
	private @FindBy(xpath = "//label[text()='Impact Level']") WebElement impactLevelLabel;
	private @FindBy(id = "ImpactLevel_chosen") WebElement impactLevelDropdown;
	private @FindBy(xpath = "//label[text()='Risk Exposure Level']") WebElement riskExposureLabel;
	private @FindBy(id = "defaultCondition") WebElement noDropdownSelectedBulbIcon;
	private @FindBy(id = "lowCondition") WebElement lowSelectedBulbIcon;
	private @FindBy(id = "mediumCondition") WebElement mediumSelectedBulbIcon;
	private @FindBy(id = "highCondition") WebElement highSelectedBulbIcon;
	private @FindBy(xpath = "(//a[@class='accordion-toggle risk-panel collapsed'])[2]") WebElement riskTreatmentTable;
	private @FindBy(xpath = "//label[text()='Select Control Class']") WebElement selectControlLabel;
	private @FindBy(xpath = "//span[@class='lbl']/..//input[@value='Technical']") WebElement technicalRadioButton;
	private @FindBy(xpath = "//span[@class='lbl']/..//input[@value='Management']") WebElement managementRadioButton;
	private @FindBy(xpath = "//span[@class='lbl']/..//input[@value='Operational']") WebElement operationalRadioButton;
	private @FindBy(xpath = "//label[text()='Control Name']") WebElement controlNameLabel;
	private @FindBy(id = "ControlName_chosen") WebElement controlNameDropdown;
	private @FindBy(xpath = "//label[text()='Sub Control Name']") WebElement subControlLabel;
	private @FindBy(id = "SubControl_chosen") WebElement subControlNameDropdown;
	private @FindBy(xpath = "//label[text()='Description']") WebElement descriptionLabel;
	private @FindBy(id = "Description") WebElement descriptionTextBox;
	private @FindBy(xpath = "//label[text()='New / Proposed Controls ']") WebElement newControlsLabel;
	private @FindBy(id = "ActionProposed") WebElement actionProposedTextBox;
	private @FindBy(xpath = "//label[text()='Responsible']") WebElement responsibleLabel;
	private @FindBy(id = "Responsible") WebElement responsibleTextBox;
	private @FindBy(xpath = "//label[text()='Target Date']") WebElement targetDateLabel;
	private @FindBy(id = "TargetDate") WebElement targetDateTextBox;
	private @FindBy(xpath = "(//span[@class='input-group-addon'])[2]") WebElement targetDateCalenderIcon;
	private @FindBy(xpath = "//label[text()='Responsible Dept']") WebElement responsibleDeptLabel;
	private @FindBy(id = "ResponsibleDepartment_chosen") WebElement responsibleDebtDropdown;
	private @FindBy(id = "Status_chosen") WebElement statusDropdown;

	public WebElement getResponsibleDebtDropdown() {
		return responsibleDebtDropdown;
	}

	private @FindBy(xpath = "//label[text()='Target Quarter']") WebElement targetQuarterLabel;
	private @FindBy(id = "TargetQurter") WebElement targetQurterTextBox;
	private @FindBy(xpath = "(//a[@class='accordion-toggle risk-panel collapsed'])[3]") WebElement riskResponseTable;
	private @FindBy(xpath = "//label[text()='Risk Response']") WebElement riskResponseLabel;
	private @FindBy(id = "RiskResponse_chosen") WebElement riskResponseDropdown;
	private @FindBy(xpath = "//label[text()='Status']") WebElement statusLabel;
	private @FindBy(id = "ResponsibleDepartment") WebElement responsibleDepartmentDropdown;
	private @FindBy(xpath = "//label[text()=' Closed Date']") WebElement closedLabel;
	private @FindBy(id = "ClosedDate") WebElement closedDateTextBox;
	private @FindBy(xpath = "(//span[@class='input-group-addon'])[3]") WebElement closedDateCalenderIcon;
	private @FindBy(id = "saveTRiskAssessBtn") WebElement saveButton;
	private @FindBy(id = "SaveAndApprovalTRiskAssessBtn") WebElement saveAndApprovalTRiskAssessBtnButton;
	private @FindBy(id = "TableList_info") WebElement tableCountBox;
	private @FindBy(linkText = "First") WebElement firstButton;
	private @FindBy(linkText = "Previous") WebElement previousButton;
	private @FindBy(linkText = "1") WebElement oneButton;
	private @FindBy(linkText = "2") WebElement twoButton;
	private @FindBy(linkText = "3") WebElement threeButton;
	private @FindBy(linkText = "4") WebElement fourButton;
	private @FindBy(linkText = "5") WebElement fiveButton;
	private @FindBy(linkText = "Next") WebElement nextButton;
	private @FindBy(linkText = "Last") WebElement lastButton;
	private @FindBy(xpath = "//div[contains(text(),'Technology Risk Assessment List')]") WebElement technologyRiskAssessmentListText;
	private @FindBy(xpath = "//h6[@class='smaller']") WebElement riskPendingText;
	private @FindBy(xpath = "//h6[@class='blue smaller']") WebElement riskSentText;
	private @FindBy(xpath = "//h6[@class='green smaller']") WebElement approvedText;
	private @FindBy(xpath = "//input[@type='search']") WebElement searchTextBox;
	private @FindBy(xpath = "//div[@class='widget-header widget-header-small']") WebElement successfullPopupHeader;
	private @FindBy(id = "ui-id-1") WebElement textOnSuccessfullPopup;

	public WebElement getSuccessfullPopupHeader() {
		return successfullPopupHeader;
	}

	public WebElement getTextOnSuccessfullPopup() {
		return textOnSuccessfullPopup;
	}

	public WebElement getTableCountBox() {
		return tableCountBox;
	}

	public WebElement getFirstButton() {
		return firstButton;
	}

	public WebElement getPreviousButton() {
		return previousButton;
	}

	public WebElement getOneButton() {
		return oneButton;
	}

	public WebElement getTwoButton() {
		return twoButton;
	}

	public WebElement getThreeButton() {
		return threeButton;
	}

	public WebElement getFourButton() {
		return fourButton;
	}

	public WebElement getFiveButton() {
		return fiveButton;
	}

	public WebElement getNextButton() {
		return nextButton;
	}

	public WebElement getLastButton() {
		return lastButton;
	}

	public WebElement getTechnologyRiskAssessmentListText() {
		return technologyRiskAssessmentListText;
	}

	public WebElement getRiskPendingText() {
		return riskPendingText;
	}

	public WebElement getRiskSentText() {
		return riskSentText;
	}

	public WebElement getApprovedText() {
		return approvedText;
	}

	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getRiskIdLabel() {
		return riskIdLabel;
	}

	public WebElement getRiskIdTextBox() {
		return riskIdTextBox;
	}

	public WebElement getRiskAssetClassLabel() {
		return riskAssetClassLabel;
	}

	public WebElement getRiskAssetDropdown() {
		return riskAssetDropdown;
	}

	public WebElement getDepartmentLabel() {
		return departmentLabel;
	}

	public WebElement getDepartmentNameTextBox() {
		return departmentNameTextBox;
	}

	public WebElement getEntityLabel() {
		return entityLabel;
	}

	public WebElement getAssetNameTextBox() {
		return assetNameTextBox;
	}

	public WebElement getAssessorLabel() {
		return AssessorLabel;
	}

	public WebElement getAssessorTextBox() {
		return assessorTextBox;
	}

	public WebElement getAssessedLabel() {
		return AssessedLabel;
	}

	public WebElement getAssessedTextBox() {
		return assessedTextBox;
	}

	public WebElement getAssessedDateCalenderIcon() {
		return assessedDateCalenderIcon;
	}

	public WebElement getRiskInputLabel() {
		return riskInputLabel;
	}

	public WebElement getRiskInputDropdown() {
		return riskInputDropdown;
	}

	public WebElement getThreadSourceLabel() {
		return threadSourceLabel;
	}

	public WebElement getThreadSourceDropdown() {
		return threadSourceDropdown;
	}

	public WebElement getRiskDescriptionLabel() {
		return riskDescriptionLabel;
	}

	public WebElement getRiskDescriptionTextBox() {
		return riskDescriptionTextBox;
	}

	public WebElement getThreatDescriptionLabel() {
		return threatDescriptionLabel;
	}

	public WebElement getThreatDescriptionTextBox() {
		return threatDescriptionTextBox;
	}

	public WebElement getExistingControlsLabel() {
		return existingControlsLabel;
	}

	public WebElement getExistingControlTextBox() {
		return existingControlTextBox;
	}

	public WebElement getRiskImpactCategoryLabel() {
		return riskImpactCategoryLabel;
	}

	public WebElement getRiskImpactDropdown() {
		return riskImpactDropdown;
	}

	public WebElement getProbabilityOfOccuranceLabel() {
		return probabilityOfOccuranceLabel;
	}

	public WebElement getProbabilityOfOccuranceDropdown() {
		return probabilityOfOccuranceDropdown;
	}

	public WebElement getImpactLevelLabel() {
		return impactLevelLabel;
	}

	public WebElement getImpactLevelDropdown() {
		return impactLevelDropdown;
	}

	public WebElement getRiskExposureLabel() {
		return riskExposureLabel;
	}

	public WebElement getNoDropdownSelectedBulbIcon() {
		return noDropdownSelectedBulbIcon;
	}

	public WebElement getLowSelectedBulbIcon() {
		return lowSelectedBulbIcon;
	}

	public WebElement getMediumSelectedBulbIcon() {
		return mediumSelectedBulbIcon;
	}

	public WebElement getHighSelectedBulbIcon() {
		return highSelectedBulbIcon;
	}

	public WebElement getRiskAssessmentTable() {
		return riskAssessmentTable;
	}

	public WebElement getKriDashboardLeftNavBar() {
		return kriDashboardLeftNavBar;
	}

	public WebElement getRiskAssessmentLeftNavBar() {
		return riskAssessmentLeftNavBar;
	}

	public WebElement getRiskAssessmentArrow() {
		return riskAssessmentArrow;
	}

	public WebElement getNewRisk() {
		return newRisk;
	}

	public WebElement getEditRisk() {
		return editRisk;
	}

	public WebElement getViewRisk() {
		return viewRisk;
	}

	public WebElement getViewRiskArrow() {
		return viewRiskArrow;
	}

	public WebElement getAllRisk() {
		return allRisk;
	}

	public WebElement getOpenRisk() {
		return openRisk;
	}

	public WebElement getInProgressRisk() {
		return inProgressRisk;
	}

	public WebElement getClosedRisk() {
		return closedRisk;
	}

	public WebElement getSelfRiskAssessment() {
		return selfRiskAssessment;
	}

	public WebElement getAssetInventorytLeftNavBar() {
		return assetInventorytLeftNavBar;
	}

	public WebElement getAssetInventoryArrow() {
		return assetInventoryArrow;
	}

	public WebElement getSoftwareAsset() {
		return softwareAsset;
	}

	public WebElement getHardwareAsset() {
		return hardwareAsset;
	}

	public WebElement getReports() {
		return reports;
	}

	public WebElement getRepotsArrow() {
		return repotsArrow;
	}

	public WebElement getRiskExcelReports() {
		return riskExcelReports;
	}

	public WebElement getRiskPdfReports() {
		return riskPdfReports;
	}

	public WebElement getSelfRiskAssessmentReports() {
		return selfRiskAssessmentReports;
	}

	public WebElement getKrisInPdf() {
		return krisInPdf;
	}

	public WebElement getSoftwareAssetReports() {
		return softwareAssetReports;
	}

	public WebElement getHardwareAssetReports() {
		return hardwareAssetReports;
	}

	public WebElement getSystemConfiguration() {
		return systemConfiguration;
	}

	public WebElement getSystemConfigurationArrow() {
		return systemConfigurationArrow;
	}

	public WebElement getUpdateSelfRiskAssessmentQuestions() {
		return updateSelfRiskAssessmentQuestions;
	}

	public WebElement getCollapseIcon() {
		return collapseIcon;
	}

}
