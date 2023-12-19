package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfessionalClaim {
	public ProfessionalClaim(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//h1") WebElement eeocHeader;
	private @FindBy(xpath = "//label[text()='Claim Number']")WebElement cliamNumberLabel;
	private @FindBy(id = "ClaimIncidentNumber") WebElement cliamNumberTextbox;
	
	private @FindBy(xpath = "//label[text()='Date of Incident']")WebElement dateOfIncidentLabel;
	private @FindBy(id = "DateOfIncident") WebElement ateOfIncidentTextbox;
	private @FindBy(xpath = "(//i[@class='fa fa-calendar bigger-110'])[1]") WebElement dateOfIncidentCalendar;
	
	private @FindBy(xpath = "//label[text()='ReportedBy']")WebElement reportedByLabel;
	private @FindBy(id = "ReportedBy") WebElement reportedByTextbox;
	
	private @FindBy(xpath = "//label[text()='Claimant']")WebElement claimantLabel;
	private @FindBy(id = "Claimant") WebElement claimantTextbox;
	
	private @FindBy(xpath = "//label[text()='DOB']")WebElement dobLabel;
	private @FindBy(id = "DOB") WebElement dobTextbox;
	private @FindBy(xpath = "(//span[@class='input-group-addon'])[2]") WebElement dobCalendar;
	
	private @FindBy(xpath = "//label[text()='MRN #']")WebElement MRNNumberLabel;
	private @FindBy(id = "MRNNumber") WebElement MRNNumberTextbox;
	
	private @FindBy(xpath = "//label[text()='Litigation Claim #']")WebElement litigationClaimNumberLabel;
	private @FindBy(id = "LitigationClaimNumber") WebElement litigationClaimNumberTextbox;
	
	private @FindBy(xpath = "//label[text()='Litigation Status']")WebElement litigationStatusLabel;
	private @FindBy(id = "LitigationStatus_chosen") WebElement litigationStatusDropdown;
	private @FindBy(xpath = "(//abbr[@class='search-choice-close'])[1]") WebElement closeIconForLitigationStatus;
	private @FindBy(xpath = "(//div[@class='chosen-search'])[1]") WebElement searchBoxForLitigationStatus;
	private @FindBy(xpath = "//option[text()='Closed']") WebElement closedOption;
	private @FindBy(xpath = "//option[text()='In-Progress']") WebElement inProgressOption;
	private @FindBy(xpath = "//option[text()='Open']") WebElement openOption;
	
	private @FindBy(xpath = "//label[text()='Date Filed']")WebElement dateFiledLabel;
	private @FindBy(id = "DateFiled") WebElement dateFiledTextbox;
	private @FindBy(xpath = "(//abbr[@class='search-choice-close'])[2]") WebElement closeIconForDateFiled;
	
	private @FindBy(xpath = "//label[text()='Policy Year']")WebElement policyYearLabel;
	private @FindBy(id = "Year_chosen") WebElement policyYearDropdown;
	private @FindBy(xpath = "(//abbr[@class='search-choice-close'])[2]") WebElement closeIconForPolicyYear;
	private @FindBy(xpath = "(//div[@class='chosen-search'])[2]") WebElement searchBoxForPolicyYear;
	
	private @FindBy(xpath = "//label[text()='Date Closed']")WebElement dateClosedLabel;
	private @FindBy(id = "DateClosed") WebElement dateClosedTextbox;
	private @FindBy(xpath = "(//abbr[@class='search-choice-close'])[3]") WebElement closeIconForDateClosed;
	
	private @FindBy(xpath = "//label[text()='Department']")WebElement departmentLabel;
	private @FindBy(xpath = "//i[@class='fa fa-folder-o bigger-110']") WebElement departmentIcon;
	private @FindBy(xpath = "(//span[text()='Berea'])[4]") WebElement departmentOption;
	private @FindBy(xpath = "(//span[text()='OK'])[4]") WebElement okButton;
	private @FindBy(xpath = "(//button[@title='Close'])[5]") WebElement closeButtonforDeptPopup;
	
	private @FindBy(xpath = "//label[text()='Attorney']")WebElement attorneyLabel;
	private @FindBy(id = "Attorney") WebElement attorneyTextbox;
	
	private @FindBy(xpath = "//label[text()='Discrimination Charge']")WebElement discriminationChargeLabel;
	private @FindBy(id = "DescriminationCharge") WebElement descriminationChargeTextbox;
	
	public WebElement getEeocHeader() {
		return eeocHeader;
	}
	public WebElement getCliamNumberLabel() {
		return cliamNumberLabel;
	}
	public WebElement getCliamNumberTextbox() {
		return cliamNumberTextbox;
	}
	public WebElement getDateOfIncidentLabel() {
		return dateOfIncidentLabel;
	}
	public WebElement getAteOfIncidentTextbox() {
		return ateOfIncidentTextbox;
	}
	public WebElement getDateOfIncidentCalendar() {
		return dateOfIncidentCalendar;
	}
	public WebElement getReportedByLabel() {
		return reportedByLabel;
	}
	public WebElement getReportedByTextbox() {
		return reportedByTextbox;
	}
	public WebElement getClaimantLabel() {
		return claimantLabel;
	}
	public WebElement getClaimantTextbox() {
		return claimantTextbox;
	}
	
	public WebElement getLitigationClaimNumberLabel() {
		return litigationClaimNumberLabel;
	}
	public WebElement getDobLabel() {
		return dobLabel;
	}
	public WebElement getDobTextbox() {
		return dobTextbox;
	}
	public WebElement getDobCalendar() {
		return dobCalendar;
	}
	public WebElement getMRNNumberLabel() {
		return MRNNumberLabel;
	}
	public WebElement getMRNNumberTextbox() {
		return MRNNumberTextbox;
	}
	public WebElement getLitigationClaimNumberTextbox() {
		return litigationClaimNumberTextbox;
	}
	public WebElement getLitigationStatusLabel() {
		return litigationStatusLabel;
	}
	public WebElement getLitigationStatusDropdown() {
		return litigationStatusDropdown;
	}
	public WebElement getCloseIconForLitigationStatus() {
		return closeIconForLitigationStatus;
	}
	public WebElement getSearchBoxForLitigationStatus() {
		return searchBoxForLitigationStatus;
	}
	public WebElement getClosedOption() {
		return closedOption;
	}
	public WebElement getInProgressOption() {
		return inProgressOption;
	}
	public WebElement getOpenOption() {
		return openOption;
	}
	public WebElement getDateFiledLabel() {
		return dateFiledLabel;
	}
	public WebElement getDateFiledTextbox() {
		return dateFiledTextbox;
	}
	public WebElement getCloseIconForDateFiled() {
		return closeIconForDateFiled;
	}
	public WebElement getPolicyYearLabel() {
		return policyYearLabel;
	}
	public WebElement getPolicyYearDropdown() {
		return policyYearDropdown;
	}
	public WebElement getCloseIconForPolicyYear() {
		return closeIconForPolicyYear;
	}
	public WebElement getSearchBoxForPolicyYear() {
		return searchBoxForPolicyYear;
	}
	public WebElement getDateClosedLabel() {
		return dateClosedLabel;
	}
	public WebElement getDateClosedTextbox() {
		return dateClosedTextbox;
	}
	public WebElement getCloseIconForDateClosed() {
		return closeIconForDateClosed;
	}
	public WebElement getDepartmentLabel() {
		return departmentLabel;
	}
	public WebElement getDepartmentIcon() {
		return departmentIcon;
	}
	public WebElement getDepartmentOption() {
		return departmentOption;
	}
	public WebElement getOkButton() {
		return okButton;
	}
	public WebElement getCloseButtonforDeptPopup() {
		return closeButtonforDeptPopup;
	}
	public WebElement getAttorneyLabel() {
		return attorneyLabel;
	}
	public WebElement getAttorneyTextbox() {
		return attorneyTextbox;
	}
	public WebElement getDiscriminationChargeLabel() {
		return discriminationChargeLabel;
	}
	public WebElement getDescriminationChargeTextbox() {
		return descriminationChargeTextbox;
	}
	public WebElement getExpenseReserveLabel() {
		return expenseReserveLabel;
	}
	public WebElement getExpenseReserveTextbox() {
		return expenseReserveTextbox;
	}
	public WebElement getSettlementReserveLabel() {
		return settlementReserveLabel;
	}
	public WebElement getCompensationReserveTextbox() {
		return compensationReserveTextbox;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public WebElement getResetButton() {
		return resetButton;
	}
	private @FindBy(xpath = "//label[text()='Expense Reserve']")WebElement expenseReserveLabel;
	private @FindBy(id = "ExpenseReserve") WebElement expenseReserveTextbox;

	private @FindBy(xpath = "//label[text()='Settlement Reserve']")WebElement settlementReserveLabel;
	private @FindBy(id = "CompensationReserve") WebElement compensationReserveTextbox;
	
	private @FindBy(id = "submitBtn") WebElement submitButton;
	private @FindBy(xpath = "//button[@type='reset']") WebElement resetButton;

}
