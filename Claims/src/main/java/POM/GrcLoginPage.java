package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GrcLoginPage {

	public GrcLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private @FindBy(id = "id-text2") WebElement grcText;
	private @FindBy(id = "id-company-text") WebElement companyText;
	private @FindBy(xpath = "//i[contains(@class,'ace-icon fa fa-coffee green')]") WebElement coffeeLogoImage;
	private @FindBy(id = "UserId") WebElement userIdTextBox;
	private @FindBy(xpath = "//div[text()='Please enter a UserId.']") WebElement userIdValidation;
	private @FindBy(id = "Password") WebElement passwordTextBox;
	private @FindBy(xpath = "//div[text()='Please enter a Password.']") WebElement passwordValidaton;
	private @FindBy(id = "login") WebElement loginButton;
	private @FindBy(xpath = "//div[@class='bootstrap-growl alert alert-danger alert-dismissible']") WebElement alertPopup;
	private @FindBy(xpath = "//button[@class='close']") WebElement closeButtonOnAlertPopup;
	private @FindBy(partialLinkText = "I forgot my password") WebElement forgotPasswordLink;

	public WebElement getGrcText() {
		return grcText;
	}

	public WebElement getCompanyText() {
		return companyText;
	}

	public WebElement getCoffeeLogoImage() {
		return coffeeLogoImage;
	}

	public WebElement getUserIdTextBox() {
		return userIdTextBox;
	}

	public WebElement getUserIdValidation() {
		return userIdValidation;
	}

	public WebElement getPasswordTextBox() {
		return passwordTextBox;
	}

	public WebElement getPasswordValidaton() {
		return passwordValidaton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getAlertPopup() {
		return alertPopup;
	}

	public WebElement getCloseButtonOnAlertPopup() {
		return closeButtonOnAlertPopup;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

}