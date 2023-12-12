package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getIncidentImage() {
		return incidentImage;
	}

	private @FindBy(xpath = "//a[@class='navbar-brand']") WebElement navBarText;
	private @FindBy(xpath = "//button[@class='btnLoginButtonNew']") WebElement profileIconButton;
	private @FindBy(xpath = "//p[text()='Policies']") WebElement policiesText;
	private @FindBy(xpath = "//p[text()='HIPAA']") WebElement hipaaText;
	private @FindBy(id = "Policy_Active") WebElement policyImage;
	private @FindBy(id = "HIPAA_Active") WebElement hipaaImage;
	private @FindBy(id = "Contract_Active") WebElement contractImage;
	private@FindBy(xpath = "//p[text()='Incidents']") WebElement incidentText;
	private @FindBy(id = "Incident_Active") WebElement incidentImage;

	public WebElement getContractImage() {
		return contractImage;
	}

	public WebElement getNavBarText() {
		return navBarText;
	}

	public WebElement getIncidentText() {
		return incidentText;
	}


	public WebElement getProfileIconButton() {
		return profileIconButton;
	}

	public WebElement getPoliciesText() {
		return policiesText;
	}

	public WebElement getHipaaText() {
		return hipaaText;
	}

	public WebElement getPolicyImage() {
		return policyImage;
	}

	public WebElement getHipaaImage() {
		return hipaaImage;
	}

}
