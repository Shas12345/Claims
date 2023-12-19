package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnologyRiskAssessmentPage {
	public TechnologyRiskAssessmentPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	private @FindBy(xpath = "//a[@class='navbar-brand']" )WebElement technologyPageTitle;
	private @FindBy(xpath = "//div[@class='v']") WebElement editTechnologyRiskPage;
	private @FindBy(id = "ui-id-15") WebElement errorMsg ;
	private @FindBy(xpath = "(//div[@class='widget-header widget-header-small'])[8]") WebElement failureMessage;
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	public WebElement getFailureMessage() {
		return failureMessage;
	}
	public WebElement getEditTechnologyRiskPage() {
		return editTechnologyRiskPage;
	}
	public WebElement getTechnologyPageTitle() {
		return technologyPageTitle;
		
	}
	

}
