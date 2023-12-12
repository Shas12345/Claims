package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RiskReviewBoardPage {
	public RiskReviewBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//a[@class='navbar-brand']") WebElement riskReviewBoardPageTitle;
	private @FindBy(linkText = "Physical Risks") WebElement physicalRisk;
	private @FindBy(linkText = "Administrative Risks") WebElement administrativeRisk;
	private @FindBy(linkText = "Technology Risks") WebElement technologyRisk;
	private @FindBy(linkText = "Approved Risks") WebElement approvedRisk;
	private @FindBy(xpath = "(//tr[@role='row']//td[text()='Risk ID'])[4]/..") WebElement tableHeader;
	private @FindBy(xpath = "(//input[@type='search'])[4]") WebElement searchBar;
	private @FindBy(id = "approveTBtn") WebElement approveButton;
	private @FindBy(id = "deleteTBtn") WebElement deleteButton;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-folder-open'])[1]") WebElement viewKRIButton;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-folder-open'])[2]") WebElement reportsButtonNavBar;
	private @FindBy(xpath = "(//i[@class='menu-icon fa fa-folder-open'])[3]") WebElement postImplementationReviewNavBar;
	private @FindBy(partialLinkText = "Risk Excel Reports") WebElement riskExcelReports;
	private @FindBy(partialLinkText = "Risk PDF Reports") WebElement riskPdfReports;
	private @FindBy(partialLinkText = "KRI's in PDF") WebElement kriInPdfReports;
	private @FindBy(partialLinkText = "Physical Risks") WebElement physicalRisks;
	private @FindBy(partialLinkText = "Administrative Risks") WebElement administrativeRisks;
	private @FindBy(partialLinkText = "Technology Risks") WebElement technologyRisks;
	private @FindBy(partialLinkText = "All Risks") WebElement allRisks;
	private @FindBy(xpath = "//i[@class='ace-icon fa  fa-arrow-circle-o-down']") WebElement downloadIcon;

	public WebElement getPhysicalRisk() {
		return physicalRisk;
	}

	public WebElement getAdministrativeRisk() {
		return administrativeRisk;
	}

	public WebElement getTechnologyRisk() {
		return technologyRisk;
	}

	public WebElement getApprovedRisk() {
		return approvedRisk;
	}

	public WebElement getTableHeader() {
		return tableHeader;
	}

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getApproveButton() {
		return approveButton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getViewKRIButton() {
		return viewKRIButton;
	}

	public WebElement getReportsButtonNavBar() {
		return reportsButtonNavBar;
	}

	public WebElement getPostImplementationReviewNavBar() {
		return postImplementationReviewNavBar;
	}

	public WebElement getRiskExcelReports() {
		return riskExcelReports;
	}

	public WebElement getRiskPdfReports() {
		return riskPdfReports;
	}

	public WebElement getKriInPdfReports() {
		return kriInPdfReports;
	}

	public WebElement getPhysicalRisks() {
		return physicalRisks;
	}

	public WebElement getAdministrativeRisks() {
		return administrativeRisks;
	}

	public WebElement getTechnologyRisks() {
		return technologyRisks;
	}

	public WebElement getAllRisks() {
		return allRisks;
	}

	public WebElement getDownloadIcon() {
		return downloadIcon;
	}

	public WebElement getRiskReviewBoardPageTitle() {
		return riskReviewBoardPageTitle;
	}
}
