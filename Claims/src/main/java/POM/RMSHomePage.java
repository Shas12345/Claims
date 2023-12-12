package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RMSHomePage {
	public RMSHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//span[contains(text(),'New Claim')]") WebElement newClaimsLeftNavBar;
	private @FindBy(xpath = "(//b[@class='arrow fa fa-angle-down'])[2]") WebElement newClaimsArrow;
	private @FindBy(xpath = "//span[contains(text(),'Claims')]") WebElement claimsList;
	private @FindBy(partialLinkText = "EEOC Claim") WebElement eeocClaim;
	private @FindBy(partialLinkText = "General Liability Claim") WebElement generalLibClaim;
	private @FindBy(partialLinkText = "Professional Liability Claim") WebElement professionalLibClaim;
	public WebElement getNewClaimsLeftNavBar() {
		return newClaimsLeftNavBar;
	}
	public WebElement getEeocClaim() {
		return eeocClaim;
	}
	public WebElement getGeneralLibClaim() {
		return generalLibClaim;
	}
	public WebElement getProfessionalLibClaim() {
		return professionalLibClaim;
	}
	public WebElement getNewClaimsArrow() {
		return newClaimsArrow;
	}
	public WebElement getClaimsList() {
		return claimsList;
	}
}
