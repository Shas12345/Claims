package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelfRiskAssessmentQuestionPage {
	public SelfRiskAssessmentQuestionPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTableHeaderText() {
		return tableHeaderText;
	}

	public WebElement getAddQuestionButton() {
		return addQuestionButton;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getQuestionLabel() {
		return questionLabel;
	}

	public WebElement getQuestionTextBox() {
		return questionTextBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	private @FindBy(xpath = "//div[@class='table-header']") WebElement tableHeaderText;
	private @FindBy(id = "AddQuestionsButton") WebElement addQuestionButton;
	private @FindBy(xpath = "//button[@title='Close']") WebElement closeButton;
	private @FindBy(xpath = "//label[contains(text(),'Questions')]") WebElement questionLabel;
	private @FindBy(id = "Questions") WebElement questionTextBox;
	private @FindBy(id = "saveSRiskQuestionBtn") WebElement saveButton;
	private @FindBy(xpath = "//label[text()='Search:']")WebElement searchLabel;
	private @FindBy(xpath = "//input[@type='search']")WebElement searchTextBox;
	public WebElement getSearchTextBox() {
		return searchTextBox;
	}

	public WebElement getSearchLabel() {
		return searchLabel;
	}

	public WebElement getFailureMessage() {
		return failureMessage;
	}

	private @FindBy(xpath = "(//div[@class='form-group ui-dialog-content ui-widget-content'])[4]")WebElement failureMessage;

}
