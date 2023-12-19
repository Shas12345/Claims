package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HipaaRiskManagementSystemPage {
	public HipaaRiskManagementSystemPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(xpath = "//nav[contains(@class,'navbar ')]") WebElement hrmHeaderText;

	public WebElement getHrmHeaderText() {
		return hrmHeaderText;
	}

	private @FindBy(xpath = "//i[text()='Technology Risks Assessment']") WebElement technologyRiskAssessmentText;
	private @FindBy(id = "RMS_Image") WebElement traImage;
	private @FindBy(xpath = "//i[text()='Administrative Risks Assessment']") WebElement administrativeRiskAssessmentText;
	private @FindBy(id = "HPM_Image") WebElement araImage;
	private @FindBy(xpath = "//i[text()='Physical Risks Assessment']") WebElement physicalRiskAssessmentText;
	private @FindBy(id = "Audit_Image") WebElement praImage;
	private @FindBy(xpath = "//i[text()='Risk Review Board']") WebElement riskReviewBoardText;
	private @FindBy(id = "SOP_Image") WebElement rrbImage;

	public WebElement getTechnologyRiskAssessmentText() {
		return technologyRiskAssessmentText;
	}

	public WebElement getTraImage() {
		return traImage;
	}

	public WebElement getAdministrativeRiskAssessmentText() {
		return administrativeRiskAssessmentText;
	}

	public WebElement getAraImage() {
		return araImage;
	}

	public WebElement getPhysicalRiskAssessmentText() {
		return physicalRiskAssessmentText;
	}

	public WebElement getPraImage() {
		return praImage;
	}

	public WebElement getRiskReviewBoardText() {
		return riskReviewBoardText;
	}

	public WebElement getRrbImage() {
		return rrbImage;
	}
}
